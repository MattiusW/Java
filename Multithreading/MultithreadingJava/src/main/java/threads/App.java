package threads;

public class App {

    public static void main(String[] args){

        System.out.println("Main thread app: " + Thread.currentThread().getName());

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

        Runnable runnableSleep = () -> {
            try {
                System.out.println("Thread sleep" +Thread.currentThread().getName());
                for(int i = 1; i <= 10; i++){
                    System.out.println(i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread runSleep = new Thread(runnableSleep, " Runnable-sleep");

        thread.start();
        secondThread.start();
        anotherThread.start();
        lambdaRunnable.start();
        runSleep.start();

    }

}
