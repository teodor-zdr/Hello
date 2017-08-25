import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class hello {

    public static void main(String args[]) {
        try {
            File inputFile = new File("C:\\apps\\orders.xml");
            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element : "
                    + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("order");
            System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element : "
                        + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Order Number : "
                            + eElement.getAttribute("order-no"));
                    System.out.println("Customer Number : "
                            + eElement
                            .getElementsByTagName("customer-no")
                            .item(0)
                            .getTextContent());
                    System.out.println("Customer Names : "
                            + eElement
                            .getElementsByTagName("customer-name")
                            .item(0)
                            .getTextContent());
                    System.out.println("Customer Email : "
                            + eElement
                            .getElementsByTagName("customer-email")
                            .item(0)
                            .getTextContent());
                    System.out.println("Address : "
                            + eElement
                            .getElementsByTagName("address1")
                            .item(0)
                            .getTextContent());
                    System.out.println("Billing Name : "
                            + eElement
                            .getElementsByTagName("first-name")
                            .item(0)
                            .getTextContent());
                    System.out.println("Billing Name 2 : "
                            + eElement
                            .getElementsByTagName("last-name")
                            .item(0)
                            .getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


