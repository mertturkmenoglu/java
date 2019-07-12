package old_examples.Abstraction.example_001;

public class Main {
    public static void main(String[] args) {
        Companion rose = new Companion("rose", 9);
        Tardis tardis = new Tardis();
        Doctor doctor = new Doctor(tardis, "The Doctor", 9, "Fantastic!", rose);
        tardis.setTimeLord(doctor);

        rose.speak();
        doctor.sayCatchPhrase();
        doctor.regenerate();
        doctor.setCatchPhrase("Allons-y!");
        rose.speak();
        doctor.sayCatchPhrase();

        Companion donna = new Companion("Donna", 10);
        doctor.setCompanion(donna);
        donna.speak();
        doctor.sayCatchPhrase();

        Companion martha = new Companion("Martha", 10);
        doctor.setCompanion(martha);
        martha.speak();
        doctor.sayCatchPhrase();

        doctor.setCompanion(donna);
        donna.speak();
        doctor.sayCatchPhrase();
        doctor.regenerate();
        doctor.setCatchPhrase("Geronimo!");

        Companion amelia = new Companion("Amelia Pond", doctor.getNumber());
        doctor.setCompanion(amelia);
        amelia.speak();
        doctor.sayCatchPhrase();
    }
}
