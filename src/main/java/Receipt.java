import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
    Pizza currentOrder;

    public static void saveReceipt(Order currentOrder) {
        String time = generateTime();
        Pizza pizza = currentOrder.getCurrentPizza();
        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/receipt.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Receipt: \n");
            bufferedWriter.write("Nique's Pizza-Licious Pizzeria \n");
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
            for (String selection : currentOrder.getDrinks()) {
                bufferedWriter.write("Drink: " + selection + "\n");
            }
            for (String selection : currentOrder.getGarlicKnots()) {
                bufferedWriter.write("Garlic Knots: " + selection + "\n");
            }
            bufferedWriter.write("\n Total: $ " + currentOrder.getTotalPrice() + "\n");
            bufferedWriter.write("Visit us again soon!");

            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("Error printing receipt!" + e);
        }
    }

    public static String generateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        LocalDateTime date = LocalDateTime.now();
        return date.format(formatter);
    }
}
