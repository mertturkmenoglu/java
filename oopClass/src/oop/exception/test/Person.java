package oop.exception.test;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        try {
            setAge(age);
        } catch (InvalidNumberException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidNumberException{
        if(age < 0 || age > 200)
            throw new InvalidNumberException();
        else
            this.age = age;
    }

    @Override
    public String toString() {
        return ("Name: " + name + "\tAge: " + age);
    }
}
