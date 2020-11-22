package com.zamestnanci;

import java.io.*;
import java.util.ArrayList;

public class Zamestnanec {
    private final String jmeno;
    private final String prijmeni;
    private final ArrayList<String> dochazka;
    private final zarazeni zarazeni;
    private final ArrayList<String> den;

    /**
     * Třída pro zaměstnance, vytvoří docházku ze souboru, když nenajde soubor bude docházka prázdná.
     * Potřeba zakončit program metodou .exit()
     * @param jmeno jméno zaměstnance
     * @param prijmeni příjmení zaměstnance
     * @param zarazeni enum zařazení zaměstnance
     */
    public Zamestnanec(String jmeno, String prijmeni, zarazeni zarazeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.zarazeni = zarazeni;
        this.den = new ArrayList<>();
        this.dochazka = new ArrayList<>();
        try {
            BufferedReader file = new BufferedReader(new FileReader("zaměstnanci/" + this.jmeno + " " + this.prijmeni + ".txt"));
            String text = "";
            String line = file.readLine();
            while( (line != null) && (!line.isEmpty()) ) {
                text = text.concat(line + "\n");  // analýza textu ze souboru s \n na konci
                line = file.readLine();
            }
            for (String i: text.split("\n")) {
                this.dochazka.add(i.replace("\n", ""));
            }
            file.close();
        } catch (IOException ignored) {  // v případě že soubor neexistuje se nic neděje
        }
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public Zamestnanec.zarazeni getZarazeni() {
        return zarazeni;
    }

    /**
     * Vezme docházku a přidá k docházce příchod a odchod
     * @return veškerou docházku ve stringu s příchody a odchody
     */
    public String getDochazka() {
        String result = "";
        boolean sudy = true;  // možnost vyřešit i přes modulo, ale to mě přišlo moc složité
        String text;
        for (String i: this.dochazka) {
            if (sudy) {
                text = "Příchod: ";
                sudy = false;
            } else {
                text = "Odchod: ";
                sudy = true;
            }
            result = result.concat("\n" + text + i);
        }
        if (this.den.size() == 1) {
            result = result.concat("\n" +
                    "Příchod: " + den.get(0) + "\n" +
                    "Odchod: nezadáno");
        }
        return result;
    }

    /**
     * Zapíše příchod
     * @return string ve formě výsledku a úspěchu zapsání
     */
    public String prichod() {
        if(den.size() == 0) {
            den.add(java.time.LocalDateTime.now().toString());
            return "Příchod zadán na " + java.time.LocalDateTime.now() + ".";
        } else {
            return "Příchod nelze zadat dvakrát";
        }
    }

    /**
     * Zapíše odchod
     * @return string ve formě výsledku a úspěchu zapsání
     */
    public String odchod() {
        if(den.size() == 1) {
            den.add(java.time.LocalDateTime.now().toString());
            dochazka.addAll(den);
            den.clear();
            return "Odchod zadán na " + java.time.LocalDateTime.now() + ".";
        } else {
            return "Odchod byl zadaný před příchodem.";
        }
    }

    /**
     * Potřeba vykonat vždy při ukončení programu, uloží data do souboru
     */
    public void exit() {
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter("zaměstnanci/" + this.jmeno + " " + this.prijmeni + ".txt"));
            for (String i: this.dochazka) {
                file.write(i + "\n");
            }
            file.close();
        } catch (IOException e) {
            System.err.println("Soubor nešlo uložit.");
        }
    }

    enum zarazeni {
        OPERATOR,
        INZENYR,
        MANAZER
    }
}
