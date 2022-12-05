package org.ieslosremedios.daw1.prog.ut2.examen;

/**
 * Muestra por la consola, ordenados de mayor a menor, 3 números dados por 3 variables.
 *
 * Ej: a = 5, b = 7, c = 2.  → 7, 5, 2
 *
 * Solución propuesta:
 * Vemos las distintas posibilidades:
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 * Las buscamos comparando los 3 números.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int a = 5, b = 7, c = 2;
        String ordenados = "";

        if (a > b && b > c) {
            ordenados += a + "," + b + "," + c;
        } else if (a > c && c > b) {
            ordenados += a + "," + c + "," + b;
        } else if (b > a && a > c) {
            ordenados += b + "," + a + "," + c;
        } else if (b > c && c > a) {
            ordenados += b + "," + c + "," + a;
        } else if (c > a && a > b) {
            ordenados += c + "," + a + "," + b;
        } else if (c > b && b > a) {
            ordenados += c + "," + b + "," + a;
        }

        System.out.println(ordenados);
    }
}
