package zadanie22;

public class CoprimeMatrix {
    public void coprime(int number) {
        boolean[][] a = new boolean[number][number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                a[i][j] = this.areCoprime(i + 1, j + 1);
            }
        }

        for (int j = 1; j <= number; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < number; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < number; j++) {
                System.out.print(a[i][j] ? "+" : ".");
            }
            System.out.println();
        }
    }

    private boolean areCoprime(int x, int y) {
        return this.greatestCommonDivisor(x, y) == 1;
    }

    private int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
