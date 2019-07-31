package multithreading.e005_IsAlive;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.setName("MyThread");

        System.out.println("Before start: " + thread.isAlive());
        thread.start();
        System.out.println("After start: " + thread.isAlive());
    }
}
