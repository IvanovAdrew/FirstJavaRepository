package basic.world.Figures;
public class Triangle extends Shape {
    double firstSide; //double because it not very comfortable for me to use at first int sides and then double perimetr
    double secondSide;
    double thirdSide;
    public Triangle(int firstSide,int secondSide,int thirdSide){
        this.firstSide=firstSide;
        this.secondSide=secondSide;
        this.thirdSide=thirdSide;
    }

    @Override
    public double calculateArea() {
        double halfPerimetr=(thirdSide+firstSide+secondSide)/2;
        super.area=  Math.sqrt(halfPerimetr*(halfPerimetr - firstSide)*(halfPerimetr - secondSide)*(halfPerimetr - thirdSide));
        return super.area;
    }
}
