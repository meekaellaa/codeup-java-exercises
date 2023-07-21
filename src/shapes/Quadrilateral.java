package shapes;


public abstract class Quadrilateral extends Shapes implements Measurable{
    protected double width;
    protected double length;

    public Quadrilateral(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public abstract void setLength(double length);
    public abstract void setWidth(double width);

    public abstract double getPerimeter();

    public abstract double getArea();
}