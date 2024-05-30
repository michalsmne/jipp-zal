package zadanie7;

public class OddNumbersPrinter {
    public void printOddNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
