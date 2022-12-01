package ut3.relacion_entre_clases;

// Creo la clase Animal con el campo nombre de tipo cadena

// Creo la clase Perro que herede de Animal y con un campo raza de tipo cadena

// Creo la calse PrincipalAnimalPerro con un método main
public class PrincipalAnimalPerro {
    public static void main(String[] args) {
        // Creo un objeto de tipo Perro
        Perro perro = new Perro();

        //TODO: al campo nombre del objeto perro le asigno el valor "Toby"
        perro.nombre = "Toby";
        //TODO: al campo raza del objeto perro le asigno el valor "Podenco"
        perro.raza = "Podenco";
        //TODO: imprime el nombre y la raza de perro. Ej: "¡Guau! me llamo Toby y soy un Podenco"
        System.out.println("¡Guau! me llamo " + perro.nombre + " y soy un " + perro.raza);
        //TODO: crea un método en Perro que imprima el nombre y la raza (la misma frase anterior),
        // luego invoca ese método desde aquí y comprueba que el efecto es el mismo que la línea anterior.
        perro.imprime();
        // TODO: crea un método en la clase Animal que imprima el nombre ("¡Guau! me llamo Toby") y otro
        // en la clase Perro de nombre imprimePorPartes que invoque al anterior y seguidamente imprima
        // la raza ("y soy un Podenco"). Invócalo desde aquí y comprueba que el efecto es el mismo que la línea anterior.
        perro.imprimePorPartes();
        // TODO: Creo un constructor con un sólo parámetro para la raza
        // No olvides socreescribir el constructor por defecto ya que habrá desaparecido tras crear
        // el nuevo constructor. Luego creo un objeto de tipo Perro pasándole sólo la raza
        Perro perro2 = new Perro("Dalmata");
        perro2.imprimePorPartes();
        // TODO: Creo un objeto de tipo Perro utilizando un constructor con dos parámetros para el nombre y la raza
        Perro perro3 = new Perro("Rolly", "Dalmata");
        perro3.imprimePorPartes();
        // TODO: Crea un constructor con parámetros para la clase Animal (sólo tenemos el campo nombre en este caso)
        // Modifica los constructores de la clase Perro para que desde ellos se invoque a los constructores de Animal.
        // Vuelve a ejecutar y comprueba que todo sigue bien.
        perro2.imprimePorPartes();
        perro3.imprimePorPartes();
        // TODO: Utiliza visibilidad protected y comprueba que todo sigue bien. Después cambiala a private
        // y comprueba que los campos no son visibles fuera de su clase.
        // TODO: Crea getters y setters para los campos y utilizalos dentro del método main en lugar de los campos
    }


}
