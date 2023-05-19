package org.ieslosremedios.daw1.prog.ut4.arrays;

import java.util.Arrays;

public class EjemploMatriz {
    public static void main(String[] args) {

        String[][] matrizDeLetras = {{"A","B","C"},{"D","E","F"},{"G","H","I"}};

        recorrerDiagonalPrimaria(matrizDeLetras);

        recorrerDiagonalSecundaria(matrizDeLetras);

        recorrerSoloFilas(matrizDeLetras);

        recorrerFilasYColumnas(matrizDeLetras);

        recorrerConWhile(matrizDeLetras);
    }

    private static void recorrerDiagonalPrimaria(String[][] matrizDeLetras) {
        for (int i = 0; i < matrizDeLetras.length; i++) {
            for (int j = 0; j < matrizDeLetras[i].length; j++) {
                if (i == j)
                    System.out.println(matrizDeLetras[i][j]);
            }
        }
    }

    private static void recorrerDiagonalSecundaria(String[][] matrizDeLetras) {
        for (int i = 0; i < matrizDeLetras.length; i++) {
            for (int j = 0; j < matrizDeLetras[i].length; j++) {
                if (i + j == matrizDeLetras.length - 1)
                    System.out.println(matrizDeLetras[i][j]);
            }
        }
    }

    private static void recorrerFilasYColumnas(String[][] matrizDeLetras) {
        for (int i = 0; i < matrizDeLetras.length; i++) {
            for (int j = 0; j < matrizDeLetras[i].length; j++) {
                System.out.println(matrizDeLetras[i][j]);
            }
        }
    }

    private static void recorrerSoloFilas(String[][] matrizDeLetras) {
        for (int i = 0; i < matrizDeLetras.length; i++) {
            System.out.println(Arrays.toString(matrizDeLetras[i]));
        }
    }

    private static void recorrerConWhile(String[][] matrizDeLetras) {
        int i = 0;
        while (i< matrizDeLetras.length) {
            int j = 0;
            while (j < matrizDeLetras.length) {
                System.out.println(matrizDeLetras[i][j]);
            }
            i++;
        }
    }
}
