package multithreading.e003_Multithreading;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new SpecialThread());
        System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //////
        Thread t1 = new Thread(new Print());
        Thread t2 = new Thread(new Print());
        Thread t3 = new Thread(new Print());

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        t3.start();
    }
}
