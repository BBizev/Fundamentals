package P01_BasicSyntaxConditionalStatementsAndLoops.P01_Exercises;

import java.util.Scanner;

public class P01_Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ages = Integer.parseInt(scanner.next());

        if (ages >= 0 && ages <= 2){
            System.out.println("baby");
        } else if (3 <= ages && ages <= 13) {
            System.out.println("child");
        } else if (14 <= ages && ages <= 19) {
            System.out.println("teenager");
        } else if (20 <= ages && ages <= 65) {
            System.out.println("adult");
        } else if (ages >= 66) {
            System.out.println("elder");
        }
    }
}
