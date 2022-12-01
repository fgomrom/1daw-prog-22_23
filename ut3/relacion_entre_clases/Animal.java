package ut3.relacion_entre_clases;

public class Animal {
    String nombre;
    Animal () {
        // Default constructor
    }
    Animal (String nombre) {
        this.nombre = nombre;
    }
    void imprime () {
        System.out.print("¡Guau! me llamo " + nombre);
        // Luego verás por qué uso print en lugar de println
    }
}
