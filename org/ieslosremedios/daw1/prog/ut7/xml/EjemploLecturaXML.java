package org.ieslosremedios.daw1.prog.ut7.xml;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class EjemploLecturaXML {
    public static void main(String[] args) {

        // Cargamos fichero que vamos a leer
        File file = new File("org/ieslosremedios/daw1/prog/ut7/xml/ejemplo.xml");

        try {
            // Parseamos el fichero al Document
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file);

            // Accedemos al nodo raíz
            System.out.println("Elemento raiz: " + document.getDocumentElement().getNodeName());
            System.out.println("Tipo de node: " + document.getDocumentElement().getNodeType());

            // Accedemos a todos los nodos con el tag "estudiante"
            NodeList estudiantes = document.getElementsByTagName("estudiante");
            // Recorremos todos esos nodos
            for (int i = 0; i < estudiantes.getLength(); i++) {
                Node nodeEstudiante = estudiantes.item(i);
                // Filtramos todos los que son nodos de tipo elemento
                if (nodeEstudiante.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementEstudiante = (Element) nodeEstudiante;
                    System.out.println("Nombre del estudiante: " + elementEstudiante.getTextContent());
                }
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
