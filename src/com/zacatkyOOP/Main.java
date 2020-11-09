package com.zacatkyOOP;

public class Main {
    public static void main(String[] args) {
        // Tohle slouží k testu všeho možného
        Adresa ad1 = new Adresa("Masarykova", "756", "Praha", "7568123");
        int[] znamky = new int[]{1, 2, 4, 3, 5};
        Student s1 = new Student("Karel", "Hnědkovský", 1998, znamky, ad1);
        System.out.println(s1.getAdresa().getUlice());
        System.out.println(s1.getAdresa().getCislo_popisne());
        System.out.println(s1.getAdresa().getMesto());
        System.out.println(s1.getAdresa().getPsc());
        System.out.println(s1.getJmeno());
        System.out.println(s1.getPrijmeni());
        System.out.println(s1.getRok_narozeni());
        System.out.println(s1.getPrumer_znamek());
    }
}
