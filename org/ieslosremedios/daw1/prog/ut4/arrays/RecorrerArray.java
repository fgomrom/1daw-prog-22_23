package org.ieslosremedios.daw1.prog.ut4.arrays;

public class RecorrerArray {
    public static void main(String[] args) {
        int[] a = {7, -2, 5, 0, 6};
        System.out.println(RecorrerArray.sumaArray(a));
    }
    
    private static int sumaArray (int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        for (int e : a) {
            suma = suma + e;
        }
        return suma;
    }
}
