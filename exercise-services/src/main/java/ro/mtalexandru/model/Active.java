package ro.mtalexandru.model;

/**
 * Created by malexandru on 8/5/2016.
 */
import java.awt.*;
import java.util.*;
public class Active{

    public static void main(String[] args) throws Exception{
        Robot activityCreator = new Robot();
        Random random = new Random();
        while(true){
            activityCreator.delay(1000 * 60);
            int x = random.nextInt() % 640;
            int y = random.nextInt() % 480;
            activityCreator.mouseMove(x, y);
        }
    }
}
