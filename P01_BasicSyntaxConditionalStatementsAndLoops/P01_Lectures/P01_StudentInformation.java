package P01_BasicSyntaxConditionalStatementsAndLoops.P01_Lectures;

import java.util.Scanner;

public class P01_StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int ages = Integer.parseInt(scanner.next());
        double grade = Double.parseDouble(scanner.next());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, ages, grade);

    }
}
