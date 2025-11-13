public class Checkout {
    Order currentOrder;
    public Checkout(Order order) {
        this.currentOrder = order;
    }

    public static void main(String[] args) {

    }

    public void checkout() {
        System.out.println("-----------------------------------");
        System.out.println("           Order Details           ");
        System.out.println("-----------------------------------");
        System.out.println("Size: " + this.currentOrder.getCurrentPizza().size);
        System.out.println("Drinks: " + this.currentOrder.getDrinks());
        System.out.println("Garlic Knots: " + this.currentOrder.getGarlicKnots());
        double checkoutPrice = this.currentOrder.getTotalPrice();
        System.out.println("-----------------------------------");
        System.out.println("Total: $%2f%n," + checkoutPrice);
        System.out.println("Thank you for your order! Please come again!");
    }

    public void cancelOrder() {

    }
}
