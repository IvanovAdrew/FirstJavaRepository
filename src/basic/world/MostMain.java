package basic.world;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MostMain {
    public static void main(String[]args){
        Timer timer = new Timer();

        Scanner in = new Scanner(System.in);
        List<String> story = new ArrayList<String>();

        System.out.print("сегодня я бы хотел расказать историю о 2-х собачек и котейке, или как бы вы назвали котейку? - ");
        String nameKitten = in.nextLine();

        System.out.print("a лет ей сколько было, не подскажете? - ");
        int ageKitten = in.nextInt();

        System.out.print("a ещё хорошо бы было назвать собачёнку, не так ли? - ");
        String namingDog1ThisDeletedBySmth = in.nextLine();
        String namingDog3 = in.nextLine();

        System.out.print("a годиков ей сколько было? - ");
        int ageDog1 = in.nextInt();

        System.out.print("a давайте имя ещё и второй дадим, а? - ");
        String namingDog2ThisDeletedBySmth = in.nextLine();
        String namingDog4 = in.nextLine();

        System.out.print("a жила эта вторая сколько? - ");
        int ageDog2 = in.nextInt();
        in.close();
        Animal d1 = new Dog(ageDog1,namingDog3);
        Animal d2 = new Dog(ageDog1,namingDog4);
        Animal c = new Dog(ageKitten,nameKitten);

        story.add("А вот тепееееерь");
        story.add(c.sayingMyPhrase());
        story.add(d1.sayingMyPhrase());
        story.add(d2.sayingMyPhrase());
        story.add("И начнем мы с того что как-то раз "+ namingDog3+ " и "+ namingDog4 +" игрались во дворе");
        story.add("в один момент они увидели кошака который бежал куда-то ");
        story.add("собсна они конечно-же побежали за ним");
        story.add("ну и они прибежали к дереву как и все нормальные собаки со всеми нормальными котами");
        story.add("ну а потом что-то пошло реально не так и они узнали что кошака зовут " + nameKitten+ " и это вообще-то котейка");
        story.add("потом они узнали её возраст "+ ageKitten+" ну и поняли что собаки по возроасту живут вроде дольше");
        story.add("но жизней же у котов больше, так что фиг его знает кто в выиграше+ я хочу спать + геомку ещё сделать надо +сейчас час ночи(когда доделал то уже 2), крч потом допишу эту сверх скучную или нет историю");

        timer.startingWritingText(story);

    }
}