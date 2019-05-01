package oop.Interface.example_001;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(4, 5);
        Circle circle = new Circle(2, 2.3f, 4.5f);
        Cylinder cylinder = new Cylinder(4f, 2.5f, 3.5f, 2.2f);
        Shape[] shapes = new Shape[3];

        shapes[0] = p;
        shapes[1] = circle;
        shapes[2] = cylinder;

        for (Shape s : shapes) {
            System.out.println(s.getName() + "\tArea: " + s.area() + "\tVolume: " + s.volume());
        }
    }
}
