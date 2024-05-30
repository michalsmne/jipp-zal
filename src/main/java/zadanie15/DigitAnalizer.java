package zadanie15;

public class DigitAnalizer {
    public void analize(int number) {
        number = Math.abs(number);

        int sum = 0;
        int evenSum = 0;
        int evenCount = 0;
        int oddSum = 0;
        int oddCount = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;

            if (digit % 2 == 0) {
                evenSum += digit;
                evenCount++;
            } else {
                oddSum += digit;
                oddCount++;
            }

            number /= 10;
        }

        double evenAverage = evenCount > 0 ? (double) evenSum / evenCount : 0;
        double oddAverage = oddCount > 0 ? (double) oddSum / oddCount : 0;

        double ratio = oddAverage != 0 ? evenAverage / oddAverage : 0;

        System.out.println("Suma cyfr: " + sum);
        System.out.println("Stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej cyfr nieparzystych: " + ratio);
    }
}
