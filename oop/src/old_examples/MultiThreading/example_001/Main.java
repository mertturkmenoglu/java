package old_examples.MultiThreading.example_001;

/**
 * Driver code for first multi-threading example
 */
public class Main {
    public static void main(String[] args) {
        int numberOfThreads = 10;
        for (int i = 0; i < numberOfThreads; i++) {
            MessageThread thread = new MessageThread();
            thread.start();
        }
    }
}
