public class TablaMultiplicar {
    private static final int M = 10;

    public static void main(String[] args) {
        // Todo en una sola columna
        for (int i = 1; i <= M; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= M; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }

        // Por columnas
        for (int i = 1; i <= M; i++) {
            System.out.print("Tabla del " + i + "\t");
        }
        System.out.print("\n");
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= M; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t");
            }
            System.out.print("\n");
        }
    }
}
