package org.ieslosremedios.daw1.prog.ut7.ficheros;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio9 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Fran Gómez\\Downloads\\Nueva carpeta\\test2.txt");
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();

            RandomAccessFile raf = new RandomAccessFile(file, "rw");

            raf.write("defg".getBytes());

            System.out.println(raf.getFilePointer());

            raf.seek(0);
            System.out.println(raf.readLine());

            raf.write("hij".getBytes());
            raf.seek(0);
            String temp = raf.readLine();
            raf.seek(0);
            raf.write("abc".getBytes());
            raf.write(temp.getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
