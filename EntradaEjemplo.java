import java.io.IOException;

public class EntradaEjemplo {
    public static void main(String[] args) throws IOException {
        int c;
        c = System.in.read();
        System.out.println(c);
        System.out.write(c);
        System.out.print((char)c);
    }

}
