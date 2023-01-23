package org.ieslosremedios.daw1.prog.ut4.arrays;

public class A42TablaMultiplicar {
    public static void main(String[] args) {
        int[][][] tablaCompleta = new int[10][10][3];
        for (int i = 1; i <= 10; i++) {
            tablaCompleta[i-1] = creaTablaMultiplicar(i);
        }
        imprimeTablaMultiplicar(tablaCompleta);
    }

    static int[][] creaTablaMultiplicar (int numero) {
        int [][] tabla = new int[10][3];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i][0] = numero;
            tabla[i][1] = i + 1;
            tabla[i][2] = numero * tabla[i][1];
        }
        return tabla;
    }

    static void imprimeArray (int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    static void imprimeTablaMultiplicar (int[][][] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.println("Tabla del " + (i + 1));
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("%d x %d = %d %n", t[i][j][0], t[i][j][1], t[i][j][2]);
            }
        }
    }
}
