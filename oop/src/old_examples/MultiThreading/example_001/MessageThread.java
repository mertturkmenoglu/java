package old_examples.MultiThreading.example_001;

/**
 * Thread creation example by extending java.lang.Thread class
 */
public class MessageThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Running thread ID: " + Thread.currentThread().getId() + "\tThread name: " + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
