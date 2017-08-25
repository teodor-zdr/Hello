import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class File {

    public static void main(String args[]) throws ParserConfigurationException, IOException, SAXException {
        java.io.File inputFile = new java.io.File("C:\\apps\\test.xml");
        System.out.println(inputFile);
        DocumentBuilderFactory dbFactory
                = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);

        doc.getDocumentElement().normalize();
        System.out.println(doc.getElementsByTagName("marks"));
    }
}
