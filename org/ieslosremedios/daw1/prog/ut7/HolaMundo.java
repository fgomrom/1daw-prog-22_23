package org.ieslosremedios.daw1.prog.ut7;

import java.io.IOException;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) throws IOException {

        Scanner scannerInPut = new Scanner(System.in);
        String nombre = scannerInPut.nextLine();
        System.out.println(nombre);

        /*System.out.println("Introduzca su nombre de 4 caracteres: ");
        int c1 = System.in.read();
        int c2 = System.in.read();
        int c3 = System.in.read();
        int c4 = System.in.();

        System.out.write("Hola: ".getBytes());
        System.out.write(c1);
        System.out.write(c2);
        System.out.write(c3);
        System.out.write(c4);

        System.out.flush();*/


        /*String outputStream = "Hola";
        byte[] byteOutputStream = outputStream.getBytes();
        System.out.write(byteOutputStream);
        System.out.flush();
        System.out.print("");*/

        /*if (args.length > 0) {
            System.out.println("Hola: " + args[0]);
        } else {
            System.err.println("Adios: No se indicó ningún argumento.");
        }*/
    }
}
