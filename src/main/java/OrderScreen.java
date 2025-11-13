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
                    customizePizza(currentPizza);
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
        double twelveInch = 12.00;
        double sixteenInch = 16.50;

        while (!validChoice) {
            System.out.println("\n Pizza Sizes: \n");
            System.out.printf("1) 8-inch %.2f%n", eightInch);
            System.out.printf("2) 12-inch %.2f%n", twelveInch);
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
    public static void customizePizza(Pizza currentPizza) {
        boolean customize = true;
        while (customize) {
            System.out.println("\n Customize Your Pizza \n");
            System.out.println("1) Add Premium Meat");
            System.out.println("2) Add Premium Cheese");
            System.out.println("3) Add Included Toppings/Sauce");
            System.out.println("4) Customization finished");
            System.out.print("Enter your selection: ");

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    getMeat(currentPizza);
                    break;
                case "2":
                    getCheese(currentPizza);
                    break;
                case "3":
                    getIncludedToppings(currentPizza);
                    break;
                case "4":
                    customize = false;
                    System.out.println("Customization complete. Returning to Order Screen.");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }
    private static void getMeat(Pizza pizza){
        boolean addingMeat = true;
        while (addingMeat) {
            System.out.println("\n PREMIUM MEATS \n ");
            System.out.printf("1) %s%n", Selections.pepperoni);
            System.out.printf("2) %s%n", Selections.sausage);
            System.out.printf("3) %s%n", Selections.ham);
            System.out.printf("4) %s%n", Selections.bacon);
            System.out.printf("5) %s%n", Selections.chicken);
            System.out.printf("6) %s%n", Selections.meatball);
            System.out.printf("7) %s%n", Selections.extraMeat);
            System.out.println("8) Done Adding meat");
            System.out.print("Enter selection (1-8): ");

            String choice = scanner.nextLine().trim();
            String toppings = null;
            switch (choice) {
                case "1":
                    toppings = Selections.pepperoni;
                    break;
                case "2":
                    toppings = Selections.sausage;
                    break;
                case "3":
                    toppings = Selections.ham;
                    break;
                case "4":
                    toppings = Selections.bacon;
                    break;
                case "5":
                    toppings = Selections.chicken;
                    break;
                case "6":
                    toppings = Selections.meatball;
                    break;
                case "7":
                    toppings = Selections.extraMeat;
                    break;
                case "8":
                    addingMeat = false;
                    return;
                default:
                    System.out.println("Invalid selection. Please choose an option (1-8).");
                    continue;
            }
            pizza.addMeat(toppings);
            System.out.printf("%s added! Current total: $%.2f%n", toppings, pizza.getPrice());
        }
    }

    private static void getCheese(Pizza pizza) {
        boolean addingCheese = true;
        while (addingCheese) {
            System.out.println("\n PREMIUM CHESSE \n ");
            System.out.printf("1) %s%n", Selections.pepperoni);
            System.out.printf("2) %s%n", Selections.sausage);
            System.out.printf("3) %s%n", Selections.ham);
            System.out.printf("4) %s%n", Selections.bacon);
            System.out.println("5) Done Adding Cheese ");
            System.out.print("Enter selection (1-5): ");

            String choice = scanner.nextLine().trim();
            String toppings = null;
            switch (choice) {
                case "1":
                    toppings = Selections.mozzarella;
                    break;
                case "2":
                    toppings = Selections.parmesan;
                    break;
                case "3":
                    toppings = Selections.ricotta;
                    break;
                case "4":
                    toppings = Selections.extraCheese;
                    break;
                case "5":
                    addingCheese = false;
                    return;
                default:
                    System.out.println("Invalid selection. Please choose an option (1-5).");
                    continue;
            }
            pizza.addCheese(toppings);
            System.out.printf("%s added! Current total: $%.2f%n", toppings, pizza.getPrice());
        }
    }

    private static void getIncludedToppings(Pizza pizza) {
            boolean addingIncludedToppings = true;
            while (addingIncludedToppings) {
                System.out.println("\n INCLUDED TOPPINGS AND SAUCES (FREE )\n ");
                System.out.printf("1) %s%n", Selections.onions);
                System.out.printf("2) %s%n", Selections.bellPeppers);
                System.out.printf("3) %s%n", Selections.pineapples);
                System.out.printf("4) %s%n", Selections.spinach);
                System.out.printf("5) %s%n", Selections.basil);
                System.out.printf("6) %s%n", Selections.olives);
                System.out.printf("7) %s%n", Selections.marinara);
                System.out.printf("8) %s%n", Selections.alfredo);
                System.out.printf("9) %s%n", Selections.pesto);
                System.out.printf("10) %s%n", Selections.bbq);
                System.out.printf("11) %s%n", Selections.buffalo);
                System.out.println("12) Done Adding Included Toppings ");
                System.out.print("Enter selection (1-12): ");

                String choice = scanner.nextLine().trim();
                String toppings = null;
                switch (choice) {
                    case "1":
                        toppings = Selections.onions;
                        break;
                    case "2":
                        toppings = Selections.bellPeppers;
                        break;
                    case "3":
                        toppings = Selections.pineapples;
                        break;
                    case "4":
                        toppings = Selections.spinach;
                        break;
                    case "5":
                        toppings = Selections.basil;
                        break;
                    case "6":
                        toppings = Selections.olives;
                        break;
                    case "7":
                        toppings = Selections.marinara;
                        break;
                    case "8":
                        toppings = Selections.alfredo;
                        break;
                    case "9":
                        toppings = Selections.pesto;
                        break;
                    case "10":
                        toppings = Selections.bbq;
                        break;
                    case "11":
                        toppings = Selections.buffalo;
                        break;
                    case "12":
                        addingIncludedToppings = false;
                        return;
                    default:
                        System.out.println("Invalid selection. Please choose an option (1-12).");
                        continue;
                }
                pizza.addIncludedToppings(toppings);
                System.out.printf("%s added! Current total: $%.2f%n", toppings, pizza.getPrice());
            }
    }
}
