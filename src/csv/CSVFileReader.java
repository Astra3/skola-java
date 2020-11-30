package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVFileReader {
    private static final String DELIMITER = ",";

    public static ArrayList<Student> readCsvFile(String fileName) {
        ArrayList<Student> studenti = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(DELIMITER);
                if(tokens.length > 0) {
                    studenti.add(new Student(tokens[0], tokens[1], tokens[2], tokens[3]));
                }
            }
        } catch (IOException ex) {
            System.out.println("nepodařilo se přečíst soubor");
        }
        return studenti;
    }
    public static Student readCsvFile(String fileName, int index) {
        return readCsvFile(fileName).get(index);
    }
}
