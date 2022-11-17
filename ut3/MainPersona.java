package ut3;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        System.out.println("Persona1");
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Edad: " + persona1.edad);
        System.out.println("Persona2");
        System.out.println("Nombre: " + persona2.nombre);
        System.out.println("Edad: " + persona2.edad);

        Persona persona3 = new Persona("Fran", "Gómez");
        System.out.println("Persona3");
        System.out.println("Nombre: " + persona3.nombre);
        System.out.println("Edad: " + persona3.edad);
        Persona persona4 = new Persona();
    }
}
