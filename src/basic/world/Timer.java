package basic.world;
import java.util.ArrayList;
import java.util.List;

public class Timer {
    String temporaryText;
    int distanceInTimeBetweenTwoChars = 200;
    int distanceInTimeBetweenTwoLines = 2000;

    public void startingWritingText(List<String> text) {
        if (text == null) {
            return;
        } else {
            Thread run = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < text.size(); i++) {
                        try {
                            temporaryText = text.get(i);
                            for (int j = 0; j < temporaryText.length(); j++) {
                                char oneChar = temporaryText.charAt(j);
                                System.out.print(oneChar);
                                Thread.sleep(distanceInTimeBetweenTwoChars);
                            }
                            System.out.println();//doing
                            Thread.sleep(distanceInTimeBetweenTwoLines); //1000 - 1 сек
                        } catch (InterruptedException ex) {
                        }
                    }
                }
            });
            run.start();// starting
        }
    }
}
