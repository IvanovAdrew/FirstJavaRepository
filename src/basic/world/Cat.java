package basic.world;

public class Cat extends Animal {
        public Cat(int myHumanAge, String name) {
            super(myHumanAge, name);
            whatNumberI += 1;
        }
        @Override
        public String sayingMyPhrase(){
            age = myHumanAge;
            return("я знаю что меня зовут " + name + " а возраст мой "+ age+ " нормальных лет"+" при этом в этом мире животных уже "+whatNumberI);
        }
    public void ChangeAge(int myHumanAge){
        this.myHumanAge=myHumanAge;
        age = myHumanAge;
    }
    }


