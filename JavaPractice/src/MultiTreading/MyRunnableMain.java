package MultiTreading;

public class MyRunnableMain {
    public static void main(String[] args) throws InterruptedException{
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);// here as start() method is present in Thread() class we need to create object of thread class by passing the runnable object to it
        thread1.start();

        Thread thread2 = new Thread(runnable);
        thread2.setName("Thread-2:");
        thread2.start();

        for (int i=1;i<11;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
            Thread.sleep(800); // here we don't get error for exception throw handling as it is not overridden

        }
        try {
            thread1.join();// thread1 joins the parent thread ,it becomes responsibility of main thread to not go ahead
            //untill the child thread finishes its execution
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end of application!!!");
    }

}
