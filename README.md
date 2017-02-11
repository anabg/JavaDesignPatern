# JavaDesignPatern



Observer Pattern Definition:

Define a one-to-many dependency between objects so that when one object changes state,all its dependents are notified and updated automatically.

Concept
In this pattern, there are many observers (objects) which are observing a particular subject (object).
Observers are basically interested and want to be notified when there is a change made inside that subject.
So, they register themselves to that subject. When they lose interest in the subject they simply unregister
from the subject. Sometimes this model is also referred to as the Publisher-Subscriber model.
Real-Life Example
We can think about a celebrity who has many fans. Each of these fans wants to get�all the latest updates of
his/her favorite celebrity. So, he/she can follow the celebrity as long as his/her interest persists. When he
loses interest, he simply stops following that celebrity. Here we can think of the fan as an observer and the
celebrity as a subject.
Computer World Example
In the world of computer science, consider a simple UI-based example, where this UI is connected with
some database (or business logic). A user can execute some query through that UI and after searching the
database, the result is reflected back in the UI. In most of the cases we segregate the UI with the database. If
a change occurs in the database, the UI should be notified so that it can update its display according to the
change


Advantage of Observer Design Pattern in Java:
Main advantage is loose coupling between objects called observer and observable. The subject only know the list of observers it don�t care about how they have their implementation.All the observers are notified by subject in a single event call as Broadcast communication


Disadvantage of Observer Design Pattern in Java:

�          The disadvantage is that the sometime if any problem comes, debugging becomes very difficult because flow of control is implicitly between observers and observable we can predict that now observer is going to fire and if there is chain between observers then debugging become more complex.
�          Another issue is Memory management because subject will hold all the reference of all the observers if we not unregister the object it can create the memory issue.

That�s all on Observer Pattern in Java. Share your thought how and when you have used Observer Pattern in your Project and any issue you have faced?


Read more: http://javarevisited.blogspot.com/2011/12/observer-design-pattern-java-example.html#ixzz4YPph4X6I


What is Observer design Pattern?

Observer design pattern in Java Code ExampleObserver design pattern in Java is very important pattern and as name suggest it�s used to observe things. Suppose you want to notify for change in a particular object than you observer that object and changes are notified to you. Object which is being observed is refereed as Subject and classes which observe subject are called Observer. This is beautiful pattern and used heavily along with Model View Controller Design pattern where change in model is propagated to view so that it can render it with modified information.


Read more: http://javarevisited.blogspot.com/2011/12/observer-design-pattern-java-example.html#ixzz4YPwEMVT9

Problem which is solved by Observer Pattern:


If we have requirement that if particular object change its state and on depending upon
This changes some or group of objects automatically change their state we need to implement observer pattern it will reduce coupling between objects.
In real world if try to find example see when we subscribe for New Phone connection whenever customer is registered with that company all other departments are notified accordingly and then depending upon the state the do their jobs like do the verification of their address then if customer state is verified then dispatch the welcome kit etc.



How Observer Design Pattern is implemented in Java;


For implementation of this pattern java makes our task very easy, developer need not to do so much for implementing this pattern .In java.util package we can find interfaces ,classes and methods for implementing this pattern.

Public Interface Observer:

Any class who implements this interface must be notified when subject or observable object change its status.

Update (Observable Ob, Object arg): This method is called when subject is changed.


Class Observable:
It�s a subject to whom observer wants to observe.


Some Important Method:
addObserver(Observer o):add Observers in the set of observers for this subject or observalbel object.

deleteObserver(Observer o): delete Observers in the set of observers .

hasChanged():check if object has changed.

clearChanged():this method will indicate that subject has no changes or all the observers has been notified when changes is made.

notifyObservers(): notify all the observers if object has changed .


Read more: http://javarevisited.blogspot.com/2011/12/observer-design-pattern-java-example.html#ixzz4YPwOLvir