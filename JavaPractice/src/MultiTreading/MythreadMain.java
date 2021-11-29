package MultiTreading;

public class MythreadMain {
    public static void main(String[] args) {
        MyTread thread1 = new MyTread();
        thread1.start();
        thread1.setName("Mythread-1");//setting name for thread
        Thread.currentThread().setName("Main-Thread");
        MyTread thread12 = new MyTread();
        thread12.start();
        MyTread thread3 = new MyTread();
        thread3.start();

        MyTread thread4 = new MyTread("Parameterized to set name !!!");
        thread4.start();


        for (int i =1;i<11;i++){
            System.out.println(i +" "+ Thread.currentThread().getName() );//In thread class there is a statc method called currentThread() which will return object of currently running state
        }
        System.out.println("End of Application !!!");
    }
}
