package multithreading.e004_Priority;

public class Main {
    public static void main(String[] args) {
        Thread minPriorityThread = new Thread(new MyThread());
        Thread maxPriorityThread = new Thread(new MyThread());

        minPriorityThread.setName("minPriorityThread");
        maxPriorityThread.setName("maxPriorityThread");

        minPriorityThread.setPriority(Thread.MIN_PRIORITY);
        maxPriorityThread.setPriority(Thread.MAX_PRIORITY);

        minPriorityThread.start();
        maxPriorityThread.start();
    }
}
