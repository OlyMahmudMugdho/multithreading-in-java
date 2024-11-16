package org.mahmud;

public class Worker implements Runnable {
    public int id;

    public Worker(int id){
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Worker-" + id + " working");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
