package csv;

public interface StudentIface {

    boolean connect(String cesta);
    Student readLine(int line);
    void disconnect();


}
