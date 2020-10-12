import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IO_tridy {
    public static void main(String[] args) {
        /*
        print - tisk do jednoho řádku
        println - přidá k textu na konec \n
         */
        int velikost_pole = 1;
        double [] pole = new double[velikost_pole];
        Scanner scanner = new Scanner(System.in);

        String retezec;
        System.out.print("Načti něco xd: ");
        retezec = scanner.nextLine();
        System.out.println("Načetli jste: " + retezec);


        int i = 0;
        while(i < velikost_pole) {
            try {
                System.out.print("Zadejte " + i + ". číslo: ");
                pole[i] = scanner.nextDouble();
                i++;
            } catch (InputMismatchException ex) {
                System.out.println("Uživateli jsi kokot.");
                scanner.nextLine();
            }
        }
        for(double iterator: pole) {
            System.out.print(iterator + " ");
        }

        char [] text = new char[]{'a', 'b', 'c', 'd'};
        try (FileWriter writer = new FileWriter("soubor.txt")) {
            writer.write(text[1]);
        } catch (IOException ex) {
            System.out.println("Došlo k výjimce " + ex);
        }

        try (FileReader reader = new FileReader("soubor.txt")) {
            System.out.println("V souboru bylo: " + reader.read());
        } catch (IOException ex) {
            System.out.println("Došlo k výjimce při otevírání souboru.");
        }

        String lol;
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Zadejte text pro zapsání do souboru: ");
        lol = scanner2.nextLine();
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt", true))) {
            bw.write(lol + "\n");
        } catch (IOException ex) {
            System.out.println("hhmmmmm");
        }

        try(BufferedReader br = new BufferedReader(new FileReader("soubor.txt"))) {
            System.out.println(br.readLine());
        } catch(IOException ex) {
            System.out.println("Stala se vYjÍmKa");
        }
    }
}
