package org.ieslosremedios.daw1.prog.ut7.ficheros;

import java.io.File;
import java.io.IOException;

public class EjemploFile {
    public static void main(String[] args) {
        // Crear una carpeta
        File miCarpeta = new File("C:\\Users\\Fran Gómez\\Downloads\\Nueva carpeta");
        System.out.println(miCarpeta.mkdir());

        // Crear un fichero
        File miFichero = new File("C:\\Users\\Fran Gómez\\Downloads\\Nueva carpeta\\Test.txt");
        try {
            miFichero.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Elimina un fichero
        miFichero.delete();

        // Elimina una carpeta después de haber borrado su contenido
        miCarpeta.delete();
    }
}
