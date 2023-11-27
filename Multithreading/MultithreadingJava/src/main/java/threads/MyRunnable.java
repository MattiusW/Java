package threads;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Performed thread " + Thread.currentThread().getName());
    }
}
