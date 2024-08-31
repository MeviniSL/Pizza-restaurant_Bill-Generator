public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int takeAwayPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(boolean veg) {
        this.veg = veg;
        this.basePizzaPrice = veg ? 300 : 400;
        this.price = basePizzaPrice;
    }

    public void setBasePrice(int price) {
        this.basePizzaPrice = price;
        this.price = basePizzaPrice;
    }

    public void addExtraCheese() {
        if (!isExtraCheeseAdded) {
            isExtraCheeseAdded = true;
            this.price += extraCheesePrice;
        }
    }

    public void addExtraToppings() {
        if (!isExtraToppingsAdded) {
            isExtraToppingsAdded = true;
            this.price += extraToppingsPrice;
        }
    }

    public void takeAway() {
        if (!isOptedForTakeAway) {
            isOptedForTakeAway = true;
            this.price += takeAwayPrice;
        }
    }

    public int calculateTotalCost() {
        return this.price;
    }

    public void getBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("Base Price: ").append(basePizzaPrice).append("\n");

        if (isExtraCheeseAdded) {
            bill.append("Extra Cheese Added: ").append(extraCheesePrice).append("\n");
        }
        if (isExtraToppingsAdded) {
            bill.append("Extra Toppings Added: ").append(extraToppingsPrice).append("\n");
        }
        if (isOptedForTakeAway) {
            bill.append("Take Away: ").append(takeAwayPrice).append("\n");
        }

        bill.append("Total Bill: ").append(this.price).append("\n");
        System.out.println(bill.toString());
    }
}
