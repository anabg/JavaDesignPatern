package observerpattern.pattern4.demo;

import observerpattern.pattern2.demo.Observer1;
import observerpattern.pattern2.demo.Observer2;
import observerpattern.pattern2.demo.Subject;

/**
 * Created by ÊAnita on 11/2/2017.
 */
public class ObserverPatternDemo {


    public static void main( String[] args ){

        System.out.println("*** Modified Observer Pattern Demo***\n");
        RedDress obs = new RedDress();

        User user = new User(obs);

        obs.addObserver(user);
        obs.setInStock(true);


    }
}
