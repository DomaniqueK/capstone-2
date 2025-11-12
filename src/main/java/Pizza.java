import java.util.ArrayList;

public class Pizza {
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
        if (meat.equalsIgnoreCase("Extra meat")) {

            if (this.size.equalsIgnoreCase("8-inch")) {
                meatPrice = 1.00 + .50;
            } else if (this.size.equalsIgnoreCase("12-inch")) {
                meatPrice = 2.00 + .50;
            } else if (this.size.equalsIgnoreCase("16-inch")) {
                meatPrice = 3.00 + 1.50;

            }
            else {
                if (this.size.equalsIgnoreCase("8-inch")) {
                    meatPrice = 1.00;
                } else if (this.size.equalsIgnoreCase("12-inch")) {
                    meatPrice = 2.00;
                } else if (this.size.equalsIgnoreCase("16-inch")) {
                    meatPrice = 3.00;
                }
            }
        }
        this.totalPrice += meatPrice;
    }

    public void addCheese(String cheese) {
        double cheesePrice = 0.00;
        this.premiumCheese.add(cheese);
        if (cheese.equalsIgnoreCase("Extra cheese")) {

            if (this.size.equalsIgnoreCase("8-inch")) {
                cheesePrice = .75 + .30;;
            }
            if (this.size.equalsIgnoreCase("12-inch")) {
                cheesePrice = 1.50 + .60;
            }
            if (this.size.equalsIgnoreCase("16-inch")) {
                cheesePrice = 2.25 + .90;

            }
            else {
                if (this.size.equalsIgnoreCase("8-inch")) {
                    cheesePrice = .75;
                } else if (this.size.equalsIgnoreCase("12-inch")) {
                    cheesePrice = 1.50;
                } else if (this.size.equalsIgnoreCase("16-inch")) {
                    cheesePrice = 2.25;
                }
            }
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

    public ArrayList<String> getSummary(ArrayList<String> premiumMeat, ArrayList<String> premiumCheese) {
       return premiumCheese;

    }

}
