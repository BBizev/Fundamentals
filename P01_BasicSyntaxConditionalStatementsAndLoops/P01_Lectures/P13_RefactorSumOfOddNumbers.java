package P01_BasicSyntaxConditionalStatementsAndLoops.P01_Lectures;

import java.util.Scanner;

public class P13_RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());

        int sum = 0;

        for (int i = 1; i <= n * 2 ; i+=2) {
            sum += i;
            System.out.println(i);
        }

        System.out.printf("Sum: %d", sum);

    }
}
