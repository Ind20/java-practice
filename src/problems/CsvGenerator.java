package problems;

import java.io.FileWriter;
import java.io.IOException;

public class CsvGenerator {
    public static void main(String[] args) {
        String csvFilePath = "C:\\Users\\Asus\\Desktop\\users.csv";

        try (FileWriter writer = new FileWriter(csvFilePath)) {
            // Write header
            writer.write("username,password,email\n");

            // Generate and write 10 rows of data
            for (int i = 1; i <= 10; i++) {
                String username = "username" + i;
                String password = "password" + i;
                String email    = "email" +i+ "@gmail.com";

                writer.write(username + "," + password + "," +email+ "\n");
            }

            System.out.println("CSV file generated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
