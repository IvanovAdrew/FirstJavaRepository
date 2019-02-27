package basic.world;

public abstract class Animal {
    int age;
    int myHumanAge;
    String name;
    static int whatNumberI;
    public Animal(int myHumanAge,String name){
        this.myHumanAge=myHumanAge;
        this.name=name;

    }
    public abstract String sayingMyPhrase ();

}
