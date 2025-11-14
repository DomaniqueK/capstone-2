import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    private static String generateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
        LocalDateTime date = LocalDateTime.now();
        return date.format(formatter);
    }

    public static void saveReceipt(Order order) {
        String time = generateTime();
        String filePath = "src/main/resources/receipts";
        Pizza pizza = order.getCurrentPizza();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {

            bufferedWriter.write("Receipt: \n");
            bufferedWriter.write("Nique's Pizzeria \n");
            bufferedWriter.write("Order date: " + time + "\n");
            bufferedWriter.write("\n ORDER DETAILS \n ");
            bufferedWriter.write("Size: " + pizza.size + "\n");
            bufferedWriter.write("Crust: " + pizza.crust + "\n");

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

        } catch (IOException e) {
            System.out.println("Error printing receipts!" + e);
        }
    }
}
