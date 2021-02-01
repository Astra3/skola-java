package com.kolekce;

import java.util.*;
// Tahle hodina nedávala smysl, jen testoval rychlosti WTF
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> pole = new ArrayList<Integer>();
        List<Integer> spojovy_seznam = new LinkedList<Integer>();
        Set<Integer> binarni_strom = new TreeSet<Integer>();


        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            pole.add(r.nextInt(10000));
        }
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
    }
}