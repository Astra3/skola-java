package csv;

public abstract class Uzivatel {
    private String jmeno;
    private String prijmeni;
    private String username;
    private String password;

    public abstract void Connect(Databaze databaze, String cesta);
    public abstract void Disconnect(Databaze databaze);
    public abstract void Read();

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
