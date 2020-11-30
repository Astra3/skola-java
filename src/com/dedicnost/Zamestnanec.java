package com.dedicnost;

public class Zamestnanec {
    private final String jmeno;
    private final String prijmeni;
    int vek;
    public Zamestnanec(String jmeno, String prijmeni, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
    }

    public String pracuj() {
        return "Jmenuji se " + this.getJmeno() + " " + this.getPrijmeni() + ", je mi " + this.vek + " a pracuji.";
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }
}
