package com.jz.serviceUtil;

import com.fwjk.caller.QueryCaller;
import com.fwjk.caller.ResourceServiceException;
import com.jz.model.RelationJzaj;
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

public class WbfwQueryUtil {

    private static final Logger logger = LoggerFactory.getLogger(WbfwQueryUtil.class);

    /**
     * 江苏省厅总线服务节点1
     */
    private static final String ST_NODE_URL = "http://10.36.159.78:8585/node";

    public static List<RelationJzaj> callDxyhdjzl() throws Exception{
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
            Document doucment = saxReader.read(ResourceUtils.getFile("classpath:service_request_config.xml"));
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

        // 基本参数,总线节点地址
        String nodeUrl = ST_NODE_URL;
        int startRow=0;
        int numRow=20;
        QueryCaller caller = new QueryCaller(nodeUrl, SenderID, ServiceID, zdyhGmsfhm, zdyhXm, zdyhDwbm,
                zdyhDwmc, zdyhJh, xtmc, zdyhIp, zdyhMac);
        //String result = caller.query(condition, startRow, numRow);
        //logger.info(">>>[callQuery]查询结果" + result);

        SAXReader saxReader = new SAXReader();
        org.dom4j.Document doucment = saxReader.read(ResourceUtils.getFile("D:\\jz\\src\\main\\resources\\data\\data.xml"));
        String result=doucment.asXML();

        Pattern p = Pattern.compile("\n");
        Matcher m = p.matcher(result);
        String dest = m.replaceAll("");

        Node node=ServiceResultHelper.getServiceID(dest);//得到serviceId节点
        logger.info(node.getNodeName());
        logger.info(node.getTextContent());
        List<RelationJzaj> models=null;
        //案件基本信息表数据查询解析
        if("S32-10000121".equals(node.getTextContent())){
            //解析结果
            String[][] data = ServiceResultHelper.xmlString2StringArray(dest);

            models=getAjByData(data);
            logger.info("=========");
            logger.info("=========");
        }

        //String countResult = caller.queryCount(condition);
        //logger.info(">>>[callQuery]总数：" + countResult);

        logger.info("WbfwQueryUtil callDxyhdjzl end");
        return models;
    }

