package com.zamestnanci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zamestnanec z1 = new Zamestnanec("Jan", "Novák", Zamestnanec.zarazeni.INZENYR);
        System.out.println("****\n" +
                "Zadejte žádost pro uživatele " + z1.getJmeno() + " " + z1.getPrijmeni() + ", zařazení: " + z1.getZarazeni() + "\n" +
                "1 - zapíše příchod\n" +
                "2 - zapíše odchod\n" +
                "3 - vypíše docházku\n" +
                "0 - uloží do souboru a ukončí program");
        boolean loop = true;
        while (loop) {
            Scanner s1 = new Scanner(System.in);
            String query = s1.nextLine();
            switch (query) {
                case "1" -> System.out.println(z1.prichod());
                case "2" -> System.out.println(z1.odchod());
                case "3" -> System.out.println(z1.getDochazka());
                case "0" -> loop = false;
                default -> System.out.println("Zadaná neplatná hodnota.");
            }
        }
        z1.exit();
    }
}
