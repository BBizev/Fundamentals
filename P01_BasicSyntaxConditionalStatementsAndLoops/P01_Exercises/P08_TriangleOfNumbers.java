package P01_BasicSyntaxConditionalStatementsAndLoops.P01_Exercises;

import java.util.Scanner;

public class P08_TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.next());

        for (int row = 1; row <= num ; row++) {
            for (int count = 1; count <= row ; count++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

    }
}
