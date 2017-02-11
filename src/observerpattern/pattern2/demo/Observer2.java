package observerpattern.pattern2.demo;

/**
 * Created by Anita on 10/02/2017.
 */
public class Observer2 implements IObserver
{

    @Override
    public void update(int i) {

        System.out.println("Observer2: observes ->myValue is changed in Subject to :"+i);

    }

}
