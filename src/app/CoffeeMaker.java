package app;

import java.util.Scanner;

public class CoffeeMaker {
    private CoffeeMachine coffeeMachine;

    public CoffeeMaker() {
        this.coffeeMachine = new CoffeeMachine();
    }

    public void chooseDrink() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a drink:");
            System.out.println("0 - Exit");
            System.out.println("1 - Espresso");
            System.out.println("2 - Cappuccino");
            System.out.println("3 - Latte");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            coffeeMachine.makeDrink(choice);
        }
    }
}
