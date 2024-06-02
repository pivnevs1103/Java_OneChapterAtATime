package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // The normal way of creating a bird object
        Bird bird = new Bird();

        // Assigning Bird object, to different reference types
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();

        // CANT DO THIS RN BECAUSE, the type you use, meaning the variables declared type, determines which methods
        // You can call in your cord
            // flier.move();        (CANT DO)
            // tracked.move();      (CANT DO)

        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();
        /*
                BIRD !!!!!!!!!!!!!
         */
        System.out.println("-".repeat(30));
        inFlight(flier);

        /*
                JET !!!!!!!!!!!!!!!
         */
        System.out.println("-".repeat(30));
        // Passing a new instance of Jet
        inFlight(new Jet());

        /*
                TRUCK !!!!!!!!!!!!!
         */
        System.out.println("-".repeat(30));
        // Creating an instance of truck, to showcase how you can mix and match different interfaces
        Trackable truck = new Truck();
        truck.track();

        // Accessing the variables in the interfaces
        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES; // Remember this is an interface variable
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);


        /*
                Using a List to store certain objects/items/classes that implement the interface 'FlightEnabled'
         */
        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);

        // Here the List is the interface type
        // This is better because it saves time, in case you need to change what kind of a List you are using, all you
        // have to do is just change the last part, the 'new ArrayList();'. You can easily change it to 'new LinkedList();'
        // This makes it easier if you want to go back in the future and change it
        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);

        System.out.println("-".repeat(30));
        // Making a call to the last 3 methods
        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);
    }

    // The argument to the method is something that flies, its a parameter of the FlightEnabled type
    private static void inFlight(FlightEnabled flier){

        // Calling flier interface methods
        flier.takeOff();
        flier.fly();
        // Then after the flier is flying, I want to track it, if its actually trackable
        // To test this, I am using an instranceof operator with pattern matching
        // This is testing an interface type, Trackable and it still works the same, if the object is a class that
        // implements Trackable, then a local variable is set up named track, with the type Trackable, And because of
        // of that, I can call the track method on that variable, tracked
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();

        /*
        Q: WHY NOT JUST USE AN ANIMAL class or the bird object to declare and call these methods?

        A: CHECK the 'Jet" class to see why
         */
    }

    // Note that we are using interface List and not a specific one like LinkedList or ArrayList
    // This is in case in the future if you change what kind of a List you are using, all you have to do is change it
    // in the declaration, rather than in every method that you passed it to.
    private static void triggerFliers(List<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.fly();
        }
    }
    private static void landFliers(List<FlightEnabled> fliers){

        for(var flier : fliers){
            flier.land();
        }
    }
}
