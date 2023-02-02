package org.ieslosremedios.daw1.prog.ut4.strings;

import java.util.Arrays;

public class EjerciciosString {
    public static void main(String[] args) {
        int[] numbers = {2,1,11,10};
        String[] strings;
        strings = convertirAStringYOrdenar(numbers);
        System.out.println(Arrays.toString(strings));
    }

    private static String[] convertirAStringYOrdenar(int[] numbers) {
        String[] strings = new String[numbers.length];

        // Conversión
        for (int i = 0; i < numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }

        // Ordenación
        Arrays.sort(strings);

        return strings;
    }
}
