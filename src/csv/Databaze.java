package csv;

import java.io.File;
import java.util.ArrayList;

public class Databaze implements StudentIface {

    private File databaze;
    private boolean connected;

    public Databaze()
    {
        databaze = null;
        connected = false;

    }

    @Override
    public boolean connect(String cesta)
    {
        databaze = new File(cesta);
        if(databaze != null)
        {
            connected = true;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean write(Student student)
    {
        try {
            databaze.getAbsolutePath();
        }
        catch(NullPointerException ex)
        {
            System.out.println("Pripojeni k databazi neni k dispozici");
        }
        finally {
            if(connected)
            {
                CSVFileWriter.writeCsvFile(databaze.getAbsolutePath(), student, true);
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public boolean write(ArrayList<Student> seznam_studentu)
    {
        try {
            databaze.getAbsolutePath();
        }
        catch(NullPointerException ex)
        {
            System.out.println("Pripojeni k databazi neni k dispozici");
        }
        finally {
            if(connected)
            {
                CSVFileWriter.writeListCsvFile(databaze.getAbsolutePath(), seznam_studentu, true);
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public ArrayList<Student> readAll()
    {

        try {
            databaze.getAbsolutePath();
        }
        catch(NullPointerException ex)
        {
            System.out.println("Pripojeni k databazi neni k dispozici");
        }
        finally {
            if(connected)
            {
                return CSVFileReader.readCsvFile(databaze.getAbsolutePath());
            }
            else
            {
                return new ArrayList<Student>();
            }
        }
    }



    @Override
    public Student readLine(int line)
    {
        try {
            databaze.getAbsolutePath();
        }
        catch(NullPointerException ex)
        {
            System.out.println("Pripojeni k databazi neni k dispozici");
        }
        finally {
            if(connected)
            {
                return CSVFileReader.readCsvFile(databaze.getAbsolutePath(), line);
            }
            else
            {
                return new Student();
            }
        }
    }

    @Override
    public void disconnect()
    {
        databaze = null;
        connected = false;
    }







}
