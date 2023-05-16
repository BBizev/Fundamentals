package P01_BasicSyntaxConditionalStatementsAndLoops.P01_Lectures;

import java.util.Scanner;

public class P02_Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.next());

        if (grade >= 3){
            System.out.printf("Passed!");
        }
    }
}
