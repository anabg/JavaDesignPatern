package observerpattern.pattern6.demo;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ÊAnita on 12/2/2017.
 */
public class SecondNewsReader implements Observer {
    public void update(Observable obj, Object arg) {
        System.out.println("SecondNewsReader got The news:"+(String)arg);
    }
}
