import java.util.Scanner;

public class OrderScreen {
   static Scanner scanner = new Scanner(System.in);


    public static void newOrder() {
        Pizza currentPizza = getPizzaSize();
        Order currentOrder = new Order(currentPizza);
        OtherProducts otherProducts = new OtherProducts(currentOrder,scanner);
        Checkout confirmation = new Checkout(currentOrder);
        boolean running = true;
        while (running) {
            System.out.println("\n Order Screen \n");
            System.out.println("1) Pizza");
            System.out.println("2) Drinks");
            System.out.println("3) Garlic Knots");
            System.out.println("4) Checkout");
            System.out.println("5) Cancel order");
            System.out.print("Enter your selection: ");

            String choice = scanner.nextLine().toUpperCase().trim();
            switch (choice) {
                case "1":
                    System.out.println("Pizza Customization....");
                    break;
                case "2":
                    otherProducts.getDrink();
                    break;
                case "3":
                    otherProducts.getGarlicKnots();
                    break;
                case "4":
                    confirmation.checkout();
                    running = false;
                    break;
                case "5":
                    confirmation.cancelOrder();
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please select and option in range (1-5)!");
            }
        }
    }
    public static Pizza getPizzaSize() {
        String size = "";
        boolean validChoice = false;
        double eightInch = 8.50;
        double tweleveInch = 12.00;
        double sixteenInch = 16.50;

        while (!validChoice) {
            System.out.println("\n Pizza Sizes: \n");
            System.out.printf("1) 8-inch %.2f%n", eightInch);
            System.out.printf("2) 12-inch %.2f%n", tweleveInch);
            System.out.printf("3) 16-inch %.2f%n", sixteenInch);

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    size = "8-inch";
                    validChoice = true;
                    break;
                case "2":
                    size = "12-inch";
                    validChoice = true;
                    break;
                case "3":
                    size = "16-inch";
                    validChoice = true;
                    break;
                default:
                    System.out.println("Invalid selection! Please try again!");
            }
        }

        Pizza newPizza = new Pizza();
        newPizza.setSizeAndBasePrice(size);
        return newPizza;
    }
}
