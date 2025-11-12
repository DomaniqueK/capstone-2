import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Receipt {
    Pizza currentOrder;

    public static void saveReceipt(Pizza order) {
        String time = generateTime();
        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/receipt.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Receipt: \n");
            bufferedWriter.write("Nique's Pizza-Licious Pizzeria \n");
            bufferedWriter.write("Order date: " + time + "\n");
            for (String selection : order.premiumMeat) {
                bufferedWriter.write("Meat: " + selection + "\n");
            }
            for (String selection: order.premiumCheese) {
                bufferedWriter.write("Cheese: " + selection + "\n");
            }
            for (String selection : order.includedToppings) {
                bufferedWriter.write("Included Toppings: " + selection + "\n");
            }
            bufferedWriter.write("\n Total: $ " + order.totalPrice + "\n");
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
