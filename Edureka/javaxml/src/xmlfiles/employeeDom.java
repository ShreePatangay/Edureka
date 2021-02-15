package xmlfiles;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class employeeDom {

	public employeeDom() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		  File xmlFile = new File(System.getProperty("user.dir")+
					"\\src\\xmlfiles\\employees.xml");
			        
			        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			        DocumentBuilder dBuilder = factory.newDocumentBuilder();
			        Document doc = dBuilder.parse(xmlFile);

			        doc.getDocumentElement().normalize();

			        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

			        NodeList nList = doc.getElementsByTagName("employee");

			        for (int i = 0; i < nList.getLength(); i++) {

			            Node nNode = nList.item(i);

			            System.out.println("\nCurrent Element: " + nNode.getNodeName());

			            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			                Element elem = (Element) nNode;

			                String eid = elem.getAttribute("id");

			                Node node1 = elem.getElementsByTagName("name").item(0);
			                String name = node1.getTextContent();

			                Node node2 = elem.getElementsByTagName("dept").item(0);
			                String dept = node2.getTextContent();
			                
			                System.out.printf("Employee id: %s%n", eid);
			                System.out.printf("name: %s%n", name);
			                System.out.printf("dept: %s%n", dept);
			                
			            }
			        }// TODO Auto-generated method stub

	}

}
