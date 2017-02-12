package observerpattern.pattern6.demo;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ÊAnita on 12/2/2017.
 */
public class FirstNewsReader implements Observer {


    public void update(Observable obj, Object arg) {
        System.out.println("FirstNewsReader got The news:"+(String)arg);
    }
}
