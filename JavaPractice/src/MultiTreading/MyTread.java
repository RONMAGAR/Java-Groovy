package MultiTreading;

public class MyTread extends Thread{// Thread class is not abstract
    private String name;
    MyTread(String name ){
        super(name);// for setting name of threads via invoking parametrized constructor
    }
    MyTread(){
        super();
    }
    public void run(){
        for (int i = 1;i<=10;i++){
            System.out.println(i +" "+ getName());
        }
    }
}
