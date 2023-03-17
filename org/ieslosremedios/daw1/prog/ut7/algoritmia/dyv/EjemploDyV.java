package org.ieslosremedios.daw1.prog.ut7.algoritmia.dyv;

import java.util.Arrays;

public class EjemploDyV {
    public static void main(String[] args) {
        int[] a = {-2, -1, 3, 5, 8, 10};
        int num = 5;
        int pos = dyv(a, num);
        System.out.println("El número " + num + " está en la posición: " + pos);
    }

    private static int dyv(int[] a, int num) {
        int pos = a.length / 2;

        if (num == a[pos]) {
            return pos;
        } else if (num > a[pos]) {
            return pos + 1 + dyv(Arrays.copyOfRange(a, pos + 1, a.length), num);
        } else {
            return dyv(Arrays.copyOfRange(a, 0, pos), num);
        }
    }
}
