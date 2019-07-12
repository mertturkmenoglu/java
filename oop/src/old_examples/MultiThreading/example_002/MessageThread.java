package old_examples.MultiThreading.example_002;

/**
 * Thread creation example by implementing java.lang.Runnable interface
 */
public class MessageThread implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread ID: " + Thread.currentThread().getId() + "\tThread Name: " + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
