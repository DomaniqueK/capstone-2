import java.util.ArrayList;

public class Order {
    private Pizza currentPizza;
    private ArrayList<String> drinks;
    private ArrayList<String> garlicKnots;
    private double otherProducts;

    //Initializes the order object and requires a pizza object to start the order.
// It instantiates the ArrayLists to ensure they are empty from the beginning
    public Order(Pizza pizza) {
        this.currentPizza = pizza;
        this.drinks = new ArrayList<>();
        this.garlicKnots = new ArrayList<>();
        this.otherProducts = 0.0;
    }

    // Adds drink to the ArrayList and updates the price
    public void addDrink(String flavor, String size, double price) {
        this.drinks.add(flavor);
        this.otherProducts += price;
    }

    // Adds garlic knots to the ArrayList and updates the price
    public void addGarlicKnots(String size, double price) {
        this.garlicKnots.add(size);
        this.otherProducts += price;
    }

    public double getTotalPrice() { // Calculates the total price by calling the getPrice method on the currentPizza object
        return this.currentPizza.getPrice() + this.otherProducts;
    }

    // Getter/Setter methods allows the other classes to read the data and then change it
    public Pizza getCurrentPizza() {
        return currentPizza;
    }

    public void setCurrentPizza(Pizza currentPizza) {
        this.currentPizza = currentPizza;
    }

    public ArrayList<String> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<String> drinks) {
        this.drinks = drinks;
    }

    public ArrayList<String> getGarlicKnots() {
        return garlicKnots;
    }

    public void setGarlicKnots(ArrayList<String> garlicKnots) {
        this.garlicKnots = garlicKnots;
    }

    public double getOtherProducts() {
        return otherProducts;
    }

    public void setOtherProducts(double otherProducts) {
        this.otherProducts = otherProducts;
    }

}

