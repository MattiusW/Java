package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args){

        System.out.println("Main thread app: " + Thread.currentThread().getName());

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Thread thread = new MyThread("My Thread-1");
        Thread secondThread = new MyThread("My Thread-2");

        //Thread strategy pattern. Don't need make separate class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Performed thread (runnable) " + Thread.currentThread().getName());
            }
        };

        Thread anotherThread = new Thread(runnable, "My-Runnable-1");

        //Thread lambda runnable
        Thread lambdaRunnable = new Thread(() -> System.out.println("Performed lambda Thread: "
        + Thread.currentThread().getName()), "My-LambaRunnable-2");

        Runnable countdown = () -> {
            try {
                System.out.println("Thread sleep" +Thread.currentThread().getName());
                for(int i = 1; i <= 10; i++){
                    System.out.println(i);
                    //Thread.sleep(1000);
                    TimeUnit.SECONDS.sleep(1); //New solution sleep method
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread countdownThread = new Thread(countdown, " countdownThread-sleep");

        Runnable blastOff = () -> {
            System.out.println("Performed Thread: " + Thread.currentThread().getName());
            System.out.println("Blast off!");
        };

        Thread blastOffThread = new Thread(blastOff, "blastOff");

        thread.start();
        secondThread.start();
        anotherThread.start();
        lambdaRunnable.start();
        countdownThread.start();

        try {
            //Wait before to run next Thread
            countdownThread.join(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        blastOffThread.start();

        executor.submit(countdown);
        executor.submit(blastOff);

        //Shutdown if thread is end
        executor.shutdown();

    }

}
