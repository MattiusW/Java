package threads;

public class MyThread extends Thread{

    @Override
    public void run(){
        //actual performed thread
        System.out.println("Current thread: " + Thread.currentThread().getName());
    }

}
