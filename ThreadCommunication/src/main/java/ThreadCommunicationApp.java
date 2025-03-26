public class ThreadCommunicationApp {
    public static void main(String[] args) {
        SharedResources sharedResources = new SharedResources();

        Producer producer = new Producer(sharedResources);
        Consumer consumer = new Consumer(sharedResources);

        Thread prod = new Thread(producer);
        Thread cons = new Thread(consumer);

        prod.start();
        cons.start();
    }
}
