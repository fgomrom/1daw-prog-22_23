package org.ieslosremedios.daw1.prog.ut4.arrays;

import java.util.Arrays;

public class BusquedaArray {
    public static void main(String[] args) {
        int[] a = {10,3,12,13,5,8,7,1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
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
