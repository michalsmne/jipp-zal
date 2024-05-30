package zadanie5;

public class InstallmentSystem {
    public double calculateInstalment(double price, int numberOfInstallments) throws InvalidPriceException, InvalidInstallementsException {
        if (!isPriceValid(price)) {
            throw new InvalidPriceException();
        }

        if (!isInstallmentsValid(numberOfInstallments)) {
            throw new InvalidInstallementsException();
        }

        return price * getInterestRate(numberOfInstallments) / numberOfInstallments;
    }

    private boolean isPriceValid(double price) {
        return price < 10_000 && price > 100;
    }

    private boolean isInstallmentsValid(int numberOfInstallments) {
        return numberOfInstallments > 6 && numberOfInstallments < 48;
    }

    private double getInterestRate(int numberOfInstallments) {
        if (numberOfInstallments >= 6 && numberOfInstallments <= 12) {
            return 0.025;
        }

        if (numberOfInstallments >= 13 && numberOfInstallments <= 24) {
            return 0.05;
        }

        return 0.1;
    }
}
