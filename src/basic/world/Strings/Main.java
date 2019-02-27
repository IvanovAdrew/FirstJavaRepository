package basic.world.Strings;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public  static void main(String[]args){
        System.out.println(imDoingAllWorkBecouseIMust());
    }
    public static String imDoingAllWorkBecouseIMust  (){
        final Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("print your name");
        String name = in.nextLine();
        System.out.print("print your name surname");
        String surname = in.nextLine();
        String aLetter = Character.toString(name.charAt(0));
        String str1=surname.substring(0,5);
        String randomNoun = String.valueOf(random.nextInt(99));

        return(aLetter+str1+randomNoun);
    }
}
