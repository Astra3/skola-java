package com.zacatky;

public class Main {
    public static void main(String[] args) {
        char znak = 104;
        char znak2 = 97;
        char znak3 = 32;
        char znak4 = 120;
        char znak5 = 100;
        System.out.print(znak);
        System.out.print(znak2);
        System.out.print(znak);
        System.out.print(znak2);
        System.out.print(znak3);
        System.out.print(znak4);
        System.out.println(znak5);

        //desetinné
        float var2 = 10.5f;
        int var1 = (int)var2;
        double var7 = 15.895;
        System.out.println("hodnota nějaké proměnné je xd xd xd " + var7);

        //logický datový typ
        boolean type = true;

        //referenční datový typ
        String retezec = "TOHLE JE STRING ABY JSI VĚDĚL";
        retezec = retezec.replace("VĚDĚL", "NEVĚDĚL OMEGALUL");
        int a = retezec.length();  // spočítá délku

        Integer var_int = 5;

        String cislo1 = "22.5";
        String cislo2 = "56.4";

        double cislo1_d = Double.parseDouble(cislo1);
        double cislo2_d = Double.parseDouble(cislo2);
        cislo1_d += cislo2_d;
        System.out.println(cislo1_d);

        String retezec3 = "abcd";
        try {
            int vysledek2 = Integer.parseInt(retezec3);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("a");


    }
}
