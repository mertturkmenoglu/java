package oop.Instance.example_001;

// Illustrate instance initialization block
public class Student {

    private String name;
    private String id;

    static {
        System.out.println("Instance created");
    }

    @SuppressWarnings("WeakerAccess")
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        System.out.println("Student object created");
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
    public String getId() {
        return id;
    }

    @SuppressWarnings("unused")
    public void setId(String id) {
        this.id = id;
    }
}
