package observerpattern.pattern6.demo;

import java.util.Observable;

/**
 * Created by ÊAnita on 12/2/2017.
 */
public class News extends Observable {
    void news() {
        String[] news = {"News 1", "News 2", "News 3"};
        for(String s: news){
            //set change
            setChanged();
            //notify observers for change
            notifyObservers(s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error Occurred.");
            }
        }
    }

}
