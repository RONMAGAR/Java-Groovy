package MultiTreading;

public class MyRunnable implements Runnable {// Interface Runnable for multiThreading
    public void run() {
        for (int i =1;i<11;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
            try {
                Thread.sleep(500);//miliseconds sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
