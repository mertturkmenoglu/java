package oop.MultiThreading.example_003;

public class Main {
    public static void main(String[] args) {
        Thread thread;

        thread = new Thread(new Doctor(9, "Fantastic!"));
        thread.start();

        thread = new Thread(new Doctor(10, "Allons-y!"));
        thread.start();

        thread = new Thread(new Doctor(11, "Geronimo!"));
        thread.start();

        thread = new Thread(new Doctor(12, "Hello Sweetie!"));
        thread.start();
    }
}
