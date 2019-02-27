package basic.world.Figures;

import java.util.Scanner;

public class Square extends Shape{
    @Override
    public int calculationArea() {
        System.out.println("side of square = ");
        Scanner in = new Scanner(System.in);
        int firstSide = in.nextInt();
        super.area= firstSide*firstSide;
        return area;
    }
}
