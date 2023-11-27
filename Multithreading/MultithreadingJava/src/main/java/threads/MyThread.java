package threads;

import java.util.stream.IntStream;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        //actual performed thread
        System.out.println("Current thread: " + Thread.currentThread().getName());

        IntStream.rangeClosed(1,20).forEach(i ->
            System.out.println(i + " | Performed Thread " + Thread.currentThread().getName()));
    }

}
