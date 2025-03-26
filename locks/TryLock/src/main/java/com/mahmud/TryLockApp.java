package com.mahmud;

public class TryLockApp {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                sharedResource.increment();
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                sharedResource.increment();
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(sharedResource.getData());
    }
}
