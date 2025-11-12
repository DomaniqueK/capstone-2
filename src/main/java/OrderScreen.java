import java.util.Scanner;

public class OrderScreen {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        newOrder();
    }

    public static void newOrder() {
        Pizza currentPizza = new Pizza();
        Checkout confirmation = new Checkout(currentPizza);
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
        //             Pizza;
                    break;
                case "2":
                    OtherProducts.getDrink();
                    break;
                case "3":
                    OtherProducts.getGarlicKnots();
                    break;
                case "4":
                    Checkout.();
                    running = false;
                    break;
                case "5":
                    Checkout.cancelOrder();
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please select and option in range (1-5)!");
            }
        }
    }
}
