package InnerClasses;

public class AnnonymousDemo {
    public static void main(String[] args) {
        Demo obj = new Demo() {
            @Override
            public void display() {
                System.out.println("display() from demo !!!");
            }
        };

        Test test = new Test() {
            @Override
            public void show(String str) {
                System.out.println("show() from Test : ms : "+ str);
            }
        };


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<11;i++){
                    System.out.println(Thread.currentThread().getName() + " : "+i);
                }
            }
        };

        Thread t1 = new Thread(runnable,"MyRunnableThread");
        t1.start();
    }
}
