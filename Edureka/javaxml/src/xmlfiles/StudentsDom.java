package xmlfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class StudentsDom {

	public StudentsDom() {

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        try {
        File xmlFile = new File(System.getProperty("user.dir")+
		"\\src\\xmlfiles\\students.xml");
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = factory.newDocumentBuilder();
        Document doc = dBuilder.parse(xmlFile);

        doc.getDocumentElement().normalize();

        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

        NodeList nList = doc.getElementsByTagName("student");

        for (int i = 0; i < nList.getLength(); i++) {

            Node nNode = nList.item(i);

            System.out.println("\nCurrent Element: " + nNode.getNodeName());

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element elem = (Element) nNode;

                String uid = elem.getAttribute("id");

                Node node1 = elem.getElementsByTagName("name").item(0);
                String name = node1.getTextContent();

                Node node2 = elem.getElementsByTagName("std").item(0);
                String std = node2.getTextContent();

                Node node3 = elem.getElementsByTagName("gender").item(0);
                String gender = node3.getTextContent();

                Node node4 = elem.getElementsByTagName("marks").item(0);
                String marks = node4.getTextContent();
                
                Node node5 = elem.getElementsByTagName("address").item(0);
                String address = node5.getTextContent();
                
                System.out.printf("Student id: %s%n", uid);
                System.out.printf("Name: %s%n", name);
                System.out.printf("Standard: %s%n", std);
                System.out.printf("Gender: %s%n", gender);
                System.out.printf("Marks: %s%n", marks);
                System.out.printf("Address: %s%n", address);
                
            }
        }// TODO Auto-generated method stub
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
			
	}		
}
}