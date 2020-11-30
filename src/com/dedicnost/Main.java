package com.dedicnost;

public class Main {
    public static void main(String[] args) {
        Administrator admin = new Administrator("Jan", "Novák", 60, "novakj", "123456");
        System.out.print(admin.pracuj());
    }
}
