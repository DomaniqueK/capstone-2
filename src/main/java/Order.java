import java.util.ArrayList;

public class Order {
    private Pizza currentPizza;
    private ArrayList<String> drinks;
    private ArrayList<String> garlicKnots;
    private double otherProducts;

    public Order(Pizza pizza) {
        this.currentPizza = pizza;
        this.drinks = new ArrayList<>();
        this.garlicKnots = new ArrayList<>();
        this.otherProducts = 0.0;
    }

    public void addDrink(String flavor, String size, double price) {
        this.drinks.add(flavor);
        this.otherProducts += price;
    }

    public void addGarlicKnots(String size, double price) {
        this.garlicKnots.add(size);
        this.otherProducts += price;
    }

    public double getTotalPrice() {
        return this.currentPizza.getPrice() + this.otherProducts;
    }

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

