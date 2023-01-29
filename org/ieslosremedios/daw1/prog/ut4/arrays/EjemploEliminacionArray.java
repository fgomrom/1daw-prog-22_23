package org.ieslosremedios.daw1.prog.ut4.arrays;

import java.util.Arrays;

public class EjemploEliminacionArray {
    public static void main(String[] args) {
        int[] a  = {5, 46, 3, 9};
        int pos = 1;
        System.out.println(Arrays.toString(eliminaArray(a,pos)));
    }

    static int[] eliminaArray(int[] in, int pos) {
        int[] out = new int[in.length - 1];
        System.arraycopy(in, 0, out, 0, pos);
        System.arraycopy(in, pos + 1, out, pos, in.length - (pos + 1));
        return out;
    }
}
