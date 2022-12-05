package org.ieslosremedios.daw1.prog.ut2;

/**
 * Clase que implementa y prueba el algoritmo que nos indica si un número es primo o no
 *
 * @author Fran Gómez
 */
public class Primos {

    /**
     * Constante utilizada para establecer un valor de entrada al algoritmo
     */
    public final static Integer N = 121;

    /**
     * Método main para probar el método esPrimo.
     *
     * @param args
     */
    public static void main(String[] args) {
        if (esPrimo(N))
            System.out.println("El número " + N + " SÍ es primo");
        else
            System.out.println("El número " + N + " NO es primo");
    }

    /**
     * Este método calcula si un número entero positivo es primo o no.
     *
     * @param numero el número entero positivo
     * @return true si numero es primo y false en caso contrario
     */
    public static Boolean esPrimo (Integer numero) {
            /*
            El 0 y el 1 sabemos que no son primos, así que podemos descartarlos de inicio
            y el bucle será más sencillo porque no habrá que tenerlos en cuenta.
             */
            if (numero == 0 || numero == 1) {
                return false;
            }
            /*
            Compruebo si numero es divisible por algún número. Para ello parto del divisor más pequeño
            posible (descartando el 1) que sería el 2 y acabo con el divisor más grande posible (descartado él mismo)
            que sería numero/2, ya que ningún número es divisible por un número mayor que su mitad.
             */
            for (int i = 2; i < numero / 2; i++) {
                // Si es divisible por cualquiera de estos números, no es primo y acabamos el algoritmo
                if (numero % i == 0)
                    return false;
            }
            // Si el bucle ha llegado hasta el final es que no se pudo dividir por ninguno de los números de arriba,
            // por lo tanto numero sí es primo
            return true;
    }
}
