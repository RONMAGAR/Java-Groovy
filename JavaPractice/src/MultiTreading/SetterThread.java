package MultiTreading;

public class SetterThread implements Runnable {
    private SharedResource resource;

    public SetterThread(SharedResource resource){
        this.resource = resource;
    }

    public void run(){
        for (int i = 0;i<=10;i++){
            try {
                resource.setNumber(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
