package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread daemon = new Thread(new DaemonThread());

        daemon.setDaemon(true);

        daemon.start();

        System.out.println("main thread done");
    }
}