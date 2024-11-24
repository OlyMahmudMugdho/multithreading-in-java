package org.example;

public class WorkerTwo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("worker 2 - " + (i + 1));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
