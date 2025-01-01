import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ExampleWriterReader {

    public static void main(String[] args) {
        String filePath = "bg.txt"; // Path to the file

        // Write data to the file
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("dcnbvib");
            System.out.println("Data written to bg.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Read data from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Data read from bg.txt:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}
