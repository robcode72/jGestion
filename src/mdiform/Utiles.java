package mdiform;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

public class Utiles {

    public static void main(String argv[]) {
    }

    public String ExtractJarPath() throws UnsupportedEncodingException {
        String path = NewJFrame.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        String decodedPath = URLDecoder.decode(path, "UTF-8");
        return decodedPath;
    }

    public String[] WriteXMLConfig(String[] config) throws ParserConfigurationException, TransformerException, SAXException, IOException, XPathExpressionException {

        try {
            File file = new File("config.xml");
            DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
            DocumentBuilder b = f.newDocumentBuilder();
            Document doc = b.parse(file);

            Node node = (Node) doc.getElementsByTagName("DATABASE").item(0);
            NodeList DBnodelist = node.getChildNodes();

            for (int i = 0; i < DBnodelist.getLength(); i++) {
                
                Node element = DBnodelist.item(i);
                
                if ("HOST".equals(element.getNodeName())) {
                    element.setTextContent(config[0]);
                }
                if ("PORT".equals(element.getNodeName())) {
                    element.setTextContent(config[1]);
                }
                if ("NAME".equals(element.getNodeName())) {
                    element.setTextContent(config[2]);
                }
                
            }
            
            node = (Node) doc.getElementsByTagName("EJERCICIO").item(0); 
            NodeList nodeList = node.getChildNodes();
            Node eElement = nodeList.item(1);

            if ("AÑO".equals(eElement.getNodeName())) {
                eElement.setTextContent(config[3]);
                }
            
            
            // Write to XML file            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            // pretty print
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);

        } catch (ParserConfigurationException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return null;

    }

    public String[] ReadXMLConfig() throws ParserConfigurationException, SAXException, IOException {
        //creating a constructor of file class and parsing an XML file  
        String[] config = new String[4];
        try {
            File file = new File("config.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            NodeList nodeList = doc.getElementsByTagName("DATABASE");
            // nodeList is not iterable, so we are using for loop  
            for (int itr = 0; itr < nodeList.getLength(); itr++) {
                Node node = nodeList.item(itr);
                System.out.println("\nNode Name :" + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;
                    System.out.println(eElement.getElementsByTagName("HOST").item(0).getTextContent());
                    config[0] = eElement.getElementsByTagName("HOST").item(0).getTextContent();
                    config[1] = eElement.getElementsByTagName("PORT").item(0).getTextContent();
                    config[2] = eElement.getElementsByTagName("NAME").item(0).getTextContent();
                }
            
                nodeList = doc.getElementsByTagName("EJERCICIO");
                node = nodeList.item(0);
                System.out.println("\nNode Name :" + node.getNodeName());
                
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    
                    Element eElement = (Element) node;
                    config[3] = eElement.getElementsByTagName("AÑO").item(0).getTextContent();
                }
            }


        } catch (IOException | ParserConfigurationException | DOMException | SAXException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return config;
    }

    // *********************
    // Comprobar conexión a Oracle
    // *********************
    public Boolean CheckOracleConecction(String username, String pass) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con_oracle = null;
            con_oracle = DriverManager.getConnection(NewJFrame.dbURL, username, pass);

            con_oracle.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
