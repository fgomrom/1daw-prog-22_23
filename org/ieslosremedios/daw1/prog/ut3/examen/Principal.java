package org.ieslosremedios.daw1.prog.ut3.examen;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        // Equipo de España
        Equipo spain = new Equipo("España", Color.ROJO, 10, 5, 3);
        Entrenador luisEnrique = new Entrenador("Luis Enrique", "1111111", 'H', 50, true, "luisenrique@france.com", 2000d, spain);
        luisEnrique.saludar();
        // Equipo de Francia
        Equipo france = new Equipo("Francia", Color.AZUL, 12, 5, 6);
        Entrenador deschamps = new Entrenador("Deschamps", "222222", 'H', 60, true, "deschamps@france.com", 2000d, france);
        deschamps.saludar("Bon jour");

        // Inicializo a un supuesto cualquiera
        // Creo una copia de los equipos para que no se actualice su calidad
        Equipo ganador = new Equipo("España", Color.ROJO, 10, 5, 3);
        Equipo perdedor = new Equipo("Francia", Color.AZUL, 12, 5, 6);
        Integer partido = jugar(spain, france, 0);
        if (partido > 0) {
            // Esto me lo podría ahorrar porque coincide con el caso supuesto
            ganador = spain;
            perdedor = france;
        } else if (partido < 0) {
            ganador = france;
            perdedor = spain;
        } else {
            ganador.setPartidosEmpatados(ganador.getPartidosEmpatados() + 1);
            perdedor.setPartidosEmpatados(perdedor.getPartidosEmpatados() + 1);
            System.out.println("¡Empate!");
        }
        if (partido != 0) {
            ganador.setPartidosGanados(ganador.getPartidosGanados() + 1);
            perdedor.setPartidosPerdidos(perdedor.getPartidosPerdidos() + 1);
            System.out.println("El ganador es: " + ganador.getNombre() + " Partidos ganados: " +
                    ganador.getPartidosGanados());
        }

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

        // Actualizar calidad de los equipos en función del resultado del partido
        if (golesEquipoA == golesEquipoB) {
            a.setPartidosEmpatados(a.getPartidosEmpatados() + 1);
            a.setPartidosEmpatados(a.getPartidosEmpatados() + 1);
        } else if (golesEquipoA > golesEquipoB) {
            a.setPartidosGanados(a.getPartidosGanados() + 1);
            b.setPartidosPerdidos(b.getPartidosPerdidos() + 1);
        } else {
            b.setPartidosGanados(b.getPartidosGanados() + 1);
            a.setPartidosPerdidos(a.getPartidosPerdidos() + 1);
        }
        a.actualizarCalidad();
        b.actualizarCalidad();

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
