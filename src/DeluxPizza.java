public class DeluxPizza extends Pizza {
    private static final int DELUXE_VEG_PRICE = 500; // Price for Deluxe Vegetarian Pizza
    private static final int DELUXE_NON_VEG_PRICE = 600; // Price for Deluxe Non-Vegetarian Pizza

    public DeluxPizza(boolean veg) {
        super(veg);
        // Set the base price based on whether it's vegetarian or non-vegetarian
        if (veg) {
            setBasePrice(DELUXE_VEG_PRICE);
        } else {
            setBasePrice(DELUXE_NON_VEG_PRICE);
        }

        addExtraCheese();
        addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
        // Optional: Override this if needed, or remove this method
        System.out.println("Extra cheese is already included in the deluxe pizza.");
    }

    @Override
    public void addExtraToppings() {
        // Optional: Override this if needed, or remove this method
        System.out.println("Extra toppings are already included in the deluxe pizza.");
    }
}
