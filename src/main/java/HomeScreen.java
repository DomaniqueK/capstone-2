import java.util.Scanner;

public class HomeScreen { // Manages the user interface and navigation
    static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) { // Calls the displayHomeScreen method
        displayHomeScreen();
    }

    public static void displayHomeScreen() {
        boolean running = true; // Use a boolean and while loop to keep the application active until the user chooses to exit
        while (running) {
            System.out.println("\n Home Screen \n");
            System.out.println(" ======================================== \n");
            System.out.println(" 🍕WELCOME TO NIQUE'S PIZZERIA 🍕");
            System.out.println("\n ======================================== \n");
            System.out.println("   The Freshest Pizza in Town!");
            System.out.println("------------------------------------------ ");
            System.out.println("1) New Order");
            System.out.println("2) Exit");
            System.out.print("Enter you choice: ");

            String choice = scanner.nextLine().toUpperCase().trim();
            switch (choice) { // Handles the choices made above
                case "1":
                    OrderScreen.newOrder(); // Gives control to the order screen class new order method
                    break;
                case "2":
                    running = false;
                    System.out.println("Exiting Application"); // Exits the loop and terminates the transaction
                    break;
                default:
                    System.out.println("Invalid choice! Please select: 1 or 2 "); // Handles input outside of the choices thet are given
            }
        }
    }

}
