package zadanie9;

public class NumberPowerPrinter {
    public void print(int number) {
        for (int i = 1; i < number; i++) {
            System.out.print((int) Math.pow(i, 2) + " ");
        }
    }
}
