package multithreading.e002_Start;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Thread is running"));
        thread.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread.start();
        } catch (IllegalThreadStateException e) {
            System.err.println("Could not call the thread for the second time");
            e.printStackTrace();
        }
    }
}
