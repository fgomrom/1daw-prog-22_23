package org.ieslosremedios.daw1.prog.ut7.serializacion;

import java.io.*;

public class TestSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Creo objeto que voy a serialziar para escribirlo en un fichero
        ObjetoSerializable os1 =  new ObjetoSerializable(5,5,5);

        // Creo fichero
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Fran Gómez\\Downloads\\Nueva carpeta\\objeto.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Serializar el objeto
        oos.writeObject(os1);

        // Cierro el flujo para que se escriba en el fichero
        oos.close();

        // Leer fichero al Objeto
        FileInputStream fis = new FileInputStream("C:\\Users\\Fran Gómez\\Downloads\\Nueva carpeta\\objeto.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Desearizar el contenido del fichero (bytes) a un Object
        ObjetoSerializable osSalida = (ObjetoSerializable)ois.readObject();

        System.out.println("Atributo 1: " + osSalida.atributo1);
        System.out.println("Atributo 2: " + osSalida.atributo2);
        System.out.println("Atributo 3: " + osSalida.atributo3);

        ois.close();
    }
}
