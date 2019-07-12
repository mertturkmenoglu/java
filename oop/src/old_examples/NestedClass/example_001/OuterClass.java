package old_examples.NestedClass.example_001;

/**
 * Static nested class example
 */
public class OuterClass {
    static int xValue = 1;
    int yValue = 2;

    private static int side = 3;

    static class StaticNestedClass {
        void printData() {
            System.out.println("X Value: " + xValue);
            System.out.println("Side: " + side);

            // Won't compile
            //System.out.println("Y value: " + yValue);
        }
    }
}
