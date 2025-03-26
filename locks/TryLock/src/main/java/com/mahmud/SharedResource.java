package com.mahmud;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    private Integer data = 0;

    Lock lock = new ReentrantLock();

    public void increment() {
        try {
            try {
                if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    data++;
                } else {
                    System.out.println("Failed to acquire lock...");
                }
            }
            catch (Exception exception) {
                Thread.currentThread().interrupt();
            }
            finally {
                lock.unlock();
            }

        } catch (Exception exception) {
            Thread.currentThread().interrupt();
        }
    }

    public Integer getData() {
        return this.data;
    }
}
