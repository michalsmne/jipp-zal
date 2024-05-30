package zadanie8;

public class SequenceSum {
    public void sumSequence(int numberA, int numberB) {
        System.out.println(String.format(
                "Wynik ciągu: %d, %d, %d",
                this.sumSequenceInDoWhileLoop(numberA, numberB),
                this.sumSequenceInWhileLoop(numberA, numberB),
                this.sumSequenceInForLoop(numberA, numberB)
        ));
    }

    private int sumSequenceInWhileLoop(int numberA, int numberB) {
        int sum = 0;
        int i = numberA;

        while (i <= numberB) {
            sum += i;
            i++;
        }

        return sum;
    }

    private int sumSequenceInDoWhileLoop(int numberA, int numberB) {
        int sum = 0;
        int i = numberA;

        do {
            sum += i;
            i++;
        } while (i <= numberB);

        return sum;
    }

    private int sumSequenceInForLoop(int numberA, int numberB) {
        int sum = 0;

        for (int i = numberA; i <= numberB; i++) {
            sum += i;
        }

        return sum;
    }
}
