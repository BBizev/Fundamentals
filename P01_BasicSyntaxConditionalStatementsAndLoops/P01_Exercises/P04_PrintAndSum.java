package P01_BasicSyntaxConditionalStatementsAndLoops.P01_Exercises;

import java.util.Scanner;

public class P04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.next());
        int endNumber = Integer.parseInt(scanner.next());

        int sum = 0;

        for (int i = startNumber; i <= endNumber ; i++) {
            System.out.print(i + " " );
            sum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
