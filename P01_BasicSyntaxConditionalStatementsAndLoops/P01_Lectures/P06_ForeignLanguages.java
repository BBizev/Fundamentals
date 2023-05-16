package P01_BasicSyntaxConditionalStatementsAndLoops.P01_Lectures;

import java.util.Scanner;

public class P06_ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.next();

        if (country.equals("USA") || country.equals("England")) {
            System.out.println("English");
        } else if (country.equals("Mexico") || country.equals("Spain") || country.equals("Argentina")) {
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }
    }
}
