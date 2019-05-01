package oop.exception.example_001;

public class Main {
    public static void main(String[] args) {
        Person p;
        int age = 35;
        String name = "Ahmet";

        p = new Person(name, age);

        System.out.println(p);

        try {
            p.setAge(150);
        } catch (InvalidNumberException e) {
            e.printStackTrace();
        } finally {
            System.out.println(p);
        }

        // This code block raises InvalidNumberException
        // Uncomment this block to try
//        try {
//            p.setAge(250);
//        } catch (InvalidNumberException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println(p);
//        }
    }
}
