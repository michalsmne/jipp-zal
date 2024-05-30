package zadanie18;

import java.util.Random;

public class NumberFrequency {
    public void frequency() {
        int[] numbers = this.generateNumbers();

        System.out.print("Wylosowane liczby: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        this.checkFrequency(numbers);
    }

    private int[] generateNumbers() {
        int[] numbers = new int[20];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1 + random.nextInt(10);
        }

        return numbers;
    }

    private void checkFrequency(int[] numbers) {
        int[] count = new int[11];

        for (int number : numbers) {
            count[number]++;
        }

        System.out.println("Wystąpienia:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "-" + count[i]);
        }
    }
}
