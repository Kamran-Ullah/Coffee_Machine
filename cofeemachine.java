import java.util.Scanner;

// Class representing a Coffee
class Coffee {
    String type;
    String size;
    String strength;

    public Coffee(String coffeeType, String coffeeSize, String coffeeStrength) {
        type = coffeeType;
        size = coffeeSize;
        strength = coffeeStrength;
    }

    public void dispense() {
        System.out.println("Dispensing a " + size + " " + strength + " " + type + " coffee.");
    }
}

// Class representing a Coffee Machine
class CoffeeMachine {
    public Coffee brewCoffee(String coffeeType, String coffeeSize, String coffeeStrength) {
        // Simulate brewing process
        System.out.println("Brewing a " + coffeeSize + " " + coffeeStrength + " " + coffeeType + " coffee.");
        // Return a Coffee object representing the brewed coffee
        return new Coffee(coffeeType, coffeeSize, coffeeStrength);
    }
}

// Class representing a User
class User {
    Scanner scanner = new Scanner(System.in);

    public String selectCoffeeType() {
        System.out.print("Select coffee type (e.g., espresso, latte, cappuccino): ");
        return scanner.nextLine();
    }

    public String selectCoffeeSize() {
        System.out.print("Select coffee size (e.g., small, medium, large): ");
        return scanner.nextLine();
    }

    public String selectCoffeeStrength() {
        System.out.print("Select coffee strength (e.g., mild, medium, strong): ");
        return scanner.nextLine();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of CoffeeMachine and User
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        User user = new User();

        // User interaction
        String coffeeType = user.selectCoffeeType();
        String coffeeSize = user.selectCoffeeSize();
        String coffeeStrength = user.selectCoffeeStrength();

        // Brew coffee
        Coffee brewedCoffee = coffeeMachine.brewCoffee(coffeeType, coffeeSize, coffeeStrength);

        // Dispense coffee
        brewedCoffee.dispense();
    }
}
