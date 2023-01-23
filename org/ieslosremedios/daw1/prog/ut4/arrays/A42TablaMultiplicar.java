package org.ieslosremedios.daw1.prog.ut4.arrays;

import java.util.Arrays;

public class A42TablaMultiplicar {
    public static void main(String[] args) {
        imprimeArray(creaTablaMultiplicar(1));
    }

    static int[][] creaTablaMultiplicar (int numero) {
        int [][] tabla = new int[10][3];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i][0] = numero;
            for (int j = 0; j < tabla[i].length - 1; j++) {
                tabla[i][j + 1] = i + 1;
            }
        }
        return tabla;
    }

    static void imprimeArray (int[][] a) {
        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][0]);
                System.out.print(a[i][1]);
                System.out.print(a[i][2]);
//            }
            System.out.println();
        }
    }
}
