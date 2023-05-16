package P01_BasicSyntaxConditionalStatementsAndLoops.P01_Exercises;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = Integer.parseInt(scanner.next());
        String typePeople = scanner.next();
        String days = scanner.next();

        double priceTypePeople = 0;

        if (typePeople.equals("Students")) {
            if (days.equals("Friday")) {
                priceTypePeople = 8.45;
            } else if (days.equals("Saturday")) {
                priceTypePeople = 9.80;
            } else if (days.equals("Sunday")) {
                priceTypePeople = 10.46;
            }
            if (numPeople >= 30){
                priceTypePeople = priceTypePeople * 0.85;
            }
        } else if (typePeople.equals("Business")) {
            if (days.equals("Friday")) {
                priceTypePeople = 10.90;
            } else if (days.equals("Saturday")) {
                priceTypePeople = 15.60;
            } else if (days.equals("Sunday")) {
                priceTypePeople = 16;
            }
            if (numPeople >= 100){
                numPeople -= 10;
            }
        } else if (typePeople.equals("Regular")) {
            if (days.equals("Friday")) {
                priceTypePeople = 15;

            } else if (days.equals("Saturday")) {
                priceTypePeople = 20;
            } else if (days.equals("Sunday")) {
                priceTypePeople = 22.50;
            }
            if (numPeople >= 10 && numPeople <= 20){
                priceTypePeople = priceTypePeople * 0.95;
            }
        }

        double allPeoplePrice = priceTypePeople * numPeople;
        System.out.printf("Total price: %.2f", allPeoplePrice);

    }
}
