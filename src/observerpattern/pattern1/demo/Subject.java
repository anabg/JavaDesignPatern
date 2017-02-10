package observerpattern.pattern1.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anita on 10/02/2017.
 */
public class Subject implements ISubject{

    List< Observer > observerList = new ArrayList< Observer >();
    private int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public void register(Observer o) {
        observerList.add( o );
    }

    @Override
    public void unregister(Observer o) {
        observerList.remove( o );
    }

    @Override
    public void notifyObservers() {

        for (Observer o: observerList ) {

            o.update();
        }
    }
}
