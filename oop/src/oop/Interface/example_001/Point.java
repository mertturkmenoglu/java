package oop.Interface.example_001;

@SuppressWarnings("all")
public class Point implements Shape {
    protected float x;
    protected float y;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public float area() {
        return 0f;
    }

    @Override
    public float volume() {
        return 0f;
    }

    @Override
    public String getName() {
        return "Point";
    }
}