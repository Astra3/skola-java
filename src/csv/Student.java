package csv;

public class Student {

    private String id;
    private String jmeno;
    private String prijmeni;
    private String vek;

    public Student()
    {

    }

    public Student(String id, String jmeno, String prijmeni, String vek)
    {
        setId(id);
        setJmeno(jmeno);
        setPrijmeni(prijmeni);
        setVek(vek);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getVek() {
        return vek;
    }

    public void setVek(String vek) {
        this.vek = vek;
    }
}
