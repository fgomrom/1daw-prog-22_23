package org.ieslosremedios.daw1.prog.ut4.strings;

public class StringsExample {
    public static void main(String[] args) {
        String s = "Hola";
        String s1 = new String("Hola");
        String s2 = new String(new char[]{'H', 'o', 'l', 'a'});

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
