package org.ieslosremedios.daw1.prog.ut4.arrays;

import java.util.Arrays;

public class EjemploIntercambio {
    public static void main(String[] args) {
        int[] a = {7, -2, 5, 0, 6};
        System.out.println(Arrays.toString(intercambio(a)));
    }

    static int[] intercambio (int[] src) {
        int[] dest = src.clone();
        dest[0] = dest[dest.length - 1];
        for (int i = dest.length - 1; i > 0; i--) {
            dest[i] = dest[i-1];
        }
        return dest;
    }
}
