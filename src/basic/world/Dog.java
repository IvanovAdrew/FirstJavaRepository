package basic.world;

public class Dog extends Animal {
    public Dog(int myHumanAge, String name) {
        super(myHumanAge, name);
        whatNumberI += 1;
    }
    @Override
    public String sayingMyPhrase(){

        age=8*myHumanAge;
        return("я знаю что я живу уже "+ age +" собачьих лет и я " +name+ " при этом в этом мире животных уже "+whatNumberI);
    }
    public void ChangeAge(int myHumanAge){
        this.myHumanAge=myHumanAge;
        this.age = myHumanAge*8;

    }
}
