package csv;

public class Bezny_uzivatel extends Uzivatel {
    @Override
    public void Connect(Databaze databaze, String cesta) {
        databaze.connect(cesta);
    }

    @Override
    public void Disconnect(Databaze databaze) {
        databaze.disconnect();
    }

    @Override
    public void Read() {

    }
}
