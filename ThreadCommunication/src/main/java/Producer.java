public class Producer implements Runnable{

    public SharedResources sharedResources;

    public Producer(SharedResources sharedResources){
        this.sharedResources = sharedResources;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
                sharedResources.produce(i);
        }
    }
}
