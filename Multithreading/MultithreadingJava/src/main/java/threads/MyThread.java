package threads;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        //actual performed thread
        System.out.println("Current thread: " + Thread.currentThread().getName());
    }

}
