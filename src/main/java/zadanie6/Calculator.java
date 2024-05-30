package zadanie6;

import zadanie6.Exception.DenominatorZeroException;
import zadanie6.Exception.UnsupportedOptionException;

public class Calculator {
    private final int DENOMINATOR_INDEX = 1;

    public double calculate(double[] numbers, char operator) throws DenominatorZeroException {
        switch (operator) {
            case '+':
                return numbers[0] + numbers[1];
            case '-':
                return numbers[0] - numbers[1];
            case '/':
                if (this.isDenominatorZero(numbers[this.DENOMINATOR_INDEX])) {
                    throw new DenominatorZeroException();
                }

                return numbers[0] / numbers[1];
            case '*':
                return numbers[0] * numbers[1];
            default:
                throw new UnsupportedOptionException();
        }
    }

    private boolean isDenominatorZero(double number) {
        return number == 0;
    }
}
