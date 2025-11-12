public class Checkout {
    Pizza currentOrder;
    public Checkout(Pizza pizza) {
        this.currentOrder = pizza;
    }

    public static void main(String[] args) {
        cancelOrder();
        confirmation();
    }

    public static void confirmation() {
        System.out.println("-----------------------------------");
        System.out.println("           Order Details           ");
        System.out.println("-----------------------------------");
        System.out.println("Size: " + this.currentOrder.size);
        System.out.println("Meat Toppings: " + this.currentOrder.premiumMeat);
        System.out.println("Cheese Toppings: " + this.currentOrder.premiumCheese);
        System.out.println("Included Toppings: " + this.currentOrder.includedToppings);
        double checkoutPrice = this.currentOrder.getPrice();
        System.out.println("-----------------------------------");
        System.out.println("Total: $%2f%n," + checkoutPrice);
        System.out.println("Thank you for your order! Please come again!");
    }

    public static void cancelOrder() {

    }
}
