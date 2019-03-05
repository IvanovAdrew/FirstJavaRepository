package basic.world.MethodEquals;

public class Main {
    public static void main (String args[]){
        Car firstCar = new Car("UA7896KA","green");
        Car secondCar = new Car("UA7896KA","blue");
        Car thirdCar = new Car("UA7896KA","black");
        System.out.println("firstCar equals with secondCar " + firstCar.equals(firstCar)); //reflexive
        System.out.println();

        System.out.println("firstCar equals with secondCar " + firstCar.equals(secondCar));
        System.out.println("secondCar equals with firstCar " + firstCar.equals(secondCar));//symmetric
        System.out.println();

        System.out.println("firstCar equals with secondCar " + firstCar.equals(secondCar)); //transitive
        System.out.println("secondCar equals with thirdCar " + secondCar.equals(thirdCar));
        System.out.println("firstCar equals with thirdCar " + firstCar.equals(thirdCar));
        System.out.println();

        System.out.println("firstCar equals with secondCar for many time... " + firstCar.equals(secondCar)); //consistent
        System.out.println("firstCar equals with secondCar " + firstCar.equals(secondCar));
        System.out.println("firstCar equals with secondCar " + firstCar.equals(secondCar));
        System.out.println("firstCar equals with secondCar " + firstCar.equals(secondCar));
        System.out.println("firstCar equals with secondCar " + firstCar.equals(secondCar));
        System.out.println();

        System.out.println("firstCar is not null "+firstCar.equals(null)); //not null



    }
}
