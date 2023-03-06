package org.ieslosremedios.daw1.prog.ut6.excepciones;

public class EjemploExcepciones {
    public static void main(String[] args) {
        System.out.println("COMIENZO PROGRAMA DIVISIÓN");
        try {
            int dividendo = 5;
            int divisor = 0;
            System.out.println("Resultado :" + dividir(dividendo, divisor));
        } catch (ArithmeticException ex){

        } catch (Exception ex) {
            System.out.println("Imposible dividir por 0");
        } finally {
            System.out.println("FIN PROGRAMA DIVISIÓN");
        }
    }

    private static int dividir(int dividendo, int divisor) throws ArithmeticException {
        int division = 0;
            division =  dividendo / divisor;


        return division;
    }
}
