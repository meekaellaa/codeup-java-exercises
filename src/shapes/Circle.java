package shapes;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

    public static void main(String[] args) {
        Circle mycircle = new Circle(5);
        System.out.println("mycircle.getArea() = " + mycircle.getArea());
        System.out.println("mycircle.getCircumference() = " + mycircle.getCircumference());
    }



}
