package basic.world;
import java.util.ArrayList;
import java.util.List;

public class Timer {
    String temporaryText;
    final static int CHARACTER_INTERVAL_IN_MILLIS = 200;
    final static int LINES_INTERVAL_IN_MILLIS = 2000;

    public void startingWritingText(List<String> text) {
        if (text == null) {
            return;
        } else { //I can't do the {return;} because java think that all what after "Thread run =" are "incredible station"
            Thread run = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < text.size(); i++) {
                        try {
                            temporaryText = text.get(i); //I'm don't understand how text can get null if I have "if can't give do this"
                            for (int j = 0; j < temporaryText.length(); j++) {
                                char oneChar = temporaryText.charAt(j);
                                System.out.print(oneChar);
                                Thread.sleep(CHARACTER_INTERVAL_IN_MILLIS);
                            }
                            System.out.println();//doing
                            Thread.sleep(LINES_INTERVAL_IN_MILLIS); //1000 - 1 сек
                        } catch (InterruptedException ex) {
                        }
                    }
                }
            });
            run.start();// starting
        }
    }
}
