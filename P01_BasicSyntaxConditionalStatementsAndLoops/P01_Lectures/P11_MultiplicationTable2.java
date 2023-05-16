package P01_BasicSyntaxConditionalStatementsAndLoops.P01_Lectures;

import java.util.Scanner;

public class P11_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.next());
        int number2 = Integer.parseInt(scanner.next());

        if (number2 <= 10) {
            for (int i = number2; i <= 10; i++) {
                int sumMultiplied = number * i;
                System.out.printf("%d X %d = %d%n", number, i, sumMultiplied);
            }
        } else {
            int sumMultiplied2 = number * number2;
            System.out.printf("%d X %d = %d%n", number, number2, sumMultiplied2);
        }
    }
}
