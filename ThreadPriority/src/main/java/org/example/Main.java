package org.example;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new WorkerOne());
        Thread t2 = new Thread(new WorkerTwo());
        Thread t3 = new Thread(new WorkerThree());

        t3.setPriority(Thread.MAX_PRIORITY); // priority 10
        t1.setPriority(Thread.MIN_PRIORITY); // priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // priority 5
        t1.start();
        t2.start();
        t3.start();
    }
}