package oop.Interface.example_001;

@SuppressWarnings("all")
public class Circle extends Point {
    protected float r;

    public Circle() {

    }

    public Circle(float r, float x, float y) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float area() {
        return (float) Math.PI * r * r;
    }

    public String getName() {
        return "Circle";
    }
}
