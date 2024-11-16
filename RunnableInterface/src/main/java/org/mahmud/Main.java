package org.mahmud;

public class Main {
    public static void main(String[] args) {
        PrinterTask task = new PrinterTask();
        Thread thread = new Thread(task);
        thread.run();
    }
}