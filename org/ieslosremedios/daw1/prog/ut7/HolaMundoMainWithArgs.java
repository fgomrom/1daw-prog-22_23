package org.ieslosremedios.daw1.prog.ut7;

import java.io.IOException;
import java.util.Scanner;

/**
 * Desde la consola podemos ejecutar: java HolaMundoMainWithArgs.java Fran
 * Todos los argumentos se le pasan separados por espacios.
 */
public class HolaMundoMainWithArgs {
    public static void main(String[] args) throws IOException {

       if (args.length > 0) {
            System.out.println("Hola: " + args[0]);
        } else {
            System.err.println("Adios: No se indicó ningún argumento.");
        }
    }
}
