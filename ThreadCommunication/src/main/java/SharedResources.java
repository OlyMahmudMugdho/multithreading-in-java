public class SharedResources {
    public int data;
    private boolean hasData;


    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        }
        this.data = value;
        hasData = true;
        System.out.println("Produced : " + value);
        notify();
    }

    public synchronized int consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consumed data : " + data);
        notify();
        return data;
    }
}
