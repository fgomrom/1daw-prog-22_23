package org.ieslosremedios.daw1.prog.ut4.arrays;

import java.util.Arrays;

public class ImprimeArray {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,10};

        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        String s = "{";
        for (int i = 0; i < a.length; i++) {
            s += a[i];
            if (i != a.length - 1) {
                s += ",";
            }
        }
        s += "}";
        System.out.println(s);
    }
}
