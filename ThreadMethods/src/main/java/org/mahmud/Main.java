package org.mahmud;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.start();
        worker.join();
        System.out.println("main thread : main thread execution finished");
    }
}