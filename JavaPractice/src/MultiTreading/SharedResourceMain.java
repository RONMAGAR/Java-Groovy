package MultiTreading;

public class SharedResourceMain {
    public static void main(String[] args) {
        SharedResource shareresource = new SharedResource();
        SetterThread setter = new SetterThread(shareresource);
        GetterThread getter = new GetterThread(shareresource);

        Thread setterThread = new Thread(setter);
        Thread getterThread = new Thread(getter);

        setterThread.start();
        getterThread.start();

        try {
            setterThread.join();
            getterThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
