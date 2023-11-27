package threads;

public class App {

    public static void main(String[] args){

        System.out.println("Main thread app: " + Thread.currentThread().getName());

        Thread thread = new MyThread("My thread-1");

        thread.start();

    }

}
