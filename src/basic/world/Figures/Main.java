package basic.world.Figures;

public class Main {
    public static void main(String[]args){
        Shape triangle = new Triangle(6,7,8);
        int areaOfTriangle = triangle.calculationArea();
        Shape square = new Square();
        int areaOfSquare = square.calculationArea();
        Shape rectangle = new Rectangle();
        int areaOfRectangle = rectangle.calculationArea();
        System.out.println("area of triangle = "+areaOfTriangle);
        System.out.println("area of square = "+areaOfSquare);
        System.out.println("area of rectangle = "+areaOfRectangle);
    }
}
