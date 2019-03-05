package basic.world.Figures;

public class Square extends Shape{
    int firstSide;
    public Square(int firstSide) {
        this.firstSide=firstSide;


    }
    @Override
    public double calculateArea() {

        super.area= firstSide*firstSide;
        return super.area;
    }
}
