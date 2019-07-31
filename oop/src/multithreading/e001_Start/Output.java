package multithreading.e001_Start;

public class Output implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Output thread is running");
        }
    }
}
