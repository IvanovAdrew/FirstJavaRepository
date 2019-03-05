package basic.world.Strings;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public  static void main(String[]args){
        System.out.println(imWritingSomethingThatIsCombineNameAndSurname());
    }
    public static String imWritingSomethingThatIsCombineNameAndSurname  (){
        final Random random = new Random();
        String name = getName();
        String surname = getSurname();

        String aLetter = (String.valueOf(name.charAt(0))); //IDEA think that it is much better)
        String str1=surname.substring(0,5);
        String randomNoun = String.valueOf(random.nextInt(99));

        return aLetter+str1+randomNoun;
    }
    public static String getName(){ //why he want a static method?
        Scanner in = new Scanner(System.in);
        System.out.print("print your name");
        String name = in.nextLine();
        return name;
    }
    public static String getSurname(){ //why he want a static method?
        Scanner in = new Scanner(System.in);
        System.out.print("print your name surname");
        String surname = in.nextLine();
        return surname;
    }
}
