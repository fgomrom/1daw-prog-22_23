package org.ieslosremedios.daw1.prog.ut2;

public class NPrimerosMultiplos {
    public static void main(String[] args) {
        // Los N primeros múltiplos de num
        final int N = 3;
        final int num = 7;

        for (int i = 1; i <= N; i++) {
            System.out.println(num * i);
        }
    }
}
