public class Checkout { // Effectively handles the final stages of the customer transactions
    Order currentOrder; // Stores the object that needs to be processed
    ReceiptWriter receiptWriter; // Used to write to the receipt file

    public Checkout(Order order) { // Creates and sets up the checkout process
        this.currentOrder = order;
        this.receiptWriter = new ReceiptWriter();
    }

    public void checkout() { // Finalizes the transaction, prints order details for the customer to see, calculates the final price and saves the receipt to the file
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

    // Clearly states that the user canceled their order and the transaction is over
    public void cancelOrder() {
        System.out.println("-----------------------------------");
        System.out.println("           ORDER CANCELLED!           ");
        System.out.println("-----------------------------------");
    }
}
