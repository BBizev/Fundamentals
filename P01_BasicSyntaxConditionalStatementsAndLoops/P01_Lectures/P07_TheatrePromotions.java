package P01_BasicSyntaxConditionalStatementsAndLoops.P01_Lectures;

import java.sql.SQLOutput;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class P07_TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.next();
        int ages = Integer.parseInt(scanner.next());

        double priceTicket = 0;

        if (day.equals("Weekday") && 0 <= ages && ages <= 18 ){
            priceTicket = 12;
        } else if (day.equals("Weekday") && 18 < ages && ages <= 64) {
            priceTicket = 18;
        } else if (day.equals("Weekday") && 64 < ages && ages <= 122) {
            priceTicket = 12;
        }

        if (day.equals("Weekend") && 0 <= ages && ages <= 18 ){
            priceTicket = 15;
        } else if (day.equals("Weekend") && 18 < ages && ages <= 64) {
            priceTicket = 20;
        } else if (day.equals("Weekend") && 64 < ages && ages <= 122) {
            priceTicket = 15;
        }

        if (day.equals("Holiday") && 0 <= ages && ages <= 18 ){
            priceTicket = 5;
        } else if (day.equals("Holiday") && 18 < ages && ages <= 64) {
            priceTicket = 12;
        } else if (day.equals("Holiday") && 64 < ages && ages <= 122) {
            priceTicket = 10;
        }

        if (priceTicket > 0){
            System.out.printf("%.0f$", priceTicket);
        } else {
            System.out.println("Error!");
        }

    }
}
