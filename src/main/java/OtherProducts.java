import java.util.Scanner;

public class OtherProducts {
    private Scanner scanner;
    private Order currentOrder;

    public OtherProducts(Order order, Scanner scanner) {
        this.currentOrder = order;
        this.scanner = scanner;
    }

    public void getDrink() {
        double small = 2.00;
        double medium = 2.50;
        double large = 3.00;

        System.out.println("\n Drink Menu \n");
        System.out.println("Sizes: Small: $" + small + " | Medium: $" + medium + " | Large: $" + large);
        System.out.println("1) Coke");
        System.out.println("2) Diet Coke");
        System.out.println("3) Rootbeer");
        System.out.println("4) Orange Fanta");
        System.out.println("5 Strawberry Fanta");
        System.out.println("6) Lemonade");
        System.out.println("7) Pink Lemonade");
        System.out.println("8) Water");
        System.out.print("Enter drink number and size:");

        String input = scanner.nextLine().trim();

        String[] parts = input.split(" ");
        if (parts.length != 2) {
            System.out.println("Please try again.");
            return;
        }

        String flavor = parts[0];
        String size = parts[1];
        String drink = getFlavor(flavor);
        double price = getDrinkPrice(size, small, medium, large);

        if (drink != null && price > 0.0) {
            String flavorChoice = size + " " + drink;
            this.currentOrder.addDrink(drink, size, price);
            System.out.printf("%s added for $%.2f.%n", flavorChoice, price);
        } else {
            System.out.println("Invalid selection please try again.");
        }
    }

    private String getFlavor(String choice) {
        switch (choice) {
            case "1":
               return  "Coke";
            case "2":
                return "Diet Coke";
            case "3":
                return  "Rootbeer";
            case "4":
                return  "Orange Fanta";
            case "5":
                return  "Strawberry Fanta";
            case "6":
                return  "Lemonade";
            case "7":
                return  "Pink Lemonade";
            case "8":
                return  "Water";
            default: return null;
        }
    }

    private double getDrinkPrice(String size, double s, double m, double l) {
        if (size.equalsIgnoreCase("Small")) return s;
        if (size.equalsIgnoreCase("Medium")) return m;
        if (size.equalsIgnoreCase("Large")) return l;
        return 0.0;
    }

    public void getGarlicKnots() {
        double knotPrice = 1.50;
        String garlicKnots = "Small Garlic Knots";
        System.out.printf("Adding Garlic Knots to your order for $%2f%n. Enter yes to confirm or 'c' to cancel", knotPrice);
        String input = scanner.nextLine().trim();

        if(!input.equalsIgnoreCase("c")) {
            this.currentOrder.addGarlicKnots(garlicKnots, knotPrice);
        } else {
            System.out.println("No Garlic Knots for you!");
        }
    }
}