package old_examples.Generic.example_001;

public class Main {
    public static void main(String[] args) {
        Integer integer = 5;
        TestGeneric<Integer> testGeneric = new TestGeneric<>(integer);
        System.out.println(testGeneric.getObj());
    }
}
