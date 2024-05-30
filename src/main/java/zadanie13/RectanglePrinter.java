package zadanie13;

public class RectanglePrinter {
    public void printRectangle(int x, int y, int a, int b, char fillChar) {
        for (int i = 1; i < y; i++) {
            System.out.println(">");
        }

        for (int i = 0; i < b; i++) {
            System.out.print(">");
            for (int j = 1; j < x; j++) {
                System.out.print("_");
            }
            for (int j = 0; j < a; j++) {
                System.out.print(fillChar);
            }
            System.out.println();
        }
    }
}
