package ut3;

public class Main {
    final static Integer A = 2;
    final static Integer B = 2;

    public static void main(String[] args) {
        CalculadoraBasica calculadoraBasica = new CalculadoraBasica();
        System.out.println("La suma de " + A + " + " + B + " = " + calculadoraBasica.suma(A,B));
    }
}
