import java.util.Scanner;

public class OrderScreen {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        newOrder();
    }

    public static void newOrder() {
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
   //                 pizza;
                case "2":
    //                drinks;
                case "3":
   //                 garlicKnots;
                case "4":
                    Checkout.checkout();
                case "5":
                    Checkout.cancelOrder();
                default:
                    System.out.println("Invalid choice! Please select and option in range (1-5)!");
            }
        }
    }
}
