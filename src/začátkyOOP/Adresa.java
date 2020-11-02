package začátkyOOP;

public class Adresa {
    private String ulice;
    private String cislo_popisne;
    private String mesto;
    private String psc;

    public Adresa(String ulice, String cislo_popisne, String mesto, String psc) {
        setUlice(ulice);
        setCislo_popisne(cislo_popisne);
        setMesto(mesto);
        setPsc(psc);
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getCislo_popisne() {
        return cislo_popisne;
    }

    public void setCislo_popisne(String cislo_popisne) {
        this.cislo_popisne = cislo_popisne;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {  // nastaví PSČ a kontroluje zda jsou to čísla
        boolean psc_ok = true;
        if (psc.length() != 5) {
            psc_ok = false;
        } else {
            for(int i = 0; i < psc.length(); i++) {
                if(psc.charAt(i) <= '9' && psc.charAt(i) >= '0') {

                } else {
                    psc_ok = false;
                }
            }
        }
        if (psc_ok) {
            this.psc = psc;
        } else {
            this.psc = "00000";
        }
    }
}
