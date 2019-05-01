package oop.MultiThreading.example_003;

import java.util.Random;

/**
 * A multithreading example similar to our example course code
 */
@SuppressWarnings("WeakerAccess")
public class Doctor implements Runnable {
    private final static int NUMBER = 10;
    private final static int DELAY = 1000;
    private int doctor;
    private String phrase;

    public Doctor(int doctor, String phrase) {
        this.doctor = doctor;
        this.phrase = phrase;
    }

    @Override
    public void run() {
        Random generator = new Random();
        try {
            for (int i = 0; i < NUMBER; i++) {
                System.out.println(doctor + "-th Doctor: " + phrase);
                Thread.sleep(generator.nextInt(DELAY));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}