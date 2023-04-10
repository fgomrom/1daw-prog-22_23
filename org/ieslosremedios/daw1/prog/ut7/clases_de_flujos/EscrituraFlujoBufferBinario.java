package org.ieslosremedios.daw1.prog.ut7.clases_de_flujos;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrituraFlujoBufferBinario {
    public static void main(String[] args) {
        byte CR = 13;
        byte LF = 10;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("EscrituraFlujoBufferBinario.bin");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write("H".getBytes());
            bufferedOutputStream.write((byte)'o');
            bufferedOutputStream.write((byte)'l');
            bufferedOutputStream.write((byte)'a');
            bufferedOutputStream.write(CR);
            bufferedOutputStream.write(LF);
            bufferedOutputStream.write((byte)'l');
            bufferedOutputStream.write((byte)'a');
            bufferedOutputStream.write(CR);
            bufferedOutputStream.write(LF);
            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
