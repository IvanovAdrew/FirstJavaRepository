package basic.world.Figures;

public class Rectangle extends Shape {
    int firstSide = 5;
    int SecondSide = 7;

    @Override
    public int calculationArea() {
        return firstSide*SecondSide;
    }
}
