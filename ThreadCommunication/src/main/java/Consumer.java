public class Consumer implements Runnable {
    public SharedResources sharedResources;

    public Consumer(SharedResources sharedResources) {
        this.sharedResources = sharedResources;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
                sharedResources.consume();
        }
    }
}
