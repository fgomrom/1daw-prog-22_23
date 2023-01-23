package org.ieslosremedios.daw1.prog.ut4.arrays;

public class ArraysExample {
    public static void main(String[] args) {

        int [][] enteros = {{1,2},{3,4},{5,6}};
        enteros[0][0] = 1;
        enteros[0][1] = 2;



        System.out.println(enteros[1]); // 5


        int x = 1;
        int y = 2;
        String z = "hola";
        Double[] arrayDeEntrada = {1d,2d,3d};
        int[][] datosRetorno = metodo(x, y, z, arrayDeEntrada);
    }

    static int[][] metodo (int x, int y, String z, Double[] arrayDeEntrada) {
        return new int[2][2];
    }
}
