package basic.world.Figures;

public class Rectangle extends Shape {
    int firstSide = 5;
    int secondSide = 7;
    public Rectangle(int firstSide,int SecondSide) {
        this.firstSide= firstSide;
        this.secondSide = secondSide;
    }
    @Override
    public double calculateArea() {
        super.area=firstSide*secondSide;
        return super.area;
    }
}
