package org.mahmud;

public class PrinterTask extends Thread {
    @Override
    public void run() {
        System.out.println("Printer thread : " + "hello world" );
    }
}
