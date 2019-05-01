package oop.Exception.example_001;

public class Person {

    private String name;
    private int age;

    @SuppressWarnings("WeakerAccess")
    public Person(String name, int age) {
        this.name = name;
        try {
            setAge(age);
        } catch (InvalidNumberException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public String getName() {
        return name;
    }

    @SuppressWarnings("unused")
    public void setName(String name) {
        this.name = name;
    }

    @SuppressWarnings("unused")
    public int getAge() {
        return age;
    }

    @SuppressWarnings("WeakerAccess")
    public void setAge(int age) throws InvalidNumberException {
        if (age < 0 || age > 200)
            throw new InvalidNumberException();
        else
            this.age = age;
    }

    @Override
    public String toString() {
        return ("Name: " + name + "\tAge: " + age);
    }
}
