package old_examples.Interface.example_002;

public class Triangle implements Shape.Info {

    @Override
    public void printShapeName() {
        System.out.println("Triangle");
    }

    @Override
    public void printSideCount() {
        System.out.println(3);
    }
}
