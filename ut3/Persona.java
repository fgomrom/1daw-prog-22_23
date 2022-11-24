package ut3;

public class Persona {
    String nombre;
    String primerApellido;
    String segundoApellido;
    int edad;

    Persona () {
        nombre = "Anónimo";
    }

    Persona (String nombre, String primerApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
    }
}
