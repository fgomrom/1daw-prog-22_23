package org.ieslosremedios.daw1.prog.ut4.strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patrones {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^Pa!i[a-zA-Z].*");
        Matcher m = p.matcher("Pa0a");
        System.out.println(m.matches());


        System.out.println(Arrays.toString("Hola me llamo fran".split(" ")));

        System.out.println("Pa".matches("^Pa"));


    }
}
