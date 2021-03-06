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

public class ReadXML {

	public static void main(String[] args) {
		try {
			//DOM
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse(new File("languages.xml"));
			Element root = document.getDocumentElement();
			NodeList list = root.getElementsByTagName("lan"); 
			for(int i=0; i<list.getLength(); i++){
				Element lan = (Element) list.item(i);
				System.out.println("---------------");
				System.out.println("id=" + lan.getAttribute("id"));

				NodeList clist = lan.getChildNodes();
				for(int j=0; j<clist.hashCode(); j++){
					Node c = clist.item(j);
					if(c instanceof Element){
						System.out.println(c.getNodeName() + "=" + c.getTextContent());
					}
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
