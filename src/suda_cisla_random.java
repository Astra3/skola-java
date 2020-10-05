import java.util.Random;

public class suda_cisla_random {
    public static void main(String[] args) {
        Random random = new Random();
        int [] pole = new int[20];
        for(int i = 0; i < pole.length; i++) {
            pole[i] = random.nextInt(100);
            if(pole[i] % 2 == 0) {
                System.out.println(i + ": " + pole[i]);
            }
        }
    }
}
