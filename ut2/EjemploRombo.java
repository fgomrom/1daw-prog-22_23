package ut2;

public class EjemploRombo {
    private static final int N = 3;

    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < N + 2; i++) {
            if (i < N - j || i > N + j) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
        }
    }
}
