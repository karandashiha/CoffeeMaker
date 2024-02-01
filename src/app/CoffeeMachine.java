package app;

public class CoffeeMachine {
    private Coffee espresso;
    private Coffee cappuccino;
    private Coffee latte;

    public CoffeeMachine() {
        this.espresso = new Espresso();
        this.cappuccino = new Cappuccino();
        this.latte = new Latte();
    }

    public void makeDrink(int choice) {
        Coffee coffee;

        switch (choice) {
            case 1:
                coffee = espresso;
                break;
            case 2:
                coffee = cappuccino;
                break;
            case 3:
                coffee = latte;
                break;
            default:
                System.out.println("Wrong choice. Try again.");
                return;
        }

        System.out.println("Your " + coffee.getName() + " is ready. Enjoy :)");
    }
}