    private static List<RelationJzaj> getAjByData(String[][] data){
        List<RelationJzaj> modes=new ArrayList<RelationJzaj>();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        if(data.length>0){//获取返回的行数
            int ajbh=-1;
            int gljqbh=-1;
            int ajmc=-1;
            int ajlb=-1;
            int sldw=-1;
            int fasjd=-1;
            int zbrxm=-1;
            int cjrbh=-1;
            int cjrxm=-1;
            int cjdwbm=-1;
            int cjdwmc=-1;
            int cjsj=-1;
            int afdi=-1;
            int cljqnr=-1;

            for(int i=0;i<data.length;i++){
                if(i==0){//获取字段名称位置
                    for(int j=0;j<data[0].length;j++){
                        if(("ajbh").toUpperCase().equals(data[0][j])){//案件编号
                            ajbh=j;
                            continue;
                        }
                        if("zajbh".toUpperCase().equals(data[0][j])){//关联警情编号
                            gljqbh=j;
                            continue;
                        }
                        if("ajmc".toUpperCase().equals(data[0][j])){//案件名称
                            ajmc=j;
                            continue;
                        }
                        if("ajlb".toUpperCase().equals(data[0][j])){//案件类别
                            ajlb=j;
                            continue;
                        }
                        if("sldw".toUpperCase().equals(data[0][j])){//受理单位
                            sldw=j;
                            continue;
                        }
                        if("fxsjsx".toUpperCase().equals(data[0][j])){//案发时间
                            fasjd=j;
                            continue;
                        }
                        if("zbrxm".toUpperCase().equals(data[0][j])){//办案人员
                            zbrxm=j;
                            continue;
                        }
                        /*if("sary".toUpperCase().equals(data[0][j])){//涉案人员
                            sary=j;
                            continue;
                        }
                        if("cjlb".toUpperCase().equals(data[0][j])){//处警类别
                            cjlb=j;
                            continue;
                        }*/
                        if("cjrbh".toUpperCase().equals(data[0][j])){//处警人警号
                            cjrbh=j;
                            continue;
                        }
                        if("cjrxm".toUpperCase().equals(data[0][j])){//处警人姓名
                            cjrxm=j;
                            continue;
                        }
                        if("sldw".toUpperCase().equals(data[0][j])){//处警单位代码
                            cjdwbm=j;
                            continue;
                        }
                        if("sldwmc".toUpperCase().equals(data[0][j])){//处警单位名称
                            cjdwmc=j;
                            continue;
                        }
                        if("slsj".toUpperCase().equals(data[0][j])){//处警时间
                            cjsj=j;
                            continue;
                        }
                        if("ajdzmc".toUpperCase().equals(data[0][j])){//发生地点
                            afdi=j;
                            continue;
                        }
                        if("jyaq".toUpperCase().equals(data[0][j])){//案情及处理
                            cljqnr=j;
                            continue;
                        }
                        /*if("glsp".toUpperCase().equals(data[0][j])){//相关联视频
                            glsp=j;
                            continue;
                        }
                        if("inserttime".toUpperCase().equals(data[0][j])){//记录插入时间
                            inserttime=j;
                            continue;
                        }
                        if("glgs".toUpperCase().equals(data[0][j])){//关联个数
                            glgs=j;
                            continue;
                        }*/
                    }
                }
                if(i>2){//根据字段位置获取值
                    RelationJzaj model=new RelationJzaj();
                    for(int j=0;j<data[i].length;j++){
                        model.setAjbh(ajbh==-1? null:data[i][ajbh]);
                        model.setGljqbh(gljqbh==-1? null:data[i][gljqbh]);
                        model.setAjmc(ajmc==-1? null:data[i][ajmc]);
                        model.setAjlb(ajlb==-1? null:data[i][ajlb]);
                        model.setSldw(sldw==-1? null:data[i][sldw]);
                        model.setAfsj(fasjd==-1? null:data[i][fasjd]);
                        model.setBary(zbrxm==-1? null:data[i][zbrxm]);
                        //model.setSary(data[i][sary]);
                        //model.setCjlb(data[i][cjlb]);
                        model.setCjrbh(cjrbh==-1? null:data[i][cjrbh]);
                        model.setCjrxm(cjrxm==-1? null:data[i][cjrxm]);
                        model.setCjdwbm(cjdwbm==-1? null:data[i][cjdwbm]);
                        model.setCjdwmc(cjdwmc==-1? null:data[i][cjdwmc]);
                        model.setCjsj(cjsj==-1? null:data[i][cjsj]);
                        model.setAfdi(afdi==-1? null:data[i][afdi]);
                        model.setCljqnr(cljqnr==-1? null:data[i][cljqnr]);
                        //model.setGlsp(data[i][glsp]);
                        /*if(data[i][inserttime]!=null){
                            try{
                                Date inserttime1=simpleDateFormat.parse(data[i][inserttime]);
                                model.setInserttime(inserttime1);
                            }catch (Exception ex){
                                logger.error("时间转换",ex);
                            }
                        }
                        model.setGlgs(data[i][glgs]==null? null:Integer.parseInt(data[i][glgs]));*/
                    }
                    modes.add(model);
                }
            }
        }
        return modes;
    }


    /**
     * 将file所代表的xml文件，转换成xml格式的字符串，并返回转换后的xml格式的字符串
     * @param file		待转换的xml文件
     * @return			返回转换后的xml格式的字符串
     * @throws DocumentException
     */
    private static String parseXmlFileToXmlStr(File file) throws DocumentException{
        SAXReader saxReader = new SAXReader();
        Document doucment = saxReader.read(file);
        return doucment.asXML();
    }

}
