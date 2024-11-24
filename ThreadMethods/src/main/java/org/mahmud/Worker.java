package org.mahmud;

public class Worker extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() +  " hello");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
