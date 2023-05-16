package P01_BasicSyntaxConditionalStatementsAndLoops.P01_Lectures;

import java.util.Scanner;

public class P04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.next());
        int minutes = Integer.parseInt(scanner.next());

        int allMinutes = (hours * 60) + minutes + 30;

        int newHour = allMinutes / 60;
        int newMinutes = allMinutes % 60;

        if (newHour <= 23){
            System.out.printf("%d:%02d", newHour, newMinutes);
        } else {
            newHour = 0;
            System.out.printf("%d:%02d", newHour, newMinutes);
        }
    }
}
