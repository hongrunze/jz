package com.jz.serviceUtil;

import com.fwjk.caller.QueryCaller;
import com.fwjk.caller.ResourceServiceException;
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
import java.util.Iterator;

public class WbfwQueryUtil {

    private static final Logger logger = LoggerFactory.getLogger(WbfwQueryUtil.class);

    /**
     * 江苏省厅总线服务节点
     */
    private static final String ST_NODE_URL = "http://10.36.159.78:8585/node";

    public static String callDxyhdjzl() throws ResourceServiceException{

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
        String result = caller.query(condition, startRow, numRow);
        logger.info(">>>[callQuery]查询结果" + result);

        Node node=ServiceResultHelper.getServiceID(result);//得到serviceId节点
        //案件基本信息表数据查询解析
        if("S32-10000121".equals(node.getTextContent())){
            //解析结果
            String[][] data = ServiceResultHelper.xmlString2StringArray(result);
            logger.info("=========");
            logger.info("=========");
            for(int i=0;i<data.length;i++){
                for(int j=0;j<data[i].length;j++){
                    if (j>0) logger.info(",");
                    logger.info(data[i][j]);
                }
            }
        }

        String countResult = caller.queryCount(condition);
        logger.info(">>>[callQuery]总数：" + countResult);

        logger.info("WbfwQueryUtil callDxyhdjzl end");
        return result;
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
