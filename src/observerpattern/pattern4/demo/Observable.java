package observerpattern.pattern4.demo;

/**
 * Created by ÊAnita on 11/2/2017.
 */
public interface Observable {


    public void addObserver( Observer o);

    public void removeObserver( Observer o);

    public void notifyObserver();

}
