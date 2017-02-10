package observerpattern.pattern1.demo;

/**
 * Created by Anita on 10/02/2017.
 */
public class ObserverPatternEx {

    public static void main (String[] args){

        System.out.println( " *** Observer Pattern Demo ***\n");
        Observer o1 = new Observer();
        Subject s1 = new Subject();

        s1.register( o1 );
        System.out.println( "Setting Flag = 5" );
        s1.setFlag( 5 );
        System.out.println( "Setting Flag = 25" );
        s1.setFlag( 25 );
        s1.unregister( o1 );
        //No notification this time to o1. Since it is unregistered.
        System.out.println( "Setting Flag = 50 " );
        s1.setFlag( 50 );

    }


}
