package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVFileReader {

    private static final String DELIMITER = ",";

    public static ArrayList<Student> readCsvFile(String fileName)
    {
        ArrayList<Student> studenti = new ArrayList<Student>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName)))
        {
            bufferedReader.readLine();
            String line = "";

            while((line = bufferedReader.readLine()) != null)
            {
                String[] tokens = line.split(DELIMITER);
                if(tokens.length > 0)
                {
                    studenti.add(new Student(tokens[0],tokens[1],tokens[2],tokens[3]));
                }
            }
        }
        catch(IOException ex)
        {
            System.out.println("Chyba pri otevirani csv souboru");
        }

        return studenti;
    }

    public static Student readCsvFile(String fileName, int index)     {
        Student student = new Student();
        int loop_count = 0;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName)))
        {
            bufferedReader.readLine();
            String line = "";

            while((line = bufferedReader.readLine()) != null)
            {
                if(loop_count == index)
                {
                    String[] tokens = line.split(DELIMITER);
                    if(tokens.length > 0)
                    {
                        student = new Student(tokens[0],tokens[1],tokens[2],tokens[3]);
                    }
                    return student;
                }
                loop_count++;
            }

            throw new IndexOutOfBoundsException();
        }
        catch(IOException ex)
        {
            System.out.println("Chyba pri otevirani csv souboru");
        }
        return student;
    }
}
