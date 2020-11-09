package com.zacatkyOOP;

import java.util.Calendar;

public class Student {
    private String jmeno;
    private String prijmeni;  //Refactor - encapsulate fields vygeneruje Getter a Setter automaticky
    private int rok_narozeni;
    private int[] znamky;
    private double prumer_znamek;
    private Adresa adresa;

    public Student(String jmeno, String prijmeni, int rok_narozeni, int[] znamky, Adresa adresa) {
        setJmeno(jmeno);
        setPrijmeni(prijmeni);
        setRok_narozeni(rok_narozeni);
        setZnamky(znamky);
        // Zde se vytváří nový objekt adresy, je to kvůli tomu aby nevznikla kolize mezi objekty
        this.adresa = new Adresa(adresa.getUlice(), adresa.getCislo_popisne(), adresa.getMesto(), adresa.getPsc());
    }

    public String getJmeno() {
        return jmeno;
    }
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public int getRok_narozeni() {
        return rok_narozeni;
    }

    public void setRok_narozeni(int rok_narozeni) {
        int rok = Calendar.getInstance().get(Calendar.YEAR);
        if (rok_narozeni > rok) {
            this.rok_narozeni = rok;
        } else {
            this.rok_narozeni = rok_narozeni;
        }
    }

    public int[] getZnamky() {
        return znamky;
    }

    public void setZnamky(int[] znamky) {
        this.znamky = znamky;
        setPrumer_znamek();
    }

    public double getPrumer_znamek() {
        return prumer_znamek;
    }

    private void setPrumer_znamek() {
        double prumer = 0;
        for (int i: znamky) {
            prumer += i;
        }
        this.prumer_znamek = prumer / znamky.length;
    }

    public Adresa getAdresa() {
        return adresa;
    }
}
