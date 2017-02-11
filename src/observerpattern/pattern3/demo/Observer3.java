package observerpattern.pattern3.demo;

import observerpattern.pattern2.demo.*;

/**
 * Created by æAnita on 11/2/2017.
 */
public class Observer3 implements IObserver{

    @Override
    public void update(String s, int i) {

        System.out.println("Observer2: observes ->myValue is changed in"+s+" to :"+i);

    }

}
