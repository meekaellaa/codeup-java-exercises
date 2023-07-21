package shapes;

public class Square extends Quadrilateral{
    public Square (double side){
        super(side, side);
    }

    @Override
    public void setWidth(double side) {
        this.width = this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = this.length = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

}
