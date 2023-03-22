package org.ieslosremedios.daw1.prog.ut6.complejidad.ejercicios;

public class NumeroMasGrande {
    public static void main(String[] args) {
        int[] numeros = {3,1,5,10,-2,3,4,12,0,9,-1};
        System.out.println(buscarMayor(numeros));
    }

    public static int buscarMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (mayor < numeros[i]) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }
}
