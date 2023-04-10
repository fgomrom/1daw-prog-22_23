package org.ieslosremedios.daw1.prog.ut7.clases_de_flujos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FlujoFicheroBinario {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            // Crear Stream
            fileOutputStream = new FileOutputStream("FlujoFicheroBinario.bin");
            // Escribir el Stream
            fileOutputStream.write((byte) 'H');
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // Cerrar Stream
            if (fileOutputStream != null)
                fileOutputStream.close();
        }
    }
}
