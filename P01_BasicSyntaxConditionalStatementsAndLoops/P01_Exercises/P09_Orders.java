package P01_BasicSyntaxConditionalStatementsAndLoops.P01_Exercises;

import java.util.Scanner;

public class P09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        for (int order = 1; order <= orders ; order++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            double finalPrice = ((daysInMonth * capsulesCount) * pricePerCapsule);
            System.out.printf("The price for the coffee is: $%.2f%n", finalPrice);

            sum += finalPrice;
        }

        System.out.printf("Total: $%.2f", sum);

    }
}
