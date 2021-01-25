package com.threads;

public class MyThread2 extends Thread{
    private String threadName;
    public MyThread2(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        System.out.println("Vlákno " + threadName + " spuštěno");
        for(int i = 0; i < 50; i = i+10) {
            System.out.println("Vlákno 2: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Vlákno " + threadName + " ukončeno");
    }
}
