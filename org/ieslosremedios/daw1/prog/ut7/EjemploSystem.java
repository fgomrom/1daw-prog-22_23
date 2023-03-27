package org.ieslosremedios.daw1.prog.ut7;

import java.io.IOException;
import java.util.Scanner;

public class EjemploSystem {
    public static void main(String[] args) throws IOException {

       System.out.println("Introduzca 4 caracteres: ");
        int c1 = System.in.read();
        int c2 = System.in.read();
        int c3 = System.in.read();
        int c4 = System.in.read();

        // Escribimos en el flujo de datos de salida el int que representa el byte introducido por teclado en el flujo
        // de entrada de datos.
        System.out.write(c1);
        // Volcamos el flujo de datos de salida en la consola
        System.out.flush();

        // Estamos imprimiendo el byte introducido por teclado en el flujo de datos
        System.out.print(c2); // Aunque no hubíesemos puesto el flush, este print ya haría un flush internamente
        // Si queremos imprimir su representación en caracter Unicode, lo convertimos a char
        System.out.print((char)c2);
        System.out.println((char)c3);
        System.out.printf("%c", c4);

        // Dado que el write trabaja con bytes, si quisieramos pasarle un String habría que convertir a array de bytes
        System.out.write("Hola".getBytes());

        // Lo anterior por pasos:
        String outputStream = "Hola";
        byte[] byteOutputStream = outputStream.getBytes();
        System.out.write(byteOutputStream);
        System.out.flush();

    }
}
