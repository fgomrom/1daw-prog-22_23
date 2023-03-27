package org.ieslosremedios.daw1.prog.ut7;

import java.io.IOException;

/**
 * Si queremos leer hasta que se introduzca el caracter de retorno de carro,
 * porque no sabemos cuántos bytes va a introducir el usuario, en lugar de poner
 * varios read, ponemos un bucle.
 */
public class EjemploSystemBucle {
    public static void main(String args[]) throws IOException {
        int c;
        int contador = 0;
        // se lee hasta encontrar el fin de línea
        while ((c = System.in.read()) != '\n') {
            contador++;
            System.out.print((char) c);
        }
        System.out.println(); // Se escribe el fin de línea
        System.err.println("Contados " + contador + " bytes en total.");
    }
}
