import java.util.Random;

public class ridici_struktury {
    public static void main(String[] args) {
        /*
        Statementy
        == porovnání
        != nerovná se
        > větší
        < menší
        > větší rovno
        < menší rovno

        Logické operátory
        && AND
        || OR
        ! NOT
        ^ XOR
         */

        int var = 1;
        boolean var2 = false;

        //Částečně větvení
        if(var == 10) {
            System.out.println("Hodnota var je " + var);
        }
        if(var2) {  // Vykřičníkem se dá udělat negace
            System.out.println("Var2 je true.");
        }
        if(var != 2) {
            System.out.println("Var není 2 xd");
        } else {
            System.out.println("Hodnota je jiná než dva OMEGALUL");
        }
        /*Vícenásobné větvení*/
        if(var == 0) {
            System.out.println("Hodnota rovna nule");
        } else if(var == 1) {
            System.out.println("Hodnota rovna jedné");
        } else {
            System.out.println("divný var");
        }

        // Switch loop
        switch (var) {
            case 0:
                System.out.println("Hodnota rovná nule switch");
                break;
            case 1:
                System.out.println("Hodnota rovna jedné switch");
                break;
            default:
                System.out.println("Hodnota je nějaký jiná hmmmm");
        }
        // Enhanced switch
        switch (var) {
            case 0 -> System.out.println("Hodnota rovná nule rOfL");
            case 1 -> System.out.println("Hodnota rovna jedné asdasdaef");
            default -> System.out.println("Hodnota je nějaký jiná hmmmm enhanced :O");
        }

        // Cykly
        int i = 0;
        while(i < 10) {
            if(i == 7) {
                break;
                // continue jen přeskočí danou iteraci a pokračuje dál, bacha na infinite loop
            }
            i++;
            //i++"cislo";
            System.out.print(i + ", "); // vypíše jen na jeden řádek
        }
        do {
            if(i == 7) {
                break;
                // continue jen přeskočí danou iteraci a pokračuje dál, bacha na infinite loop
            }
            i++;
            //i++"cislo";
            System.out.print(i + ", "); // vypíše jen na jeden řádek
        } while (i < 10);

        int [] pole = new int[10]; // bude naplněno 10x 0

        // (definice proměnné ; podmínka pro ukončení ; operaci co provést při každé iteraci)
        for(int j = 0 ; j < 10 ; j++) {  // proměnná vytvořená zde funguje jen v tom cyklu ve kterém byla vytvořená
            pole[j] = j * 10;
        }
        System.out.println();
        for(int j = 0 ; j < pole.length ; j++) {
            System.out.print(j);
        }

        System.out.println();
        for(int iterator : pole) {
            System.out.print(iterator + ", ");
        }
        System.out.println();

        Random random = new Random();
        System.out.println(random.nextInt(100));
    }
}
