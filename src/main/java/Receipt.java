import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Receipt {
    public static void main(String[] args) {
        saveReceipt();
        generateTime();
    }

    public static void  saveReceipt() {
        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/Receipts");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        } catch (IOException e) {
            System.out.println("Error! Please try again!" + e);
        }
    }

    public static void generateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
    }
}
