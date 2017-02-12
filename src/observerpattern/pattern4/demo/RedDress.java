package observerpattern.pattern4.demo;


import java.util.ArrayList;

/**
 * Created by ÊAnita on 11/2/2017.
 */
//1- Implements Observable
public class RedDress implements Observable{


    //List of users registered for notification
    //2- List of all the observers (users who are interested to know when dress is in stock)
    private ArrayList< Observer > users = new ArrayList< Observer >();
    //state of dress
    //Boolean is true if dress is "i stock" False if dress is "out of stock"
    private boolean inStock = true;

    /**
     * getter for inStock
     * @return
     */
    public boolean isInStock() {
        return inStock;
    }

    /**
     * setter for inStock
     * Any change to inStock will happen from this setter
     * @param inStock
     */
    public void setInStock(boolean inStock) {
        this.inStock = inStock;

        //6-Value of inStock variable is changed from here.
        //Whenever it is changed notifyObserver is called to inform all the observers about the change
        notifyObserver();
    }

    @Override
    public void addObserver(Observer o) {

        //3-add users to the list of observers
        users.add( o );
    }

    @Override
    public void removeObserver(Observer o) {
        //4-remove user from the list of observers
        users.remove( o );
    }

    @Override
    public void notifyObserver() {

        //5- Inform all the members of users list about the change
        //Iterate list of all registered users (Observers) and call their update method.
        //notify all the users
        for( Observer user : users){
            user.update();
        }
    }
}
