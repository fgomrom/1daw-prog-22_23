package org.ieslosremedios.daw1.prog.ut6.recursividad;

public class Actividad6_2 {

    public static void main(String[] args) {
        inverso(5);
    }

    /*Ejercicio 1.
    Crea una función que imprima los números naturales en orden inverso comenzando por el
    número n.
    Ejemplo:
    Para n = 5 → 5, 4, 3, 2, 1
    */
    public static void inverso(int n) {
        if (n > 0) {
            // CASO RECURSIVO
            System.out.println(n);
            inverso(n - 1);
        }
        // CASO BASO
    }

}
