package oop.Abstraction.example_001;

@SuppressWarnings({"WeakerAccess", "unused"})
public abstract class AbstractTimeLord implements TimeLord {
    private Tardis tardis;
    private String name;

    public AbstractTimeLord(Tardis tardis, String name) {
        this.tardis = tardis;
        this.name = name;
    }

    public Tardis getTardis() {
        return tardis;
    }

    public void setTardis(Tardis tardis) {
        this.tardis = tardis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
