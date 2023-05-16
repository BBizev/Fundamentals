package P01_BasicSyntaxConditionalStatementsAndLoops.P01_Lectures;

import java.util.Scanner;

public class P12_EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.next());

        while (num % 2 !=0){
            System.out.println("Please write an even number.");
            num = Integer.parseInt(scanner.next());
        }

        System.out.printf("The number is: %d", Math.abs(num));

    }
}
