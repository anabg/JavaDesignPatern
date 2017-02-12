package observerpattern.pattern5.demo;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ÊAnita on 12/2/2017.
 *
 * A new class of objects that observe the changes in state of another object is created by implementing the Observer interface.
 * The Observer interface requires that an update() method be provided in the new class.
 * The update() method is called whenever the observable changes state and announces this fact by calling its notifyObservers() method.
 * The observer should then interrogate the observable object to determine its new state, and, in the case of the Model/View/Controller architecture, adjust its view appropriately.
 * In the following class TextObserver listing, the notify() method first checks to ensure that the observable that has announced an update is the observable that this observer is observing.
 * If it is, it then reads the observable's state, and prints the new value.

 */
public class TextObserver implements Observer {

    private ObservableValue ov = null;

    public TextObserver(ObservableValue ov)
    {
        this.ov = ov;
    }

    @Override
    public void update(Observable obs, Object obj)
    {
        if (obs == ov)
        {
            System.out.println(ov.getValue());
        }
    }
}
