package org.ieslosremedios.daw1.prog.ut3.examen;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Equipo spain = new Equipo("España", Color.ROJO);
        Entrenador luisEnrique = new Entrenador("Luis Enrique", spain);
        spain.setPartidosEmpatados(10);
        spain.setPartidosGanados(10);
        spain.setPartidosPerdidos(5);
        spain.actualizarCalidad();
        Equipo france = new Equipo();
        if (jugar(spain,france,0) > 0)
            System.out.println("España");

    }

    /**
     * Simula un partido entre dos equipos indicando cuál ha sido el vencedor
     *
     * @param a un equipo
     * @param b otro equipo diferente
     * @param dificultad entero entre 0 y 9 que se usará para calcular tanto el número de ocasiones que tienen los equipos
     *                   de marcar un gol, como la probabilidad de hacerlo.
     * @return < 0 si ha ganado el equipo b, > 0 si ha ganado el equipo a y 0 en caso de empate
     */
    public static Integer jugar (Equipo a, Equipo b, Integer dificultad) {
        // Controlar que sean equipos diferentes y dificultad esté en el rango indicado
        if (a == b || dificultad < 0 || dificultad > 9)
            return null;
        final Integer NUM_MAX_JUGADAS = 10;
        Integer random;
        Integer golesEquipoA = 0;
        Integer golesEquipoB = 0;

        for (int i = 0; i < NUM_MAX_JUGADAS - dificultad; i++) {
            // Ataca el equipo b
            random = obtenerEnteroAleatorio(0, 100);
            if (a.getCalidad() + dificultad * NUM_MAX_JUGADAS < random)
                golesEquipoB += 1;
            // Ataca el equipo a
            random = obtenerEnteroAleatorio(0, 100);
            if (b.getCalidad() + dificultad * NUM_MAX_JUGADAS < random)
                golesEquipoA += 1;
        }

        return golesEquipoA - golesEquipoB;
    }

    /**
     * Obtiene un número entero aleatorio entre min y max inclusives
     * @param min el menor número aleatorio a devolver
     * @param max el mayor número aleatorio a devolver
     * @return número entero aleatorio entre min y max inclusives
     */
    private static Integer obtenerEnteroAleatorio(int min, int max) {
        Random r = new Random();
        return r.nextInt(max + 1 - min) + min;
    }

}
