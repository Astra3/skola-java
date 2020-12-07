package csv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CSVFileWriter {

    private static final String DELIMITER = ",";
    private static final String LINE_SEPARATOR = "\n";

    public static void writeCsvHeader(String fileName, String File_header)
    {
        try(FileWriter fileWriter = new FileWriter(fileName))
        {
            fileWriter.append(File_header);
            fileWriter.append(LINE_SEPARATOR);
        }
        catch(IOException ex)
        {
            System.out.println("Chyba pri praci s csv souborem");
        }
    }

    public static void writeCsvFile(String fileName, Student student)
    {
        try(FileWriter fileWriter = new FileWriter(fileName,true))
        {
            fileWriter.append(student.getId());
            fileWriter.append(DELIMITER);
            fileWriter.append(student.getJmeno());
            fileWriter.append(DELIMITER);
            fileWriter.append(student.getPrijmeni());
            fileWriter.append(DELIMITER);
            fileWriter.append(student.getVek());
            fileWriter.append(LINE_SEPARATOR);
        }
        catch(IOException ex)
        {
            System.out.println("Chyba pri praci s csv souborem");
        }
    }

    public static void writeCsvFile(String fileName, ArrayList<Student> seznam_studentu)
    {
        try(FileWriter fileWriter = new FileWriter(fileName,true))
        {
           for(Student student : seznam_studentu)
            {
                fileWriter.append(student.getId());
                fileWriter.append(DELIMITER);
                fileWriter.append(student.getJmeno());
                fileWriter.append(DELIMITER);
                fileWriter.append(student.getPrijmeni());
                fileWriter.append(DELIMITER);
                fileWriter.append(student.getVek());
                fileWriter.append(LINE_SEPARATOR);
            }
        }
        catch(IOException ex)
        {
            System.out.println("Chyba pri praci s csv souborem");
        }



    }





}
