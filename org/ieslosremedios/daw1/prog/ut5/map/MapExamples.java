package org.ieslosremedios.daw1.prog.ut5.map;

import org.ieslosremedios.daw1.prog.ut5.conjuntos.Persona;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {
//        Map<String,Integer> m = new HashMap<>();
//        m.put("A",1);
//        m.put("C",2);
//        m.put("B",3);
//        System.out.println(m.values());
//        System.out.println(m);

        HashMap<Integer, String> abecedario = new HashMap<>();
        abecedario.put(2,"B");
        abecedario.put(1,"A");
        abecedario.put(3,"C");
        abecedario.put(4,"D");
        abecedario.put(5,"E");
        System.out.println(abecedario.values());

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(2,"B");
        lhm.put(1,"A");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        System.out.println(lhm.values());

       /* System.out.println(abecedario.get(3));

        System.out.println(abecedario);
        abecedario.replace(4,"F");
        System.out.println(abecedario);

        System.out.println(abecedario);
        System.out.println("El elemento eliminado es: " + abecedario.remove(4));
        System.out.println(abecedario);

        if (!abecedario.containsValue("F")) {
            System.out.println("La letra: F no está en el map");
        } else {
            System.out.println("La letra: F sí está en el map");
        }

        if (!abecedario.containsKey(1)) {
            System.out.println("La clave 1 no está en el map");
        } else {
            System.out.println("La clave 1 sí está en el map");
        }

        //Iterando sobre el conjunto de valores
        Iterator it = abecedario.values().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        it = abecedario.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(abecedario);
        System.out.println(abecedario.isEmpty());
        System.out.println(abecedario.size());
        abecedario.clear();
        System.out.println(abecedario);
        System.out.println(abecedario.isEmpty());

        abecedario.put(null,"Z");
        abecedario.put(null,null);
        abecedario.put(null,"X");
        abecedario.put(9,"X");
        System.out.println(abecedario);*/

        // 5 --> "suficiente"
        // 6 --> "bien"
        // 7 --> "notable bajo"
        //...
        TreeMap<Integer, String> notas = new TreeMap<>();
        notas.put(10,"Matrícula");
        notas.put(9,"Sobresaliente");
        notas.put(6,"Bien");
        notas.put(8,"Notable alto");
        notas.put(7,"Notable bajo");
        notas.put(5,"Suficiente");
        System.out.println(notas.values());
        System.out.println(notas.get(notas.firstKey()));
        System.out.println(notas.firstEntry());
        System.out.println(notas.lowerKey(7));
        //Obtener el elemento que está justo después de "Notable bajo"
        //System.out.println(notas.ceilingKey(notas.));
    }
}
