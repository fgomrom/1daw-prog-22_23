package org.ieslosremedios.daw1.prog.ut4.arrays;

public class A41 {
    public static void main(String[] args) {
        int x = 1;
        String s = "hello";
        Double[] a = {1d, 2.5d,34.56d,null,0d};

        System.out.println(x);
        m(x);
        System.out.println(x);

        System.out.println(s);
        m(s);
        System.out.println(s);

        System.out.println(a[0]);;
        m(a);
        System.out.println(a[0]);
    }

    private static void m(int x){
        x++;
    }

    private static void m(String s){
        s=(s.toUpperCase());
    }

    private static void m(Double[]  a){
        a[0]++;
        a[((a.length-1)/2)]++;
        a[a.length-1]++;
    }

    private static int[][] m2 (int x, String s, Double[] input) {

        // Si quisieramos que este método también ejecuete los anteriores
        // para hacer una sóla invocación en el main.
        /*m(x);
        m(s);
        m(input);*/

        int n = input.length;
        int m = 2;
        int[][] output = new int[n][m];

        output[0][0] = (int)Math.floor(input[0]);                               //Convierto Double a int //También vale input[0].intValue();
        output[0][1] = (int)Math.round(input[0]);

        output[1][0] = (int)Math.floor(input[1]);
        output[1][1] = (int)Math.round(input[1]);

        output[2][0] = (int)Math.floor(input[2]);
        output[2][1] = (int)Math.round(input[2]);

        output[3][0] = (int)Math.floor(input[3]);
        output[3][1] = (int)Math.round(input[3]);

        output[4][0] = (int)Math.floor(input[4]);
        output[4][1] = (int)Math.round(input[4]);

        return output;
    }
}
