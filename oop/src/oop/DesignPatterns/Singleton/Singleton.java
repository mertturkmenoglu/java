package oop.singleton;

// Java Design Patterns - Singleton Class
@SuppressWarnings("WeakerAccess")
public class Singleton {
    static Singleton instance = null;
    private int x;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
