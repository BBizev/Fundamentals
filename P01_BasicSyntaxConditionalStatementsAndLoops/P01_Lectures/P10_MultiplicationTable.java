package P01_BasicSyntaxConditionalStatementsAndLoops.P01_Lectures;

import java.util.Scanner;

public class P10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.next());

        for (int i = 1; i <=10 ; i++) {
            int sumMultiplied = number * i;

            System.out.printf("%d X %d = %d%n", number, i, sumMultiplied);
        }
    }
}
