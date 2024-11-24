package org.example;

public class DaemonThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("DaemonThread: " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
