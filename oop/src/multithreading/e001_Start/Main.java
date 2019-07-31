package multithreading.e001_Start;

public class Main {
    public static void main(String[] args) {
        Printer thread1 = new Printer();
        Thread thread2 = new Thread(new Output());

        thread1.start();
        thread2.start();
    }
}
