package basic.world.Figures;

public class Main {
    public static void main(String[]args){
        Shape triangle = new Triangle(6,7,8);
        int areaOfTriangle = triangle.calculateArea();
        Shape square = new Square(5);
        int areaOfSquare = square.calculateArea();
        Shape rectangle = new Rectangle(5,8);
        int areaOfRectangle = rectangle.calculateArea();
        System.out.println("area of triangle = "+areaOfTriangle);
        System.out.println("area of square = "+areaOfSquare);
        System.out.println("area of rectangle = "+areaOfRectangle);
    }
}
