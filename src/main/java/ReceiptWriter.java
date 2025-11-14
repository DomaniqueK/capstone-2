import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    private static String generateTime() { // This method generates time as a string and is formatted so it writes correctly on the receipt file
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
        LocalDateTime date = LocalDateTime.now();
        return date.format(formatter);
    }
    // This method takes the entire order as input and encapsulates it on the receipt file
    public static void saveReceipt(Order order) {
        String time = generateTime();
        String filePath = "src/main/resources/receipts";
        Pizza pizza = order.getCurrentPizza();

        // Set up FileWriter and BufferedWriter (try with resources) to write to the receipt file
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {

            bufferedWriter.write("Receipt: \n");
            bufferedWriter.write("Nique's Pizzeria \n");
            bufferedWriter.write("Order date: " + time + "\n");
            bufferedWriter.write("\n ORDER DETAILS \n ");
            bufferedWriter.write("Size: " + pizza.size + "\n");
            bufferedWriter.write("Crust: " + pizza.crust + "\n");

            // Used for loops to iterate over the ArrayLists of toppings,drinks, knots and listing them on the receipt
            for (String selection : pizza.getPremiumMeat()) {
                bufferedWriter.write("Meat: " + selection + "\n");
            }
            for (String selection: pizza.getPremiumCheese()) {
                bufferedWriter.write("Cheese: " + selection + "\n");
            }
            for (String selection : pizza.getIncludedToppings()) {
                bufferedWriter.write("Included Toppings: " + selection + "\n");
            }
            for (String selection : order.getDrinks()) {
                bufferedWriter.write("Drink: " + selection + "\n");
            }
            for (String selection : order.getGarlicKnots()) {
                bufferedWriter.write("Garlic Knots: " + selection + "\n");
            }
            bufferedWriter.write("\n ----------------------------------- \n");
            bufferedWriter.write("\n Total: $ " + order.getTotalPrice() + "\n");
            bufferedWriter.write("Visit us again soon!");

        } catch (IOException e) { // Catches errors writing to the file
            System.out.println("Error printing receipt!" + e);
        }
    }
}
