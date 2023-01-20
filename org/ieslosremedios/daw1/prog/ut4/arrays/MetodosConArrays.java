package org.ieslosremedios.daw1.prog.ut4.arrays;

public class MetodosConArrays {
    public static void main(String[] args) {
        int x = 1;
        Double [] a = {1d, 2.5d, 34.56, null, 0d};
        Double [] b = {1d, 2.5d};

        System.out.println(x);
        m(x);
        System.out.println(x);

        System.out.println(a);
        System.out.println(a[0]);
        m(x,"hola",a);
        System.out.println(a);
        System.out.println(a[0]);

       /* System.out.println(x);
        m2(x,"hola",a);
        System.out.println(x);*/
    }

    static void m (int x) {
        x = x + 1;
    }

    static void m (int x, String s) {
        s = s.toUpperCase();
        m(x);
    }

    static void m (int x, String s, Double [] p) {
        p[0]++;
        p[p.length - 1]++;
        p[(p.length - 1)/2]++;
        //a[(Double) Math.floor((double)(a.length/2))]++;
        m(x, s);
    }

    static int[][] m2 (int x, String s, Double [] input) {
        int n = input.length;
        int m = 2;
        int[][] output = new int[n][m];
        int i,j;

        m(x, s, input);

        i = 0;
        j = 0;
        output[i][j] = (int)Math.floor(input[i]);
        j = 1;
        output[i][j] = (int)Math.round(input[i]);

        i++;
        j = 0;
        output[i][j] = (int)Math.floor(input[i]);
        j = 1;
        output[i][j] = (int)Math.round(input[i]);

        i++;
        j = 0;
        output[i][j] = (int)Math.floor(input[i]);
        j = 1;
        output[i][j] = (int)Math.round(input[i]);

        i++;
        j = 0;
        output[i][j] = (int)Math.floor(input[i]);
        j = 1;
        output[i][j] = (int)Math.round(input[i]);


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
