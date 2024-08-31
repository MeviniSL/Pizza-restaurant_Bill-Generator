import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Pizza Bill Generator!");

            // Pizza selection
            System.out.println("Select your pizza type:");
            System.out.println("1. Vegetarian Pizza");
            System.out.println("2. Non-Vegetarian Pizza");
            System.out.println("3. Deluxe Vegetarian Pizza");
            System.out.println("4. Deluxe Non-Vegetarian Pizza");
            System.out.println("5. Spicy Chicken Pizza");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            if (choice == 6) {
                System.out.println("Thank you for using the Pizza Bill Generator!");
                break;
            }

            Pizza pizza;

            switch (choice) {
                case 1:
                    pizza = new Pizza(true);
                    break;
                case 2:
                    pizza = new Pizza(false);
                    break;
                case 3:
                    pizza = new DeluxPizza(true);
                    break;
                case 4:
                    pizza = new DeluxPizza(false);
                    break;
                case 5:
                    pizza = new SpicyChickenPizza();
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to Vegetarian Pizza.");
                    pizza = new Pizza(true);
                    break;
            }

            // Get pizza quantity
            System.out.println("Enter the quantity of pizzas:");
            int quantity = scanner.nextInt();

            // Extra options for non-deluxe pizzas
            if (!(pizza instanceof DeluxPizza || pizza instanceof SpicyChickenPizza)) {
                System.out.println("Would you like to add extra cheese? (yes/no)");
                String extraCheese = scanner.next();
                if (extraCheese.equalsIgnoreCase("yes")) {
                    pizza.addExtraCheese();
                }

                System.out.println("Would you like to add extra toppings? (yes/no)");
                String extraToppings = scanner.next();
                if (extraToppings.equalsIgnoreCase("yes")) {
                    pizza.addExtraToppings();
                }
            }

            System.out.println("Would you like to take away? (yes/no)");
            String takeAway = scanner.next();
            if (takeAway.equalsIgnoreCase("yes")) {
                pizza.takeAway();
            }

            // Generate and print the bill
            int totalCost = pizza.calculateTotalCost() * quantity;
            System.out.println("Bill for " + quantity + " pizzas:");
            pizza.getBill();
            System.out.println("Total cost for " + quantity + " pizzas: Rs." + totalCost);
        }

        scanner.close();
    }
}
