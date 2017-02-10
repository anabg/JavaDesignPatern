package observerpattern.pattern1.demo;

/**
 * Created by Anita on 10/02/2017.
 */
public interface ISubject {

    void register( Observer o);
    void unregister( Observer o );
    void notifyObservers( );
}
