package org.ieslosremedios.daw1.prog.ut4.arrays;

public class EjemploArray {
    public static void main(String[] args) {

        Integer[] a = new Integer[5];
        Integer[][] b = new Integer[3][];
        Integer[][] c = {{1,2},{4},{4,5,6}};
        b[0] = new Integer[1];
        b[0][0] = 0;
        b[1] = new Integer[2];
        b[1][0] = 0;
        b[1][1] = 1;
        b[2] = new Integer[3];
        b[2][0] = 0;
        b[2][1] = 1;
        b[2][2] = 2;

        System.out.println(b.length);
        System.out.println(b[0].length);
        //System.out.println(b[0][0].length);//No existe

       // System.out.println(a[4]);
        //a[5] = 6;
        /*System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a[5]);*/
    }
}
