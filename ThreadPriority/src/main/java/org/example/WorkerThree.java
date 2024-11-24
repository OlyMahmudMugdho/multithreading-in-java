package org.example;

public class WorkerThree implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Worker 3 - " + (i+1));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
