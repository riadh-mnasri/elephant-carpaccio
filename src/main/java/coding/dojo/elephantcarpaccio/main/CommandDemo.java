package coding.dojo.elephantcarpaccio.main;

import coding.dojo.elephantcarpaccio.CommandCalculator;

import java.util.Scanner;

public class CommandDemo {

    public static void main(String[] args) {
        CommandCalculator calculator = new CommandCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantity : ");
        int quantity = scanner.nextInt();
        System.out.println("UnitPriceHt : ");
        double unitPriceHt = scanner.nextDouble();
        System.out.println("State Code : ");
        String stateCode = scanner.next();
        double result = calculator.calculate(quantity, unitPriceHt, CommandCalculator.TvaState.parse(stateCode));
        System.out.println("Command value = " + result);
    }
}
