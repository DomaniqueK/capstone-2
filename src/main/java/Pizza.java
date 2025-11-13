import java.util.ArrayList;

public class Pizza {
    private double eightInch = 8.50;
    private double twelveInch = 12.00;
    private double sixteenInch = 16.50;
    ArrayList<String> premiumMeat = new ArrayList<>();
    ArrayList<String> premiumCheese = new ArrayList<>();
    ArrayList<String> includedToppings = new ArrayList<>();
    double totalPrice;
    String meat;
    String cheese;
    String size;
    String toppingsIncluded;

    public void addMeat(String meat) {
        this.premiumMeat.add(meat);
        double meatPrice = 0.0;
        double extraMeat = 0.0;

            if (this.size.equalsIgnoreCase("8-inch")) {
                meatPrice = 1.00;
                extraMeat = .50;
            } else if (this.size.equalsIgnoreCase("12-inch")) {
                meatPrice = 2.00;
                extraMeat = 1.00;
            } else if (this.size.equalsIgnoreCase("16-inch")) {
                meatPrice = 3.00;
                extraMeat = 1.50;
            }
            else {
                System.out.println("Error! Please select pizza size!");
                return;
                }
        if (meat.equalsIgnoreCase(Selections.extraMeat)) {
            meatPrice += extraMeat;
        }
        this.totalPrice += meatPrice;
    }

    public void addCheese(String cheese) {
        double cheesePrice = 0.00;
        double extraCheese = 0.00;
        this.premiumCheese.add(cheese);

            if (this.size.equalsIgnoreCase("8-inch")) {
                cheesePrice = .75;
                extraCheese = .30;
            }
            else if (this.size.equalsIgnoreCase("12-inch")) {
                cheesePrice = 1.50;
                extraCheese = .60;
            }
            else if (this.size.equalsIgnoreCase("16-inch")) {
                cheesePrice = 2.25;
                extraCheese = .90;
            }
            else {
                System.out.println("Error! Please select pizza size!");
               return;
            }
            if (cheese.equalsIgnoreCase(Selections.extraCheese)) {
                cheesePrice += extraCheese;
            }
        this.totalPrice += cheesePrice;
    }

    public void addIncludedToppings(String toppingsIncluded) {
        this.includedToppings.add(toppingsIncluded);
        double included = 0.0;
    }

    public double getPrice() {
        return totalPrice;
    }

    public ArrayList<String> getPremiumMeat() {
        return premiumMeat;
    }
    public ArrayList<String> getPremiumCheese() {
        return premiumCheese;
    }
    public ArrayList<String> getIncludedToppings() {
        return includedToppings;
    }

    public Pizza() {

    }
    public void setSizeAndBasePrice(String size) {
        this.size = size;

        if (size.equalsIgnoreCase("8-inch")) {
            this.totalPrice = 8.50;
        } else if (size.equalsIgnoreCase("12-inch")) {
            this.totalPrice = 12.00;
        } else if (size.equalsIgnoreCase("16-inch")) {
            this.totalPrice = 16.50;
        }
    }
}
