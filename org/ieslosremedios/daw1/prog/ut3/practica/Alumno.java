package org.ieslosremedios.daw1.prog.ut3.practica;

public class Alumno {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Integer edad;
    private Float notaMedia;

    private Direccion direccion;

    public static Integer getNotaMediaMáxima (Alumno a, Alumno b) {
        if (a.getNotaMedia() != null && b.getNotaMedia() != null)
            return (int)Math.max(a.getNotaMedia(), b.getNotaMedia());
        return -1;
    }

    public Alumno(String nombre, String primerApellido, String segundoApellido, Integer edad) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(Float notaMedia) {
        this.notaMedia = notaMedia;
    }
}
