import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    public static void saveReceipt(Order order) {
        String time = generateTime();
        String filePath = "src/main/resources/receipts";
        String receiptName = filePath + "/" + time + ".txt";
        Pizza pizza = order.getCurrentPizza();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(receiptName))) {

            bufferedWriter.write("Receipt: \n");
            bufferedWriter.write("Nique's Pizzeria \n");
            bufferedWriter.write("Order date: " + time + "\n");
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

            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("Error printing receipts!" + e);
        }
    }

    private static String generateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        LocalDateTime date = LocalDateTime.now();
        return date.format(formatter);
    }
}
