package org.ieslosremedios.daw1.prog.ut5.examen.ejercicio2;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Fichero> ficheros = new ArrayList();
        ficheros.add(new Fichero("hola.txt", 1000.0));
        ficheros.add(new Fichero("adios.dat", 1500.0));
        ficheros.add(new Fichero("adios.dat", 200.0));
        ficheros.add(new Fichero("ejercicio1.doc", 800.0));
        ficheros.add(new Fichero("ejercicio2.txt", 1200.0));
        ficheros.add(new Fichero("ejercicio2.odt", 2200.0));
        ficheros.add(new Fichero("cuentas.xls", 9300.0));
        ficheros.add(new Fichero("libros_nuevos.txt", 250.0));
        ficheros.add(new Fichero("contactos.cvs", 725.0));

        List<Fichero> copiaFicheros = new LinkedList<>(ficheros);
        System.out.println(copiaFicheros);

        copiaFicheros.sort(Comparator.naturalOrder());
        System.out.println(copiaFicheros);

        copiaFicheros.sort(Comparator.reverseOrder());
        System.out.println(copiaFicheros);

        List<Fichero> aux = Collections.unmodifiableList(copiaFicheros);
        for (Fichero copiaFichero : aux) {
            if (copiaFichero.getNombre().contains(".txt"))
                copiaFichero.setNombre(copiaFichero.getNombre().replace(".txt", ".md"));
        }
        System.out.println(copiaFicheros);

        ListIterator<Fichero> listIterator = copiaFicheros.listIterator();
        while (listIterator.hasNext()) {
            Fichero f = listIterator.next();
            if (f.getPeso() > 1000 && f.getPeso() < 2000) {
                listIterator.remove();
            }
        }
        ls(copiaFicheros);

        // Forma incorrecta
      /*  for (Fichero f : copiaFicheros) {
            if (f.getPeso() > 1000 && f.getPeso() < 2000) {
                copiaFicheros.remove(f);
            }
        }
        System.out.println(copiaFicheros);
*/
    }

    static void ls (List<Fichero> ficheros) {
        System.out.println("Nombre\t\tTamaño");
        System.out.println("------\t\t------");
        for (Fichero fichero : ficheros) {
            System.out.print(fichero.getNombre()+"\t");
            System.out.print(fichero.getPeso());
            System.out.println();
        }
    }
}
