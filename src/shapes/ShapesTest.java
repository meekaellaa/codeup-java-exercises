package shapes;

public class ShapesTest {


    public static void main(String[] args) {
        Measurable myShape = new Rectangle(4, 5);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        myShape = new Square(5);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

    }
//Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
//    code will not compile, if the rectangle class doesn't have a getPerimeter method.
// What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//because it's a measurable, it doesn't include those methods
}





