package org.ieslosremedios.daw1.prog.ut3.relacion_entre_clases;

public class Persona {
    private String nombre;
    private String telefono;
    private String email;

    private Direccion direccion;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void saludar () {
        System.out.println("Hola, me llamo " + nombre + " y vivo en " + direccion.getCalle());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
