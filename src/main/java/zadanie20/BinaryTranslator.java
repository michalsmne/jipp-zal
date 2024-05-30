package zadanie20;

public class BinaryTranslator {
    private static final int SIZE = 32;

    public void translate(int number) {
        int[] binaryRepresentation = new int[SIZE];
        this.convertToBinary(number, binaryRepresentation);
        this.printBinaryRepresentation(number, binaryRepresentation);
    }

    private void convertToBinary(int number, int[] binaryRepresentation) {
        int index = SIZE - 1;
        int tempNumber = Math.abs(number);

        while (tempNumber > 0) {
            binaryRepresentation[index--] = tempNumber % 2;
            tempNumber /= 2;
        }

        if (number < 0) {
            for (int i = 0; i < SIZE; i++) {
                binaryRepresentation[i] = binaryRepresentation[i] == 0 ? 1 : 0;
            }

            for (int i = SIZE - 1; i >= 0; i--) {
                if (binaryRepresentation[i] == 1) {
                    binaryRepresentation[i] = 0;
                } else {
                    binaryRepresentation[i] = 1;
                    break;
                }
            }
        }
    }

    private void printBinaryRepresentation(int number, int[] binaryRepresentation) {
        System.out.print("Liczba " + number + " binarnie: ");
        if (number < 0) {
            System.out.print("1.");
        } else {
            System.out.print("0.");
        }

        boolean leadingZero = true;
        for (int bit : binaryRepresentation) {
            if (bit == 1) {
                leadingZero = false;
            }
            if (!leadingZero) {
                System.out.print(bit);
            }
        }
        System.out.println();
    }
}
