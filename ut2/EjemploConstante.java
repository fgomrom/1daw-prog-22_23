package ut2;

public class EjemploConstante {
    public static void main(String[] args) {
        // Declarar x y
        int x = 2, y = 3;

        // Crear bloque donde se imprima x
        {
            System.out.println(x);
            // variable z
            int z = 4;
            // bloque dentro
            {
                System.out.println(z);
                System.out.println(x);
                System.out.println(y);
            }

        }             
        // Crear bloque donde se imprima y
        {
            System.out.println(y);
            //System.out.println(z);
        }
       
    }  
}
