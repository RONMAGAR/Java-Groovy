package MultiTreading;

public class Printer {
    /* here also we can synchronized (it will be applicable for whole method )*/public void print(String msg) throws InterruptedException{
        synchronized (this) {
            System.out.print("[ " + msg);
            Thread.sleep(800);
            System.out.println(" ]");
        }

    }
}
