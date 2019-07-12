package old_examples.Interface.example_001;

public class Cylinder extends Circle {
    private float h;

    public Cylinder(float h, float r, float x, float y) {
        this.h = h;
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    @Override
    public float area() {
        return 2 * super.area() + 2 * (float) Math.PI * r * h;
    }

    @Override
    public float volume() {
        return super.area() * h;
    }

    @Override
    public String getName() {
        return "Cylinder";
    }
}
