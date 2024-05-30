import zadanie1.TemperatureConverter;
import zadanie13.RectanglePrinter;
import zadanie14.TreePrinter;
import zadanie15.DigitAnalizer;
import zadanie16.DivisorFinder;
import zadanie17.PrimeChecker;
import zadanie18.NumberFrequency;
import zadanie19.Matrix;
import zadanie2.MaxMinFinder;
import zadanie20.BinaryTranslator;
import zadanie22.CoprimeMatrix;
import zadanie3.BmiCalculator;
import zadanie4.SalaryCalculator;
import zadanie5.InstallmentSystem;
import zadanie5.InvalidInstallementsException;
import zadanie5.InvalidPriceException;
import zadanie6.Calculator;
import zadanie6.Exception.DenominatorZeroException;
import zadanie7.OddNumbersPrinter;
import zadanie8.SequenceSum;
import zadanie9.NumberPowerPrinter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        boolean isRunning = true;

        while(isRunning) {
            menu();

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    handleTaskOne(scanner);

                    break;
                case 2:
                    handleTaskTwo(scanner);

                    break;
                case 3:
                    handleTaskThree(scanner);

                    break;
                case 4:
                    handleTaskFour(scanner);

                    break;
                case 5:
                    handleTaskFive(scanner);
                    break;
                case 6:
                    try {
                        handleTaskSix(scanner);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
                case 7:
                    handleTaskSeven(scanner);
                    break;
                case 8:
                    handleTaskEight(scanner);
                    break;
                case 9:
                    handeTaskNine(scanner);
                    break;
                case 10:
                    handleTaskTen(scanner);
                    break;
                case 11:
                    handleTaskEleven(scanner);
                    break;
                case 12:
                    handleTaskTwelve(scanner);
                    break;
                case 13:
                    handleTaskThirteen(scanner);
                    break;
                case 14:
                    handleTaskFourteen(scanner);
                    break;
                case 15:
                    handleTaskFiveteen(scanner);
                    break;
                case 16:
                    handleTaskSixteen(scanner);
                    break;
                case 17:
                    handleTaskSeventeen(scanner);
                    break;
                case 18:
                    handleTaskEighteen();
                    break;
                case 19:
                    handleTaskNineteen();
                    break;
                case 20:
                    handleTaskTwenty(scanner);
                    break;
                case 22:
                    handleTaskTwentyTwo(scanner);
                    break;
                case 0:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Nie znany numer zadania");
                    break;
            }
        }

        scanner.close();
    }

    private static void menu() {
        System.out.println();
        System.out.println("0. Wyłączenie programu");
        System.out.println("1. Zadanie nr.1");
        System.out.println("2. Zadanie nr.2");
        System.out.println("3. Zadanie nr.3");
        System.out.println("4. Zadanie nr.4");
        System.out.println("5. Zadanie nr.5");
        System.out.println("6. Zadanie nr.6");
        System.out.println("7. Zadanie nr.7");
        System.out.println("8. Zadanie nr.8");
        System.out.println("9. Zadanie nr.9");
        System.out.println("10. Zadanie nr.10");
        System.out.println("11. Zadanie nr.11");
        System.out.println("12. Zadanie nr.12");
        System.out.println("13. Zadanie nr.13");
        System.out.println("14. Zadanie nr.14");
        System.out.println("15. Zadanie nr.15");
        System.out.println("16. Zadanie nr.16");
        System.out.println("17. Zadanie nr.17");
        System.out.println("18. Zadanie nr.18");
        System.out.println("19. Zadanie nr.19");
        System.out.println("20. Zadanie nr.20");
        System.out.println("22. Zadanie nr.22");
        System.out.println("Proszę wybrać numer zadania: ");
    }

    private static void handleTaskOne(Scanner scanner) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        System.out.println("Proszę podać stopnie Celcjusza: ");
        System.out.println(temperatureConverter.convertCelsiusToFahrenheit(scanner.nextDouble()));
    }

    private static void handleTaskTwo(Scanner scanner) {
        MaxMinFinder maxMinFinder = new MaxMinFinder();
        ArrayList<Double> numbers = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            System.out.println("Proszę podać liczbę: ");
            numbers.add(scanner.nextDouble());
        }

        double[] result = maxMinFinder.findMinAndMaxNumber(numbers);

        System.out.printf("Najmniejsza wartość: %f. Największa wartość: %f.", result[0], result[1]);
    }

    private static void handleTaskThree(Scanner scanner) {
        BmiCalculator bmiCalculator = new BmiCalculator();
        System.out.println("Proszę podać wagę: ");
        double weight = scanner.nextDouble();

        System.out.println("Proszę podać wzrost: ");
        double height = scanner.nextDouble();

        System.out.println(bmiCalculator.calculateBMI(weight, height));
    }

    private static void handleTaskFour(Scanner scanner) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        System.out.println("Proszę podać roczny przychód: ");
        System.out.printf("Należny podatek: %f" + salaryCalculator.calculateSalary(scanner.nextDouble()));
    }

    private static void handleTaskFive(Scanner scanner) {
        InstallmentSystem installmentSystem = new InstallmentSystem();

        boolean isRun = true;

        while (isRun) {
            System.out.println("Proszę podać cenę towaru: ");
            double price = scanner.nextDouble();

            System.out.println("Proszę podać liczbę rat: ");
            int installment = scanner.nextInt();

            try {
                double monthInstallment = installmentSystem.calculateInstalment(price, installment);

                isRun = false;
                System.out.println("Miesięczna rata wynosi: " + monthInstallment);
                break;
            } catch (InvalidPriceException e) {
                System.out.println("Podano niepoprawną cenę. Cena musi być z zakresu 100-10.000");
            } catch (InvalidInstallementsException e) {
                System.out.println("Podano niepoprawną liczbę dni rat. Ilość dni musi być z zakresu 6-48");
            }
        }
    }

    private static void handleTaskSix(Scanner scanner) throws IOException {
        double[] numbersArray = new double[2];
        char actionSign;
        Calculator calculator = new Calculator();

        System.out.println("Podaj pierwszą liczbę: ");
        numbersArray[0] = scanner.nextDouble();

        System.out.println("Podaj działanie (+, -, /, *):" );
        actionSign = scanner.next().charAt(0);

        System.out.println("Podaj drugą liczbę: ");
        numbersArray[1] = scanner.nextDouble();

        try {
            System.out.println(calculator.calculate(numbersArray, actionSign));
        } catch (DenominatorZeroException e) {
            System.out.println("Nie dziel przez zero");
        }

        System.out.println("Naciśnij enter aby zamknąć program.");
        System.in.read();
    }

    private static void handleTaskSeven(Scanner scanner) {
        OddNumbersPrinter oddNumbersPrinter = new OddNumbersPrinter();

        System.out.println("Podaj liczbę do której wypisać liczby: ");
        oddNumbersPrinter.printOddNumbers(scanner.nextInt());
    }

    private static void handleTaskEight(Scanner scanner) {
        SequenceSum sequenceSum = new SequenceSum();

        System.out.println("Podaj liczbę A: ");
        int numberA = scanner.nextInt();

        System.out.println("Podaj liczbę B: ");
        int numberB = scanner.nextInt();


        sequenceSum.sumSequence(numberA, numberB);
    }

    private static void handeTaskNine(Scanner scanner) {
        NumberPowerPrinter numberPowerPrinter = new NumberPowerPrinter();

        System.out.println("Podaj liczbę: ");
        numberPowerPrinter.print(scanner.nextInt());
    }

    private static void handleTaskTen(Scanner scanner) {
        ArrayList<Double> numbers = new ArrayList<>();

        while (true) {
            System.out.println("Podaj liczbę: ");

            double number = scanner.nextDouble();

            if (number == 0) {
                break;
            }

            numbers.add(number);
        }

        double sum = 0d;

        for (Double number:numbers) {
            sum += number;
        }

        System.out.printf("Wynik: %f%n", sum);
    }

    private static void handleTaskEleven(Scanner scanner) {
        ArrayList<Double> numbers = new ArrayList<>();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Podaj liczbę: ");
            double number = scanner.nextDouble();

            if (number == 0) {
                isRunning = false;
                break;
            }

            numbers.add(number);
        }

        Collections.sort(numbers);

        double sum = 0d;

        for (double number : numbers) {
            sum += number;
        }

        System.out.printf("Suma największej i najmniejszej: %f%n", numbers.getFirst() + numbers.getLast());
        System.out.printf("Średnia arytmetyczna: %f", sum / numbers.size());
    }

    private static void handleTaskTwelve(Scanner scanner) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Zgadnij liczbę: ");
            int guess = scanner.nextInt();

            if (guess > randomNumber) {
                System.out.println("Podałeś za dużą wartość");
            }

            if (guess < randomNumber) {
                System.out.println("Podałeś za małą wartość");
            }

            if (guess == randomNumber) {
                System.out.println("Gratulacje");
                isRunning = false;
            }
        }
    }

    private static void handleTaskThirteen(Scanner scanner) {
        RectanglePrinter printer = new RectanglePrinter();

        System.out.print("Podaj znak wypełnienia prostokąta: ");
        char fillChar = scanner.next().charAt(0);

        System.out.print("Podaj pozycję lewego górnego rogu prostokąta (x): ");
        int x = scanner.nextInt();

        System.out.print("Podaj pozycję lewego górnego rogu prostokąta (y): ");
        int y = scanner.nextInt();

        System.out.print("Podaj długość boku a: ");
        int a = scanner.nextInt();

        System.out.print("Podaj długość boku b: ");
        int b = scanner.nextInt();

        printer.printRectangle(x, y, a, b, fillChar);
    }

    private static void handleTaskFourteen(Scanner scanner) {
        TreePrinter printer = new TreePrinter();

        System.out.print("Podaj wysokość choinki (n > 0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Liczba musi być większa od 0.");
            return;
        }

        printer.print(n);
    }

    private static void handleTaskFiveteen(Scanner scanner) {
        DigitAnalizer analizer = new DigitAnalizer();

        System.out.print("Podaj liczbę całkowitą: ");
        analizer.analize(scanner.nextInt());
    }

    private static void handleTaskSixteen(Scanner scanner) {
        DivisorFinder finder = new DivisorFinder();

        System.out.print("Podaj liczbę całkowitą: ");
        finder.find(scanner.nextInt());
    }

    private static void handleTaskSeventeen(Scanner scanner) {
        PrimeChecker primeChecker = new PrimeChecker();

        System.out.print("Podaj liczbę całkowitą (n > 1): ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Liczba musi być większa od 1.");
        } else {
            boolean isPrime = primeChecker.checkPrime(number);
            if (isPrime) {
                System.out.println(number + " jest liczbą pierwszą.");
            } else {
                System.out.println(number + " nie jest liczbą pierwszą.");
            }
        }
    }

    private static void handleTaskEighteen() {
        NumberFrequency numberFrequency = new NumberFrequency();

        numberFrequency.frequency();
    }

    private static void handleTaskNineteen() {
        Matrix matrix = new Matrix();
        matrix.matrix();
    }

    private static void handleTaskTwenty(Scanner scanner) {
        BinaryTranslator binaryTranslator = new BinaryTranslator();

        System.out.print("Podaj liczbę całkowitą: ");
        binaryTranslator.translate(scanner.nextInt());
    }

    private static void handleTaskTwentyTwo(Scanner scanner) {
        CoprimeMatrix coprimeMatrix = new CoprimeMatrix();

        System.out.print("Podaj liczbę (> 0): ");
        coprimeMatrix.coprime(scanner.nextInt());
    }
}
