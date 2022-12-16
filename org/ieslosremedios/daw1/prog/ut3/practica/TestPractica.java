package org.ieslosremedios.daw1.prog.ut3.practica;

public class TestPractica {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Fran", "Gómez", "Romero", 20);
        Direccion d1 = new Direccion();
        Casa c1 = new Casa();
        a1.setDireccion(d1);
        c1.setDireccion(d1);
        Alumno.getNotaMediaMáxima(a1,a1);
    }
}
