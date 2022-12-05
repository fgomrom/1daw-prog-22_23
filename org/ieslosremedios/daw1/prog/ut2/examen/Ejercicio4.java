package org.ieslosremedios.daw1.prog.ut2.examen;
//TODO: Crea un tipo enumerado para las siguientes tallas de ropa: XS, S, M, L, XL, XXL
enum Talla {
    XS, S, M, L, XL, XXL
}
public class Ejercicio4 {

    public static void main(String[] args) {
        //TODO: Declara una variable camiseta e inicializalá con el valor M del enumerado
        Talla talla = Talla.M;
        //TODO: Mediante una estructura selectiva (distinta al if) muestra por consola cuál es la talla de la camiseta
        // seleccionada. Ej: L --> "Talla seleccionada: L". Si la talla es mayor o igual a XL mostrar
        // "No está disponible". Si la talla es menor o igual que S mostrar "Últimas unidades"
        System.out.println(talla);
        switch(talla) {
            case S: case XS:
                System.out.println("Últimas unidades");
                break;
            case M:
                System.out.println("M");
                break;
            case L:
                System.out.println("L");
                break;
            default:
                System.out.println("No está disponible");
                break;
        }
    }
}
