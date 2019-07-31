package multithreading.e003_Multithreading;

public class SpecialThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Name:" + Thread.currentThread().getName());
        System.out.println("ID: " + Thread.currentThread().getId());
        System.out.println("Priority: " + Thread.currentThread().getPriority());
        System.out.println("State: " + Thread.currentThread().getState().name());
        System.out.println("Is Alive: " + Thread.currentThread().isAlive());
    }
}
