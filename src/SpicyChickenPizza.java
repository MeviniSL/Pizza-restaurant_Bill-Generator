public class SpicyChickenPizza extends Pizza {
    private static final int SPICY_CHICKEN_PRICE = 800; // New price for Spicy Chicken Pizza

    public SpicyChickenPizza() {

        super(true); // Use true or false as it will be overridden
        setBasePrice(SPICY_CHICKEN_PRICE); // Set the base price for Spicy Chicken Pizza

        addExtraCheese();
        addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
        // Optionally, you could override this if needed, or remove this method
        System.out.println("Extra cheese is already included in the Spicy Chicken Pizza.");
    }

    @Override
    public void addExtraToppings() {
        // Optionally, you could override this if needed, or remove this method
        System.out.println("Extra toppings are already included in the Spicy Chicken Pizza.");
    }
}

