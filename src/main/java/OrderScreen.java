import java.util.Scanner;

public class OrderScreen {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        newOrder();
    }

    private static void newOrder() {
        boolean running = true;
        while (running) {
            System.out.println("Order Screen");
            System.out.println("1) Pizza");
            System.out.println("2) Drinks");
            System.out.println("3) Garlic Knots");
            System.out.println("4) Checkout");
            System.out.println("5) Cancel order");
            System.out.print("Enter your selection: ");
        }
    }
}
