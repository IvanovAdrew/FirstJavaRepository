package basic.world.Figures;
public class Triangle extends Shape {
    double firstSide;
    double secondSide;
    double thirdSide;
    public Triangle(int firstSide,int secondSide,int thirdSide){
        this.firstSide=firstSide;
        this.secondSide=secondSide;
        this.thirdSide=thirdSide;
    }

    @Override
    public int calculationArea() {
        double halfPerimetr=(thirdSide+firstSide+secondSide)/2;
        super.area= (int) Math.sqrt(halfPerimetr*(halfPerimetr - firstSide)*(halfPerimetr - secondSide)*(halfPerimetr - thirdSide));
        return (super.area);
    }
}
