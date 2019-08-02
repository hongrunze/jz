package com.jz.utils;

import com.jz.model.RelationJzaj;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.util.ResourceUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServiceResultHelper {

    public static void main(String[] args) throws  Exception {

        SAXReader saxReader = new SAXReader();
        org.dom4j.Document doucment = saxReader.read(ResourceUtils.getFile("D:\\jz\\src\\main\\resources\\data\\data.xml"));
        String xml=doucment.asXML();

        Pattern p = Pattern.compile("\n");
        Matcher m = p.matcher(xml);
        String dest = m.replaceAll("");

        Node node=ServiceResultHelper.getServiceID(dest);
        System.out.println(node.getNodeName());
        System.out.println(node.getTextContent());

        String[][] data = ServiceResultHelper.xmlString2StringArray(dest);

        System.out.println("=========111");
        System.out.println("=========222");

        if(data.length>0){//获取返回的行数
            for(int i=0;i<data.length;i++){
                int ajbh=0;
                int gljqbh=0;
                int ajmc=0;
                int ajlb=0;
                int sldw=0;
                int fasjd=0;
                int zbrxm=0;
                int sary=0;
                int cjlb=0;
                int cjrbh=0;
                int cjrxm=0;
                int cjdwbm=0;
                int cjdwmc=0;
                int cjsj=0;
                int afdi=0;
                int cljqnr=0;
                int glsp=0;
                int inserttime=0;
                int glgs=0;

                if(i==0){//获取字段名称位置
                    for(int j=0;j<data[0].length;j++){
                        if( data[0][j].equals("ajbh")){//案件编号
                            ajbh=j;
                            break;
                        }
                        if( data[0][j].equals("gljqbh")){//关联警情编号
                            gljqbh=j;
                            break;
                        }
                        if( data[0][j].equals("ajmc")){//案件名称
                            ajmc=j;
                            break;
                        }
                        if( data[0][j].equals("ajlb")){//案件类别
                            ajlb=j;
                            break;
                        }
                        if( data[0][j].equals("sldw")){//受理单位
                            sldw=j;
                            break;
                        }
                        if( data[0][j].equals("fasjd")){//案发时间
                            fasjd=j;
                            break;
                        }
                        if( data[0][j].equals("zbrxm")){//办案人员
                            zbrxm=j;
                            break;
                        }
                        if( data[0][j].equals("sary")){//涉案人员
                            sary=j;
                            break;
                        }
                        if( data[0][j].equals("cjlb")){//处警类别
                            cjlb=j;
                            break;
                        }
                        if( data[0][j].equals("cjrbh")){//处警人警号
                            cjrbh=j;
                            break;
                        }
                        if( data[0][j].equals("cjrxm")){//处警人姓名
                            cjrxm=j;
                            break;
                        }
                        if( data[0][j].equals("cjdwbm")){//处警单位代码
                            cjdwbm=j;
                            break;
                        }
                        if( data[0][j].equals("cjdwmc")){//处警单位名称
                            cjdwmc=j;
                            break;
                        }
                        if( data[0][j].equals("cjsj")){//处警时间
                            cjsj=j;
                            break;
                        }
                        if( data[0][j].equals("afdi")){//发生地点
                            afdi=j;
                            break;
                        }
                        if( data[0][j].equals("cljqnr")){//案情及处理
                            cljqnr=j;
                            break;
                        }
                        if( data[0][j].equals("glsp")){//相关联视频
                            glsp=j;
                            break;
                        }
                        if( data[0][j].equals("inserttime")){//记录插入时间
                            inserttime=j;
                            break;
                        }
                        if( data[0][j].equals("glgs")){//关联个数
                            glgs=j;
                            break;
                        }
                    }
                }
                if(i>2){
                    for(int j=0;j<data[i].length;j++){
                        RelationJzaj model=new RelationJzaj();
                        model.setAjbh(data[i][ajbh]);
                        model.setGljqbh(data[i][gljqbh]);
                        model.setAjmc(data[i][ajmc]);
                        model.setAjlb(data[i][ajlb]);
                        model.setSldw(data[i][sldw]);
                        model.setAfsj(data[i][fasjd]);
                        model.setBary(data[i][zbrxm]);
                        model.setSary(data[i][sary]);
                        model.setCjlb(data[i][cjlb]);
                        model.setCjrbh(data[i][cjrbh]);
                        model.setCjrxm(data[i][cjrxm]);
                        model.setCjdwbm(data[i][cjdwbm]);
                        model.setCjdwmc(data[i][cjdwmc]);
                        model.setCjsj(data[i][cjsj]);
                        model.setAfdi(data[i][afdi]);
                        model.setCljqnr(data[i][cljqnr]);
                        model.setGlsp(data[i][glsp]);
                        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
                        model.setInserttime(data[i][inserttime]==null? null:simpleDateFormat.parse(data[i][inserttime]));
                        model.setGlgs(data[i][glgs]==null? null:Integer.parseInt(data[i][glgs]));

                    }
                }
            }
        }

    }

    public static Node getServiceID(String xmlText)  {
        try {
            Document doc =CallerResultParser.createXmlDoc(xmlText);
            XPathExpression expr = CallerResultParser.createXPathExpr("//ServiceID");
            Node nd = (Node)expr.evaluate(doc, XPathConstants.NODE);
            return nd;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public static String[][] xmlString2StringArray(String xml)  {
        String[][] data=new String[][]{ { }};
        try {
            data = CallerResultParser.parse(xml);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    private static class CallerResultParser{
        public static String[][] parse(String content) throws Exception{
            Document doc = createXmlDoc(content);


            XPathExpression expr = createXPathExpr("//Method/Items/Item/Value/*");
            NodeList ndList = (NodeList)expr.evaluate(doc, XPathConstants.NODESET);
            int ndCount = ndList.getLength();
            if (ndCount <= 1){
                return new String[][]{{}};
            }

            String[][] datas = null;
            int cols = 0,rows = 0;
            int rowIndex = 0;
            for(int i=0;i<ndCount;i++ ){
                Node nd = ndList.item(i);
                int childrenCount = getChildrenNodeCount(nd.getChildNodes());
//				System.out.print(String.format("name=%s, value=%s, text=%s, children=%d",
//						nd.getNodeName(),nd.getNodeValue(),nd.getTextContent().trim(), childrenCount));
                NodeList valNdList = nd.getChildNodes();
                if (i == 0){
                    rows = ndCount;
                    cols = getChildrenNodeCount(valNdList);
                    datas = new String[rows][cols];
                }

                int colIndex=0;
                for(int j=0;j<valNdList.getLength();j++ ){
                    Node cell = valNdList.item(j);
                    if (cell.getNodeType() != Node.ELEMENT_NODE){
                        continue;
                    }
                    String cellName = cell.getNodeName().trim();
                    String cellValue = cell.getTextContent().trim();
                    datas[rowIndex][colIndex] = cellValue;
                    colIndex++;
                }
                rowIndex++;
            }

            return datas;
        }

        private static int getChildrenNodeCount(NodeList ndList){
            int count=0;
            for(int i=0;i<ndList.getLength(); i++){
                if (ndList.item(i).getNodeType() != Node.ELEMENT_NODE){
                    continue;
                }
                count++;
            }

            return count;
        }

        private static Document createXmlDoc(String xmlText)
                throws Exception
        {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            InputSource sm = new InputSource(new StringReader(xmlText));
            return docBuilder.parse(sm);
        }

        private static XPathExpression createXPathExpr(String xpathExpr)
                throws XPathExpressionException {
            XPathFactory xPathFactory = XPathFactory.newInstance();
            XPath xPath = xPathFactory.newXPath();

            XPathExpression expr = xPath.compile(xpathExpr);
            return expr;
        }
    }
}
