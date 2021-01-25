package com.threads;

public class Main {
    public static volatile int incrementation = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        t1.start();
        t2.start();
//        t1.setDaemon();

        t1.join();
        t2.join();
        System.out.println(incrementation);
    }

}

class MyThread extends Thread {
    public void run() {
        for(int i = 0; i<100000; i++) {
            synchronized (Main.class) {
                Main.incrementation++;
            }
        }
    }
}
