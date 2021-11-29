package MultiTreading;

public class GetterThread implements Runnable{
    private SharedResource resource;

    public GetterThread(SharedResource resource) {
        this.resource = resource;
    }
    public void run(){
        for (int i =0 ; i<=10;i++){
            try {
                resource.getNumber();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
