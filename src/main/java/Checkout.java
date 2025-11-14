public class Checkout {
    Order currentOrder;
    ReceiptWriter receiptWriter;

    public Checkout(Order order) {
        this.currentOrder = order;
        this.receiptWriter = new ReceiptWriter();
    }

    public void checkout() {
        System.out.println("-----------------------------------");
        System.out.println("           Order Details           ");
        System.out.println("-----------------------------------");
        System.out.println("Size: " + this.currentOrder.getCurrentPizza().size);
        System.out.println("Crust: " + this.currentOrder.getCurrentPizza().crust);
        System.out.println("Drinks: " + this.currentOrder.getDrinks());
        System.out.println("Garlic Knots: " + this.currentOrder.getGarlicKnots());
        double checkoutPrice = this.currentOrder.getTotalPrice();
        System.out.println("-----------------------------------");
        System.out.printf("Total: $%.2f%n", + checkoutPrice);
        this.receiptWriter.saveReceipt(this.currentOrder);
        System.out.println("Thank you for your order! Please come again!");
    }

    public void cancelOrder() {
        System.out.println("-----------------------------------");
        System.out.println("           ORDER CANCELLED!           ");
        System.out.println("-----------------------------------");
    }
}
