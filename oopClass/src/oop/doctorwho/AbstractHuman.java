package oop.doctorwho;

@SuppressWarnings({"WeakerAccess", "unused"})
public abstract class AbstractHuman implements Human {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
