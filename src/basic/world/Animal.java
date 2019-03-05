package basic.world;

public abstract class Animal {
    int age;
    int myHumanAge;
    String name;
    static int whatNumberI;
    public Animal(int myHumanAge,String name){
        this.myHumanAge=myHumanAge;
        this.name=name;
        whatNumberI += 1;
    }
    public abstract String sayMyPhrase ();

}
