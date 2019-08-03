package com.jz.serviceUtil;

import com.fwjk.caller.QueryCaller;
import com.jz.model.RelationJzaj;
import com.jz.model.RelationJzjq;
import com.jz.utils.ServiceResultHelper;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;
import org.w3c.dom.Node;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 警情信息
 */
public class WbfwQueryJqUtil {

    private static final Logger logger = LoggerFactory.getLogger(WbfwQueryJqUtil.class);

    /**
     * 江苏省厅总线服务节点1
     */
    private static final String ST_NODE_URL = "http://10.36.159.78:8585/node";

    public static List<RelationJzjq> callDxyhdjzl(int rowNum,Date startTime) throws Exception{
        logger.info("WbfwQueryUtil callDxyhdjzl begin");
        String pkiId = "";
        String SenderID = "";// 请求方编号 。
        String ServiceID = "";// 服务方编号。
        String zdyhGmsfhm = ""; //终端用户身份证 。
        String zdyhXm = "";//终端用户姓名。
        String zdyhDwbm = "";//终端用户单位编码。
        String zdyhDwmc = "";// 终端用户单位名称。
        String xtmc = "";// 终端系统名称。
        String zdyhJh = "";//终端用户警号。
        String zdyhIp = "";// 终端用户IP地址。
        String zdyhMac = "";// 终端用户MAC地址。
        String methodName ="";//请求服务方法名
        String condition="";//查询条件
        try {
            //解析配置文件信息
            SAXReader saxReader = new SAXReader();
            Document doucment = saxReader.read(ResourceUtils.getFile("classpath:service_request_config_jq.xml"));
            Element root = doucment.getRootElement();// 得到根节点

            for (Iterator i = root.elementIterator(); i.hasNext();) {
                Element configEle = (Element) i.next();
                if(configEle.getName().equals("pkiId")){
                    pkiId=configEle.getText();
                }
                if(configEle.getName().equals("SenderID")){
                    SenderID=configEle.getText();
                }
                if(configEle.getName().equals("ServiceID")){
                    ServiceID=configEle.getText();
                }
                if(configEle.getName().equals("zdyhGmsfhm")){
                    zdyhGmsfhm=configEle.getText();
                }
                if(configEle.getName().equals("zdyhXm")){
                    zdyhXm=configEle.getText();
                }
                if(configEle.getName().equals("zdyhDwbm")){
                    zdyhDwbm=configEle.getText();
                }
                if(configEle.getName().equals("zdyhDwmc")){
                    zdyhDwmc=configEle.getText();
                }
                if(configEle.getName().equals("xtmc")){
                    xtmc=configEle.getText();
                }
                if(configEle.getName().equals("zdyhJh")){
                    zdyhJh=configEle.getText();
                }
                if(configEle.getName().equals("zdyhIp")){
                    zdyhIp=configEle.getText();
                }
                if(configEle.getName().equals("zdyhMac")){
                    zdyhMac=configEle.getText();
                }
                if(configEle.getName().equals("methodName")){
                    methodName=configEle.getText();
                }
                if(configEle.getName().equals("condition")){
                    condition=configEle.getText();
                }
            }

        } catch (Exception e) {
            logger.error("callDxyhdjzl error",e);
            throw new RuntimeException("未获取调用接口信息");
        }
        logger.info("WbfwQueryUtil 参数解析完成");

        // 基本参数,总线节点地址2
        String nodeUrl = ST_NODE_URL;
        int startRow=0;
        int numRow=rowNum;//每次同步2000条
        QueryCaller caller = new QueryCaller(nodeUrl, SenderID, ServiceID, zdyhGmsfhm, zdyhXm, zdyhDwbm,
                zdyhDwmc, zdyhJh, xtmc, zdyhIp, zdyhMac);
        if(condition.equals("")){
            condition+=" and DJSJ>="+startTime+" ";
        }else{
            condition+=" and DJSJ>"+startTime+" ";
        }
        String result = caller.query(condition, startRow, numRow);
        logger.info(">>>[callQuery]查询结果" + result);

        //SAXReader saxReader = new SAXReader();
        //org.dom4j.Document doucment = saxReader.read(ResourceUtils.getFile("D:\\police_jz\\src\\main\\resources\\data\\data.xml"));
        //String result=doucment.asXML();

        Pattern p = Pattern.compile("\n");
        Matcher m = p.matcher(result);
        String dest = m.replaceAll("");

        Node node=ServiceResultHelper.getServiceID(dest);//得到serviceId节点
        logger.info(node.getNodeName());
        logger.info(node.getTextContent());
        List<RelationJzjq> models=null;
        //案件基本信息表数据查询解析
        if("S32-10000124".equals(node.getTextContent())){
            //解析结果
            String[][] data = ServiceResultHelper.xmlString2StringArray(dest);

            models=getJqByData(data);
            logger.info("=========");
            logger.info("=========");
        }

        //String countResult = caller.queryCount(condition);
        //logger.info(">>>[callQuery]总数：" + countResult);

        logger.info("WbfwQueryUtil callDxyhdjzl end");
        return models;
    }

