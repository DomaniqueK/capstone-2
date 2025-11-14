import java.util.Scanner;

public class HomeScreen {
    static Scanner scanner = new Scanner(System.in);
    static OrderScreen newOrder = new OrderScreen();

    public static void main(String[] args) {
        displayHomeScreen();
    }

    public static void displayHomeScreen() {
        boolean running = true;
        while (running) {
            System.out.println("\n Home Screen \n");
            System.out.println("Welcome to Nique's Pizzeria");
            System.out.println("1) New Order");
            System.out.println("2) Exit");
            System.out.print("Enter you choice: ");

            String choice = scanner.nextLine().toUpperCase().trim();
            switch (choice) {
                case "1":
                    OrderScreen.newOrder();
                    break;
                case "2":
                    running = false;
                    System.out.println("Exiting Application");
                    break;
                default:
                    System.out.println("Invalid choice! Please select: 1 or 2 ");
            }
        }
    }
}
