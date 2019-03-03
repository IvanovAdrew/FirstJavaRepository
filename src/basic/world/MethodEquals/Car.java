package basic.world.MethodEquals;

public class Car {
    String unicNumber;
    String colorOfCar;
    public Car (String unicNumber,String colorOfCar){
        this.unicNumber=unicNumber;
        this.colorOfCar=colorOfCar;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        return unicNumber!=null ? unicNumber.equals(car.unicNumber) : car.unicNumber == null;

    }
    public String sayingSomething (){
        return("my color is " + colorOfCar);
    }
}
