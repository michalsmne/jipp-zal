package zadanie4;

public class SalaryCalculator {
    private double TAX_THRESHOLD = 85.528;

    public double calculateSalary(double salary) {
        if (salary < TAX_THRESHOLD) {
            return salary * 0.18 - 556.02d;
        }

        return 14_839.02d + ((salary - TAX_THRESHOLD) * 0.32);
    }
}
