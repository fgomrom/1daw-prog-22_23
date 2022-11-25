package org.ieslosremedios.daw1.prog.ut2;

public class EjemploWhile {
    public static void main(String[] args) {
        
        for (int i = 5; i > 0 ; i--) {
            System.out.println("i: " + i);
        }

        int i = 1;
        do {
            System.out.println("i: " + i);
            i++;
        } while (i <= 5);

       
    }
}
