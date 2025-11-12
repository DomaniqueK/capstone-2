import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Receipt {
    public static void main(String[] args) {
        saveReceipt();
        generateTime();
    }

    public static void saveReceipt() {
        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/receipt.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            fileWriter.write("Receipt: \n");

        } catch (IOException e) {
            System.out.println("Error! Please try again!" + e);
        }
    }

    public static void generateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date.format(formatter));

    }
}
