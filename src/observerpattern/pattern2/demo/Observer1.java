package observerpattern.pattern2.demo;

/**
 * Created by Anita on 10/02/2017.
 */
public class Observer1 implements IObserver
{

    @Override
    public void update(int i) {

        System.out.println("Observer1: myValue in Subject is now: "+i);

    }

}
