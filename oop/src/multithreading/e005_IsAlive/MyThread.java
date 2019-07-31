package multithreading.e005_IsAlive;

public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + Thread.currentThread().isAlive());
    }
}
