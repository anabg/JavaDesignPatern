package observerpattern.pattern3.demo;

/**
 * Created by Anita on 10/02/2017.
 */
public interface ISubject {

    void register(IObserver o);
    void unregister(IObserver o);
    void notifyObservers(int i);
}
