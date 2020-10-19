package začátkyOOP;

import java.util.Calendar;

public class Student {
    private String jmeno;
    private String prijmeni;  //Refactor - encapsulate fields vygeneruje Getter a Setter automaticky
    private int rok_narozeni;

    public Student(String jmeno, String prijmeni, int rok_narozeni) {
        setJmeno(jmeno);
        setPrijmeni(prijmeni);
        setRok_narozeni(rok_narozeni);
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
}
