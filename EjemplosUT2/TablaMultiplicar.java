public class TablaMultiplicar {
    private static final int M = 0;
    private static final int N = 0;

    public static void main(String[] args) {
        for (int i = 1; i <= M; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= N; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
}
