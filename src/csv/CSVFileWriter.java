package csv;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CSVFileWriter {
    private static final String DELIMITER = ",";
    private static final String LINE_SEPARATOR = "\n";

    private static final String FILE_HEADER = "id,Jméno,Příjmení,věk";

    private static void writeCsvHeader(String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.append(FILE_HEADER);
            fileWriter.append(LINE_SEPARATOR);
        } catch (IOException ex) {
            System.out.println("ajajajajajaj, soubor nešlo zapsat");
        }
    }

    public static void writeCsvFile(String fileName, Student student, boolean header) {
        try(FileWriter fileWriter = new FileWriter(fileName, true)) {
            if(header) {
                writeCsvHeader(fileName);
            }

            fileWriter.append(student.getId());
            fileWriter.append(DELIMITER);
            fileWriter.append(student.getJmeno());
            fileWriter.append(DELIMITER);
            fileWriter.append(student.getPrijmeni());
            fileWriter.append(DELIMITER);
            fileWriter.append(student.getVek());
            fileWriter.append(LINE_SEPARATOR);
        } catch (IOException ex) {
            System.out.println("ajajajajajaj, soubor nešlo zapsat");
        }
    }
    public static void writeListCsvFile(String fileName, ArrayList<Student> seznam_studentu, boolean header) {
        if(header) {
            writeCsvHeader(fileName);
        }
        for(Student student: seznam_studentu) {
            writeCsvFile(fileName, student, false);
        }
    }
}
