package oop.NestedClass.example_003;

public class Main {
    public static void main(String[] args) {
         Name name = new Name() {
             @Override
             public void printName() {
                 System.out.println("Name is: " + name);
             }
         };
         name.printName();
    }
}
