package zadanie3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BmiCalculatorTest {
    private BmiCalculator calculator;

    public BmiCalculatorTest() {
        this.calculator = new BmiCalculator();
    }

    @Test
    public void testShouldReturnCorrectBmi() {
        double weightInKilograms = 85d;
        double heightInCentimeters = 186d;

        String result = this.calculator.calculateBMI(weightInKilograms, heightInCentimeters);

        Assertions.assertEquals("Waga prawidłowa", result);
    }

    @Test
    public void testShouldReturnUnderweightBmi() {
        double weightInKilograms = 60d;
        double heightInCentimeters = 186d;

        String result = this.calculator.calculateBMI(weightInKilograms, heightInCentimeters);

        Assertions.assertEquals("Niedowaga", result);
    }

    @Test
    public void testShouldReturnOverweightBmi() {
        double weightInKilograms = 120d;
        double heightInCentimeters = 186d;

        String result = this.calculator.calculateBMI(weightInKilograms, heightInCentimeters);

        Assertions.assertEquals("Nadwaga", result);
    }
}