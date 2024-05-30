package zadanie3;

public class BmiCalculator {
    public String calculateBMI(double weight, double height) {
        double bmi = weight / Math.pow(height / 100, 2);

        return bmi > 24.9 ? "Nadwaga" : bmi < 18.5 ? "Niedowaga" : "Waga prawidłowa";
    }
}
