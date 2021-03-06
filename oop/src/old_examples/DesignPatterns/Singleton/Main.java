package old_examples.DesignPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton firstSingleton = Singleton.getInstance();
        Singleton secondSingleton = Singleton.getInstance();
        firstSingleton.setX(10);
        System.out.println("firstSingleton.getX(): " + firstSingleton.getX());
        System.out.println("secondSingleton.getX(): " + secondSingleton.getX());
    }
}
