package csv;

import java.util.ArrayList;

import com.zacatkyOOP.Adresa;
import com.zacatkyOOP.Student;

public class dynamicke_listy {
    public static void main(String[] args) {
        int []pole1 = new int[10];
        int []pole2 = new int[]{1, 2, 3, 4, 5};

        ArrayList<Student> dynamicke_pole = new ArrayList<Student>();
        for (int i = 0; i < 100; i++) {
            dynamicke_pole.add(new Student("Ondřej", "Kukučka", 2002, new int[]{1, 1, 1, 1, 1}, new Adresa("Šafaříkova", "164", "Valašské Meziříčí", "75701")));
        }
        System.out.println("done");
    }
}
