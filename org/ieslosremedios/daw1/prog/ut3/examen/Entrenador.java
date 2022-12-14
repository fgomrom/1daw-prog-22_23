package org.ieslosremedios.daw1.prog.ut3.examen;

public class Entrenador extends Persona{
    private Boolean licenciado;
    private String email;
    private Double sueldo;
    private Equipo equipo;

    Entrenador(String nombre, Equipo equipo) {
        super(nombre);
        licenciado = true;
        sueldo = 1000d;
        this.equipo = equipo;
    }

    public Entrenador(String nombre, String dni, char sexo, Integer edad, Boolean licencia, String email, Double sueldo, Equipo equipo) {
        super(nombre);
        super.setDni(dni);
        super.setSexo(sexo);
        super.setEdad(edad);
        this.licenciado = licencia;
        this.email = email;
        this.sueldo = sueldo;
        this.equipo = equipo;
    }

    public void saludar() {
        super.saludar();
        System.out.println("Soy entrenador de la selección de " + equipo.getNombre());
    }

    /**
     * Aumenta el sueldo en el porcentaje indicado
     * @param incentivo el porcentaje indicado
     */
    public void pagarIncentivo(Double incentivo) {
        sueldo = sueldo + sueldo * incentivo / 100;
    }

    /**
     * Reduce el sueldo a 0
     */
    public void pagarFiniquito() {
        sueldo = 0d;
    }

    public Boolean getLicenciado() {
        return licenciado;
    }

    public void setLicenciado(Boolean licenciado) {
        this.licenciado = licenciado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
