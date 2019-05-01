package oop.Abstraction.example_001;

@SuppressWarnings({"unused", "WeakerAccess"})
public class Doctor extends AbstractTimeLord {

    private int number;
    private String catchPhrase;
    private Human companion;

    public Doctor(Tardis tardis, String name, int number, String catchPhrase, Human companion) {
        super(tardis, name);
        this.number = number;
        this.catchPhrase = catchPhrase;
        this.companion = companion;
    }

    public void sayCatchPhrase() {
        System.out.println(catchPhrase);
    }

    @Override
    public void regenerate() {
        System.out.println(number + " is gone. Now it is time for number " + ++number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public Human getCompanion() {
        return companion;
    }

    public void setCompanion(Human companion) {
        this.companion = companion;
    }
}
