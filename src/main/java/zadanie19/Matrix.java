package zadanie19;

import java.util.Random;

public class Matrix {
    private static final int SIZE = 5;
    private static final int RANGE = 11;

    public void matrix() {
        int[][] matrix = new int[SIZE][SIZE];
        int[] minValues = new int[SIZE];
        int[] maxValues = new int[SIZE];

        fillMatrix(matrix);
        printMatrix(matrix);
        findMinAndMax(matrix, minValues, maxValues);
        printArray("Minima dla każdej kolumny:", minValues);
        printArray("Maksima dla każdej kolumny:", maxValues);
    }

    private void fillMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = random.nextInt(RANGE) - 5; // Zakres od -5 do 5
            }
        }
    }

    private void printMatrix(int[][] matrix) {
        System.out.println("Macierz:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private void findMinAndMax(int[][] matrix, int[] minValues, int[] maxValues) {
        // Inicjalizacja minimów i maksimów dla każdej kolumny
        for (int j = 0; j < SIZE; j++) {
            minValues[j] = Integer.MAX_VALUE;
            maxValues[j] = Integer.MIN_VALUE;
        }

        // Wyznaczanie minimów i maksimów dla każdej kolumny
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) {
                if (matrix[i][j] < minValues[j]) {
                    minValues[j] = matrix[i][j];
                }
                if (matrix[i][j] > maxValues[j]) {
                    maxValues[j] = matrix[i][j];
                }
            }
        }
    }

    private static void printArray(String message, int[] array) {
        System.out.println("\n" + message);
        for (int value : array) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }
}
