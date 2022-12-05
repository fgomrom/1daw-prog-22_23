package org.ieslosremedios.daw1.prog.ut3.relacion_entre_clases;

public class Principal {
    public static void main(String[] args) {
        // Composición
        Persona p1 = new Persona();
        p1.setNombre("Fran");

        Direccion d1 = new Direccion();
        d1.setCalle("13 Rue del Percebe");

        p1.setDireccion(d1);

        p1.saludar();

        // Herencia
        Estudiante e1 = new Estudiante("Paco", 123456);

        Direccion d2 = new Direccion();
        d2.setCalle("5º Pino");

        e1.setDireccion(d2);

        e1.saludar();

        Estudiante e2 = new Estudiante();
    }
}
