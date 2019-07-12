package old_examples.NestedClass.example_002;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClassObject = new OuterClass();
        OuterClass.InnerClass innerClassObject = outerClassObject.new InnerClass();
        innerClassObject.printData();
    }
}
