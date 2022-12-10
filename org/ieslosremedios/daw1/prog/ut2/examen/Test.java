package org.ieslosremedios.daw1.prog.ut2.examen;

public class Test {
    public static void main(String[] args) {
        int a = 5;
        for(int altura = 1; altura <= a; altura++){
            for(int espacio = 1; espacio <= a-altura; espacio++){
                System.out.print(" ");
                //Con esto damos los espacios delante de nuestra piramides
            }
            for(int hoja = 1; hoja <=(altura*2)-1; hoja++) {
                System.out.print("*");
                //Con esto imprimimos nuestra piramide linea a linea
            }
            System.out.println();
        }
        int b = a-1;
        for(int tronco = 1; tronco <= b; tronco++){
            for(int espacio = 1; espacio <= a-tronco; espacio++){
                System.out.print(" ");
            }
            for(int Tronco = 1; Tronco <= tronco; Tronco++){
                System.out.println("|");
            }
        }
    }
}
