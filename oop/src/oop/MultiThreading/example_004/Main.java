package oop.MultiThreading.example_004;

import oop.MultiThreading.example_003.Doctor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        pool.execute(new Doctor(9, "Fantastic!"));
        pool.execute(new Doctor(10, "Allons-y!"));
        pool.execute(new Doctor(11, "Geronimo!"));
        pool.execute(new Doctor(12, "Hello Sweetie!"));
        pool.shutdown();
    }
}
