package org.mahmud;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.setName("Worker Thread");
        worker.start();
        worker.join(); // wait for the 'worker' thread from main thread
        System.out.println("main thread : main thread execution finished");
    }
}