package org.ieslosremedios.daw1.prog.ut7.clases_de_flujos;

import java.io.FileInputStream;
import java.io.IOException;

public class LecturaFlujoFicheroBinario {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("EscrituraFlujoBufferBinario.bin");
        fileInputStream.available();
        while (fileInputStream.available() > 0 ) {
            int i = fileInputStream.read();
            System.out.println((char)i);
        }
        fileInputStream.close();
    }
}
