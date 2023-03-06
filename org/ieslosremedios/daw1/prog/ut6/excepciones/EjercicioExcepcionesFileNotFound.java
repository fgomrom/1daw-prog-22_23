package org.ieslosremedios.daw1.prog.ut6.excepciones;

import java.io.FileReader;
import java.io.IOException;

public class EjercicioExcepcionesFileNotFound {
    public static void main(String[] args) {
        try {
            leerFichero("hola.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leerFichero(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        System.out.println(fileReader.read());
        fileReader.close();
    }
}
