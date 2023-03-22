package org.ieslosremedios.daw1.prog.ut6.algoritmia.voraz;

import java.util.Arrays;

public class TestMochilaFraccionaria {
    public static void main(String[] args) {
        int max = 100;
        int n = 5;
        Integer[] pesos = {10, 20, 30, 40, 50};
        Integer[] valores = {20, 30, 66, 40, 60};

        ProblemaMochilaFaccionaria pmf = new ProblemaMochilaFaccionaria(n, max, pesos, valores);
        pmf.voraz();
        System.out.println(Arrays.toString(pmf.solucion));
    }
}
