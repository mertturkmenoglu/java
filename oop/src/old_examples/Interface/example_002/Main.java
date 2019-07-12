package old_examples.Interface.example_002;

/**
 * Nested interface example
 */
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printShapeName();
        triangle.printSideCount();

        Shape.Info object;
        object = triangle;
        object.printShapeName();
        object.printSideCount();
    }
}
