package ut3.calculadora;

public class Main {
    final static Integer A = 2;
    final static Integer B = 3;

    final static Float A_DECIMAL = 2.5F;
    final static Float B_DECIMAL = 3.0F;
    enum Operacion {
        SUMA, RESTA, MULTI, DIV
    }

    public static void main(String[] args) {

        CalculadoraBasica basica = new CalculadoraBasica();
        Operacion operacionSeleccinada = Operacion.SUMA;
        int a = 2;
        int b = 3;
        int c = 4;

        basica.suma(a,c);

       // basica.suma(2,2, 2);

        //System.out.println(basica.suma(2.5, 1.5));

        switch (operacionSeleccinada) {
            case SUMA:
                System.out.println("La suma de " + A + " + " + B + " = " + basica.suma(A, B));
                break;
            case RESTA:
        }
    }
}
