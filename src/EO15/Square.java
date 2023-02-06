package EO15;

import java.util.ArrayList;
import java.util.Collections;

public class Square implements Shape {
    private double width;

    public Square(double width){
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        Square square = new Square(10);
        Square square2 = new Square(25);
        Square square3 = new Square(32);
        Square square4 = new Square(18);
        Circle circle = new Circle(12.2);
        Circle circle2 = new Circle(18);
        Circle circle3 = new Circle(10);
        Circle circle4 = new Circle(32);

        Collections.addAll(shapes,square,square2,square3,square4,circle2,circle,circle3,circle4);

        for (Shape shape : shapes){
            System.out.println("Areal: " + shape.getArea());
        }
    }
}
