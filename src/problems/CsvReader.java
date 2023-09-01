package problems;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CsvReader {
    public static void main(String[] args) {
        String csvFilePath = "C:\\Users\\Asus\\Desktop\\generated_data.csv";

        try (CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {
            List<String[]> csvData = reader.readAll();

            // Skip the header row
            for (int i = 1; i < csvData.size(); i++) {
                String[] row = csvData.get(i);
                String username = row[0];
                String password = row[1];

               System.out.println("Name: " + username +  ", password: " + password);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
