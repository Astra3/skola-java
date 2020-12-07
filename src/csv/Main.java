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

       String cesta = "/home/roman/IdeaProjects/Škola/soubory/studenti/students.csv";
       databaze1.connect(cesta);

       Student a = databaze1.readLine(2);
       System.out.println(a.getVek());
       databaze1.disconnect();









    }
}
