package ut3.relacion_entre_clases;

public class Perro extends Animal {
    String raza;

    public Perro () {
        // Default constructor
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public Perro(String nombre, String raza) {
        //super.nombre = nombre; //Versión inicial
        super(nombre); // Versión modificada
        this.raza = raza;
    }

    void imprime () {
        System.out.println("¡Guau! me llamo " + super.nombre + " y soy un " + raza);
        // También se podría quitar el super, poque no hay ambiguedad. Misma lógica que con this.
        System.out.println("¡Guau! me llamo " + nombre + " y soy un " + raza);
    }

    void imprimePorPartes () {
        // Aquí si hay que poner el super porque hay un método imprime en Perro y otro en Animal
        super.imprime();
        System.out.println(" y soy un " + raza);
    }
}
