package org.ieslosremedios.daw1.prog.ut4.strings;

/**
 * asdfasdf
 */
public class StringsExample {
    public static void main(String[] args) {

        imprimeLongitudCadena("Fran");

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
        System.out.println(chars);


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
