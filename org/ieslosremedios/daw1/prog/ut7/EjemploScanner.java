package org.ieslosremedios.daw1.prog.ut7;

import java.io.IOException;
import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) throws IOException {

        // Lee una línea completa (hasta el retorno de carro)
        System.out.println("Introduzca su nombre: ");
        Scanner scannerInPut = new Scanner(System.in);
        String nombre = scannerInPut.nextLine();
        System.out.println("Hola, " + nombre + "!");

        // Lee tres tokens (palabras separadas por espacio) por separado
        System.out.println("Introduzca su nombre y apellidos: ");
        nombre = scannerInPut.next();
        String apellido1 = scannerInPut.next();
        String apellido2 = scannerInPut.next();
        System.out.printf("Hola, %s %s %s!", nombre, apellido1, apellido2);

        // Lee dos tokens, el primero como tipo String y el segundo como tipo int
        System.out.println("Introduzca su nombre y edad: ");
        nombre = scannerInPut.next();
        int edad = scannerInPut.nextInt(); // Lanza una InputMismatchException si se introduce un caracter no entero
        System.out.printf("Hola, %s %d!", nombre, edad);

    }
}
