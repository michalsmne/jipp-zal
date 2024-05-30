package zadanie16;

public class DivisorFinder {
    public void find(int number) {
        int absNumber = Math.abs(number);

        for (int i = 1; i <= absNumber; i++) {
            if (absNumber % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
