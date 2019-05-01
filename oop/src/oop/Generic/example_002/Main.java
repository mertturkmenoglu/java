package oop.Generic.example_002;

public class Main {
    public static void main(String[] args) {
        int numberOfElements = 10;
        GenericHolder[] arr = new GenericHolder[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            arr[i] = new GenericHolder<>(i, i * i);
        }

        for (GenericHolder holder : arr) {
            System.out.println(holder.toString());
        }
    }
}
