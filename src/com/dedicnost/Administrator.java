package com.dedicnost;

public class Administrator extends Zamestnanec {
    private final String username;
    private final String heslo;

    public Administrator(String jmeno, String prijmeni, int vek, String username, String heslo) {
        super(jmeno, prijmeni, vek);
        this.username = username;
        this.heslo = heslo;
    }

    @Override
    public String pracuj() {
        return "Admin říká, že zaměstnanec je SuPeR. Tohle mu na to říká zaměstnanec:\n" +
                super.pracuj();
    }

    public String getHeslo() {
        return heslo;
    }

    public String getUsername() {
        return username;
    }
}
