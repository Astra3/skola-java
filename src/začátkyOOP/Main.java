package začátkyOOP;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Karel", "Hnědkovský", 1998);
        s1.setJmeno("Karel");
        s1.setRok_narozeni(1990);
        System.out.println(s1.getRok_narozeni());

        Student s2 = new Student("Jan", "Novák", 2010);
        s2.setRok_narozeni(2030);
        System.out.println(s2.getRok_narozeni());
    }
}
