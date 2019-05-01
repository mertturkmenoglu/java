package oop.MultiThreading.example_002;

public class Main {
    public static void main(String[] args) {
        int numberOfThreads = 8;
        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread(new MessageThread());
            thread.start();
        }
    }
}
