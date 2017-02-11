package observerpattern.pattern3.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anita on 10/02/2017.
 */
public class Subject2 implements ISubject {

    private int myValue;
    List<IObserver> observersList=new ArrayList<IObserver>();



    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;

        //notify observers
        notifyObservers( myValue );
    }

    public List<IObserver> getObserversList() {
        return observersList;
    }

    public void setObserversList(List<IObserver> observersList) {
        this.observersList = observersList;
    }


    @Override
    public void register(IObserver o) {

        observersList.add( o );

    }

    @Override
    public void unregister(IObserver o) {

        observersList.remove( o );

    }

    @Override
    public void notifyObservers(int updateValue) {

        for (IObserver o : observersList){

            o.update( this.getClass().getSimpleName(), updateValue );

        }
    }
}
