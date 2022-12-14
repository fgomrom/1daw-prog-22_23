package org.ieslosremedios.daw1.prog.ut3.examen;

public class Equipo {
    private String nombre;
    private Color color;
    private Integer partidosGanados;
    private Integer partidosPerdidos;
    private Integer partidosEmpatados;
    private Integer calidad;
    private static String campeonato = "Mundial";

    public Equipo () {
        // Constructor por defecto: todos los campos a su valor por defecto (null)
    }

    public Equipo(String nombre, Color color){
        this.nombre = nombre;
        this.color = color;
    }

    public Equipo(String nombre, Color color, Integer ganados, Integer empatados, Integer perdidos){
        this(nombre, color);
        partidosGanados = ganados;
        partidosEmpatados = empatados;
        partidosPerdidos = perdidos;
        actualizarCalidad();
    }

    /**
     * Actualiza el valor del campo calidad. Siguiendo la fórmula:
     * partidosGanados * 2 + partidosEmpatados - partidosPerdidos
     * Garantiza que el valor no pueda ser mayor que 100 ni menor que 0
     */
    public void actualizarCalidad() {
        calidad = partidosGanados * 2 + partidosEmpatados - partidosPerdidos;
        if (calidad > 100)
            calidad = 100;
        else if (calidad < 0) {
            calidad = 0;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(Integer partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public Integer getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(Integer partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public Integer getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(Integer partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public Integer getCalidad() {
        return calidad;
    }

    private void setCalidad(Integer calidad) {
        this.calidad = calidad;
    }

    public static String getCampeonato() {
        return campeonato;
    }

    public static void setCampeonato(String campeonato) {
        Equipo.campeonato = campeonato;
    }
}
