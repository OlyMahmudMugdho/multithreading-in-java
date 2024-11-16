package org.mahmud;

public class PrinterTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable Thread : " + " hello world");
    }
}
