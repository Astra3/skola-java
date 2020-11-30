package csv;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final String HEADER = "ID, Jméno, Příjmení, Věk";

        Student s1 = new Student("1", "Jan", "Novák", "20");
        Student s2 = new Student("1", "Jan", "Novák", "21");
        Student s3 = new Student("1", "Jan", "Novák", "22");
        Student s4 = new Student("1", "Jan", "Novák", "23");
        ArrayList<Student> studenti = new ArrayList<>();
        studenti.add(s1);
        studenti.add(s2);
        studenti.add(s3);
        CSVFileWriter.writeListCsvFile("soubory/studenti/students.csv", studenti, true);

        for(Student student: CSVFileReader.readCsvFile("soubory/studenti/students.csv")) {
            System.out.print(student.getId() + " ");
            System.out.print(student.getJmeno() + " ");
            System.out.print(student.getPrijmeni() + " ");
            System.out.print(student.getVek() + "\n");
        }
        Student ahoj = CSVFileReader.readCsvFile("soubory/studenti/students.csv", 1);
        System.out.print(ahoj.getId());
        System.out.print(ahoj.getJmeno());
        System.out.print(ahoj.getPrijmeni());
        System.out.print(ahoj.getVek());
    }
}
