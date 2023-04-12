package org.ieslosremedios.daw1.prog.ut7.ficheros;

import java.io.*;

public class EjemploFile {
    public static void main(String[] args) {
        try {
            // Crear un fichero
            File miFichero = new File("C:\\Users\\Fran Gómez\\Downloads\\Nueva carpeta\\Test.txt");
            miFichero.createNewFile();

            // Crear una carpeta
            File miCarpeta = new File("C:\\Users\\Fran Gómez\\Downloads\\Nueva carpeta");
            System.out.println(miCarpeta.mkdir());

            // Elimina un fichero
            //miFichero.delete();

            // Elimina una carpeta después de haber borrado su contenido
            //miCarpeta.delete();

            // Abrir fichero en modo texto, escritura y sobreescribiendo
            FileWriter fw = new FileWriter(miFichero);
            fw.close();

            // Abrir fichero en modo texto, escritura y añadiendo al final
            fw = new FileWriter(miFichero, true);
            fw.write("Fran");
            fw.close();

            // TODO: Abrir fichero en modo binario, escritura y añadiendo al final
            FileOutputStream fos = new FileOutputStream(miFichero, true);
            fos.write(" Gómez".getBytes());
            fos.close();

            // TODO: Abrir fichero en modo texto, lectura
            FileReader fr = new FileReader(miFichero);
            int i;
            while ((i=fr.read()) != -1) {
                System.out.print((char) i);
            }

            // TODO: Abrir fichero en modo binario, lectura
            FileInputStream fis = new FileInputStream(miFichero);
            System.out.println(new String (fis.readAllBytes()));


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