    private static List<RelationJzjq> getJqByData(String[][] data){
        List<RelationJzjq> modes=new ArrayList<RelationJzjq>();
        if(data.length>0){//获取返回的行数
            int jqbh  =-1;//警情编号
            int jqlb  =-1;//警情类别
            int jqly  =-1;//警情来源
            int bjlx  =-1;//报警类型
            int cjbs  =-1;//处警标识
            int glaj  =-1;//关联案件编号
            int jjrbh =-1;//接警人编号
            int jjrxm =-1;//接警人姓名
            int bjr   =-1;//报警人
            int bjnr  =-1;//报警内容
            int sfdd  =-1;//事发地点
            int lxdh  =-1;//报警人联系电话
            int bjrdz =-1;//报警人住址
            int jjdw  =-1;//接警单位
            int cjdw  =-1;//处警单位
            int cjmj  =-1;//处警民警账号
            int cjmjxm=-1;//处警民警姓名
            int glsp  =-1;//相关联视频
            int bjdhsj=-1;//报警时间
            int jjrqsj=-1;//接警日期时间
            int ddxcsj=-1;//现场到达时间
            int cjsj  =-1;//处警时间
            int djsj  =-1;//处警登记时间
            int inserttime=-1;//记录插入时间
            int glgs =-1;// 关联个数

            for(int i=0;i<data.length;i++){
                if(i==0){//获取字段名称位置
                    for(int j=0;j<data[0].length;j++){
                        if(("jqbh").toUpperCase().equals(data[0][j])){//警情编号
                            jqbh=j;
                            continue;
                        }
                        if("jqlb".toUpperCase().equals(data[0][j])){//警情类别
                            jqlb=j;
                            continue;
                        }
                        if("jqly".toUpperCase().equals(data[0][j])){//警情来源
                            jqly=j;
                            continue;
                        }
                        if("bjlx".toUpperCase().equals(data[0][j])){//报警类型
                            bjlx=j;
                            continue;
                        }
                        if("cjbs".toUpperCase().equals(data[0][j])){//处警标识
                            cjbs=j;
                            continue;
                        }
                        if("glaj".toUpperCase().equals(data[0][j])){//关联案件编号
                            glaj=j;
                            continue;
                        }
                        if("jjrbh".toUpperCase().equals(data[0][j])){//接警人编号
                            jjrbh=j;
                            continue;
                        }
                        if("jjrxm".toUpperCase().equals(data[0][j])){//接警人姓名
                            jjrxm=j;
                            continue;
                        }
                        if("bjr".toUpperCase().equals(data[0][j])){//报警人
                            bjr=j;
                            continue;
                        }
                        if("bjnr".toUpperCase().equals(data[0][j])){//报警内容
                            bjnr=j;
                            continue;
                        }
                        if("sfdd".toUpperCase().equals(data[0][j])){//事发地点
                            sfdd=j;
                            continue;
                        }
                        if("lxdh".toUpperCase().equals(data[0][j])){//报警人联系电话
                            lxdh=j;
                            continue;
                        }
                        if("bjrdz".toUpperCase().equals(data[0][j])){//报警人住址
                            bjrdz=j;
                            continue;
                        }
                        if("jjdw".toUpperCase().equals(data[0][j])){//接警单位
                            jjdw=j;
                            continue;
                        }
                        if("cjdw".toUpperCase().equals(data[0][j])){//处警单位
                            cjdw=j;
                            continue;
                        }

                        if("cjmj".toUpperCase().equals(data[0][j])){//处警民警账号
                            cjmj=j;
                            continue;
                        }
                        if("cjmjxm".toUpperCase().equals(data[0][j])){//处警民警姓名
                            cjmjxm=j;
                            continue;
                        }
                        if("glsp".toUpperCase().equals(data[0][j])){//相关联视频
                            glsp=j;
                            continue;
                        }
                        if("bjdhsj".toUpperCase().equals(data[0][j])){//报警时间
                            bjdhsj=j;
                            continue;
                        }
                        if("jjrqsj".toUpperCase().equals(data[0][j])){//接警日期时间
                            jjrqsj=j;
                            continue;
                        }
                        if("ddxcsj".toUpperCase().equals(data[0][j])){//现场到达时间
                            ddxcsj=j;
                            continue;
                        }
                        if("cjsj".toUpperCase().equals(data[0][j])){//处警时间
                            cjsj=j;
                            continue;
                        }
                        if("djsj".toUpperCase().equals(data[0][j])){//处警登记时间
                            djsj=j;
                            continue;
                        }
                        if("inserttime".toUpperCase().equals(data[0][j])){//记录插入时间
                            inserttime=j;
                            continue;
                        }
                        if("glgs".toUpperCase().equals(data[0][j])){//关联个数
                            glgs=j;
                            continue;
                        }
                    }
                }

                if(i>2){//根据字段位置获取值
                    RelationJzjq model=new RelationJzjq();
                    for(int j=0;j<data[i].length;j++){
                        model.setJqbh(jqbh==-1? null:data[i][jqbh]);
                        model.setJqlb(jqlb==-1? null:data[i][jqlb]);
                        model.setJqly(jqly==-1? null:data[i][jqly]);
                        model.setBjlx(bjlx==-1? null:data[i][bjlx]);
                        model.setCjbs(cjbs==-1? null:data[i][cjbs]);
                        model.setGlaj(glaj==-1? null:data[i][glaj]);
                        model.setJjrbh(jjrbh==-1? null:data[i][jjrbh]);
                        model.setJjrxm(jjrxm==-1? null:data[i][jjrxm]);
                        model.setBjr(bjr==-1? null:data[i][bjr]);
                        model.setBjnr(bjnr==-1? null:data[i][bjnr]);
                        model.setSfdd(sfdd==-1? null:data[i][sfdd]);
                        model.setLxdh(lxdh==-1? null:data[i][lxdh]);
                        model.setBjrdz(bjrdz==-1? null:data[i][bjrdz]);
                        model.setJjdw(jjdw==-1? null:data[i][jjdw]);
                        model.setCjdw(cjdw==-1? null:data[i][cjdw]);
                        model.setCjmj(cjmj==-1? null:data[i][cjmj]);
                        model.setCjmjxm(cjmjxm==-1? null:data[i][cjmjxm]);
                        model.setGlsp(glsp==-1? null:data[i][glsp]);
                        if(djsj!=-1&&data[i][djsj]!=null){
                            try{
                                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmmss");
                                Date djsjTime=simpleDateFormat.parse(data[i][djsj]);
                                model.setDjsj(djsjTime);
                            }catch (Exception ex){
                                logger.error("登记时间转换失败",ex);
                            }
                        }

                        /*SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmmss");
                        model.setBjdhsj(jqbh==-1? null:data[i][jqbh]);
                        model.setJjrqsj(jqbh==-1? null:data[i][jqbh]);
                        model.setDdxcsj(jqbh==-1? null:data[i][jqbh]);
                        model.setCjsj(jqbh==-1? null:data[i][jqbh]);

                        model.setInserttime(jqbh==-1? null:data[i][jqbh]);
                        model.setGlgs(glgs==-1? null:data[i][glgs]);*/


                    }
                    modes.add(model);
                }
            }
        }
        return modes;
    }



}
