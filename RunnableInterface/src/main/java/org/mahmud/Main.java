package org.mahmud;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker(1);
        Worker worker2 = new Worker(2);

        Thread thread1 = new Thread(worker1);
        Thread thread2 = new Thread(worker2);

        thread1.start();
        thread2.start();

//        PrinterTask task = new PrinterTask();
//        Thread thread = new Thread(task);
//        thread.run();
    }
}