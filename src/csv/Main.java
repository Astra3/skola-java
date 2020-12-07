package csv;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

       Databaze databaze = new Databaze();
/*
       databaze.connect("d:/Java/Databazovy_system/databaze.csv");

       for(Student student : databaze.readAll())
       {
           System.out.print(student.getId() + " ");
           System.out.print(student.getJmeno() + " ");
           System.out.print(student.getPrijmeni() + " ");
           System.out.println(student.getVek());
       }
       */

       StudentIface databaze1 = new Databaze();
       StudentIface databaze2 = new Databaze_SQL();

       databaze1.connect("d:/Java/Databazovy_system/databaze.csv");
       databaze2.connect("d:/Java/Databazovy_system/databazeSQL.csv");

       databaze1.readLine(2);
       databaze2.readLine(10);

       databaze1.disconnect();
       databaze2.disconnect();









    }
}
