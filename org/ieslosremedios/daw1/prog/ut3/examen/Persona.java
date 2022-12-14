package org.ieslosremedios.daw1.prog.ut3.examen;

public class Persona {
    private String nombre;
    private String dni;
    private Integer edad;
    // Hombre = 'M', Mujer = 'F'
    private char sexo;

    Persona (String nombre) {
        this.nombre = nombre;
    }

    protected void saludar() {
        System.out.println("¡Hola, me llamo " + nombre + "!");
    }

    public void saludar(String s) {
        System.out.println("¡" + s + ", me llamo " + nombre + "!");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
