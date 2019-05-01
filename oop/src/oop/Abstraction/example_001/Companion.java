package oop.doctorwho;

@SuppressWarnings({"WeakerAccess", "unused"})
public class Companion extends AbstractHuman {

    private int doctorNumber;

    public Companion(String name, int doctorNumber) {
        this.name = name;
        this.doctorNumber = doctorNumber;
    }

    public int getDoctorNumber() {
        return doctorNumber;
    }

    public void setDoctorNumber(int doctorNumber) {
        this.doctorNumber = doctorNumber;
    }

    @Override
    public void speak() {
        System.out.println("My name is " + name);
    }
}
