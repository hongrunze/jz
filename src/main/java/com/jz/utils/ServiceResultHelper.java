package com.jz.utils;

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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServiceResultHelper {

    public static void main(String[] args) throws  Exception {

        SAXReader saxReader = new SAXReader();
        org.dom4j.Document doucment = saxReader.read(ResourceUtils.getFile("D:\\police_jz\\src\\main\\resources\\data\\data.xml"));
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
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                if (j>0) System.out.print(",");
                System.out.println(data[i][j]);
            }
            System.out.println();
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
