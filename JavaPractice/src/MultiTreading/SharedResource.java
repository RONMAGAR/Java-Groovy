package MultiTreading;

import javax.jws.soap.SOAPBinding;

public class SharedResource {
    private  int number;
    private boolean status = false;

    synchronized public int getNumber() throws InterruptedException {
        if (status == false){
            wait();// puts the thread in waiting condition and releases the lock on shared resource
        }
        System.out.println("Number : " + number);
        status = false;
        notify();// it will notify setter thread to resume and go to ready state
        return number;
    }
    public synchronized void setNumber(int number) throws InterruptedException {
        if (status = true){
            wait();
        }
        this.number = number;
        System.out.println("Set : " + number);
        status = true;
        notify();// It will notify getter thread to resume
    }
}
