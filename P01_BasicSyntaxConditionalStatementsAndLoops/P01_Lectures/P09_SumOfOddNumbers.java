package P01_BasicSyntaxConditionalStatementsAndLoops.P01_Lectures;

import java.util.Scanner;

public class P09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.next());
        int sumOdd = 0;

        for (int i = 1; i <= number * 2 ; i+=2) {
            sumOdd += i;
            System.out.println(i);
        }

        System.out.printf("Sum: %d", sumOdd);

    }
}
