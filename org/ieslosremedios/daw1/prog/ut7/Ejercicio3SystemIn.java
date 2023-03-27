package org.ieslosremedios.daw1.prog.ut7;

import java.io.IOException;

/**
 * ¿Qué hace este código?
 */
public class Ejercicio3SystemIn {
    public static void main(String args[]) {
        byte b[] = new byte[5];
        try {
            System.in.read(b);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        String s = new String(b);
        System.out.println(s);
    }
}
