package csv;

public class Databaze_SQL implements StudentIface {

    @Override
    public boolean connect(String cesta) {

        System.out.println("Pripojeni k SQL databazi");

        return false;
    }

    @Override
    public Student readLine(int line) {

        System.out.println("Zaznam z databaze");

        return null;
    }

    @Override
    public void disconnect() {

        System.out.println("Odpojeni od SQL databaze");

    }
}
