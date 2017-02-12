package observerpattern.pattern5.demo;

/**
 * Created by ÊAnita on 12/2/2017.
 * A program notifies an observable object that an observer wishes to be notified about changes in its state by calling the observable object's addObserver() method.
 * The addObserver() method adds the observer to the internal list of observers that should be notified if the state of the observable changes.
 * The example below, showing class Main, demonstrates how to use the addObserver() method to add an instance of the TextObserver class (see the TextObserver listing above)
 * to the observable list maintained by the ObservableValue class (see the ObservableValue listing above).
 */


/**
 * How it all works together
 * The following sequence of events describes how the interaction between an observable and an observer typically occurs within a program.
 * 1 - First the user manipulates a user interface component representing a controller. The controller makes a change to the model via a public accessor method -- which is setValue() in the example above.
 * 2 - The public accessor method modifies the private data, adjusts the internal state of the model,
 * and calls its setChanged() method to indicate that its state has changed. It then calls notifyObservers() to notify the observers that it has changed.
 * The call to notifyObservers() could also be performed elsewhere, such as in an update loop running in another thread.
 * 3 - The update() methods on each of the observers are called, indicating that a change in state has occurred.
 * The observers access the model's data via the model's public accessor methods and update their respective views.
 */
public class ObserverPatternDemo {

    public static void main(String[] args){

        ObservableValue ov = new ObservableValue(0);
        TextObserver to = new TextObserver(ov);
        ov.addObserver(to);

        ov.setValue(2);
    }
}
