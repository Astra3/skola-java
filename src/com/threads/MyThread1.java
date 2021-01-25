package com.threads;

public class MyThread1 extends Thread{
    private String threadName;
    public MyThread1(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        System.out.println("Vlákno " + threadName + " spuštěno");
        for(int i = 0; i < 5; i++) {
            System.out.println("Vlákno 1: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Vlákno " + threadName + " ukončeno");
    }
}
