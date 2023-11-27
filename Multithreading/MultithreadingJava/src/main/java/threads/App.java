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

        thread.start();
        secondThread.start();
        anotherThread.start();

    }

}
