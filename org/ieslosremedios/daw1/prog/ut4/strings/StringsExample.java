package org.ieslosremedios.daw1.prog.ut4.strings;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * StringsExample
 */
public class StringsExample {
    public static void main(String[] args) {

        System.out.println("Francis".matches("Fran.*"));

        //TODO Convertir los siguientes números a String y posteriormente ordenarlos alfabéticamente de menor a mayor
        int[] numbers = {2,1,11,10};

        // Pasar números a cadenas
        String[] cadenas = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            cadenas[i] = String.valueOf(numbers[i]);
        }
        // Ordenar cadenas ascendentemente
        Arrays.sort(cadenas);
        System.out.println(Arrays.toString(cadenas));

/*
        Integer.valueOf("1"); // devuelve Integer
        Integer.parseInt("1"); //devuelve int

        imprimeLongitudCadena("Fran");
        int num1 = 1;

        //TODO Número entero envoltorio de nomobre num2 y valor 2
        Integer num2 = Integer.valueOf(2);
        Integer num3 = new Integer(3);
        Integer num4 = 4;


        //TODO: Imprimir valor tipo cadena de num1
        System.out.println(num1 + "");
        System.out.println(String.valueOf(num1));

        //TODO: Imprimir valor tipo cadena de num2
        System.out.println(Integer.toString(num2));
        System.out.println(num2.toString());
        System.out.println(num2);
        System.out.println(num2+"");
        System.out.println(String.valueOf(num2));
*/



        /*int n = Integer.parseInt("1");
        System.out.println(n+1);
        boolean b = Boolean.parseBoolean("true");
        System.out.println(b);
        Long.parseLong("234234234");
        Double.parseDouble("1.1");
        Float.parseFloat("");*/
/*
        Integer integer = Integer.valueOf("1");
        integer = Integer.valueOf(11);
        Double ddd = Double.valueOf("1.222222");
        String s = 1 + "";
        s = String.valueOf(1);
        System.out.println(s);
        integer.toString();
*/




       /* imprimeLongitudCadena("Fran");

        char[] chars = {'c','a'};
        String c = new String(chars);
        int i = chars.length;
        c.length();


        String s = "Hola";
        String s1 = new String("Hola");
        String s2 = new String(new char[]{'H', 'o', 'l', 'a'});
        String s3 = s + "Fran";
        s3 = s;

        System.out.println(s);
        System.out.println(s1);
        System.out.println(chars);*/


    }

    //TODO: imprimeLongitudCadena
    static void imprimeLongitudCadena (String s) {
        System.out.println("La longitud de " + s + " es " + s.length());
    }

    //TODO: caracterEnPosicionEmpezandoEn1

    //TODO: cuentaOcurrenciasDeUnCaracter

    //TODO: imprimeCadenasEnOrdenAlfabético imprime en orden alfabético las cadenas dadas por un array de cadenas,
    // sin tener en cuenta si son mayúsculas o minúsculas.

    //TODO: un método que dado un pequeño texto devuelva un array de cadenas codificando el texto, de modo que cada vez que aparezca
    // el caracter punto (.) se corte esa frase y se meta en una posición del array y que todas las vocales se sustituyan por el
    // número gráficamente más parecido (ejemplo: o --> 0, i --> 1, a --> 4, ...)


}
