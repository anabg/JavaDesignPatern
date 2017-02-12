package observerpattern.pattern5.demo;

import java.util.Observable;

/**
 * Created by ÊAnita on 12/2/2017.
 * A new class of observable objects is created by extending class Observable. Because class Observable already implements all of the methods necessary to provide the observer/observable behavior, the derived class need only provide some mechanism for adjusting and accessing the internal state of the observable object.

 In the class ObservableValue listing below, the internal state of the model is captured by the integer n.
 This value is accessed (and, more importantly, modified) only through public accessors.
 If the value is changed, the observable object invokes its own setChanged() method to indicate that the state of the model has changed.
 It then invokes its own notifyObservers() method in order to update all of the registered observers.
 */
public class ObservableValue extends Observable {

    private int n = 0;
    public ObservableValue(int n)
    {
        this.n = n;
    }
    public void setValue(int n)
    {
        this.n = n;
        setChanged();
        notifyObservers();
    }

    public int getValue()
    {
        return n;
    }

}
