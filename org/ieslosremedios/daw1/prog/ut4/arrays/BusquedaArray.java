package org.ieslosremedios.daw1.prog.ut4.arrays;

import java.util.Arrays;

public class BusquedaArray {
    public static void main(String[] args) {
        int[] a = {1,3,7,10};
        System.out.println("La búsqueda manual: " + buscar(a,7));
        System.out.println("La búsqueda binarySearch: " + Arrays.binarySearch(a,7));
    }

    private static int buscar(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                return i;
            }
        }
        return -1;
    }
}
