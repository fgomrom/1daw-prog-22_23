package org.ieslosremedios.daw1.prog.ut4.arrays;

import java.util.Arrays;

public class EjemploArrayFill {
    public static void main(String[] args) {
        int[] a = new int[5];
        Arrays.fill(a, 7);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 1,4,3);
        System.out.println(Arrays.toString(a));

        int[][] b = new int[5][5];
        Arrays.fill(b[1],7);
        System.out.println(Arrays.toString(b));
    }
}
