package observerpattern.pattern4.demo;

/**
 * Created by ÊAnita on 11/2/2017.
 */

// Implements observer
public class User implements Observer {

    private Observable observable = null;

    public User ( Observable observable){

        this.observable = observable;
    }

    @Override
    /**
     * 2- When status of RedDress changes user buyDress
     * 3- After that user is not interested in the status so, it calls unsubscribe.
     */
    public void update() {
        buyDress();
        unsubscribe();

    }

    /**
     * 4-Calls removeObserver() of Observable to stop further notification
     */
    private void unsubscribe() {
        observable.removeObserver(this);
    }

    private void buyDress() {

        System.out.println("Got my new Red Dress");

    }
}
