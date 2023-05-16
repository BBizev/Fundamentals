package P01_BasicSyntaxConditionalStatementsAndLoops.P01_Exercises;

import java.util.Scanner;

public class P10_NewEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightSabers = Double.parseDouble(scanner.nextLine());
        double  priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double countOfLightSabers = Math.ceil(countOfStudents * 1.1);
        double allMoneyLightSaber = priceOfLightSabers * countOfLightSabers;
        double allMoneyRobes = priceOfRobes * countOfStudents;

        double allMoneyBelts = 0;
        if (countOfStudents < 6){
            allMoneyBelts = priceOfBelts * countOfStudents;
        } else {
            int countBelts = countOfStudents / 6;
            int newCountBelts = countOfStudents - countBelts;
            allMoneyBelts = priceOfBelts * newCountBelts;
        }

        double allMoney = allMoneyBelts + allMoneyRobes + allMoneyLightSaber;

        if (allMoney > amountOfMoney){
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(allMoney - amountOfMoney));
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", allMoney);
        }

    }
}

