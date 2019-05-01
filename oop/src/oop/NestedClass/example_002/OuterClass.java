package oop.NestedClass.example_002;

public class OuterClass {
    static int xValue = 1;
    int yValue = 2;

    private static int side = 3;

    class InnerClass {
        void printData() {
            System.out.println("X Value: " + xValue);
            System.out.println("Side: " + side);
            // This time it will compile
            System.out.println("Y value: " + yValue);
        }
    }
}
