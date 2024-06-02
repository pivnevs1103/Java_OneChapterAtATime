package Interfaces;

// An interface that extends another interface
interface OrbitEarth extends FlightEnabled{

    void achieveOrbit();

    // public static method(I didnt specify public because it would be redundant)
    static void log(String description){
        // Calls the Date() class directly and gives me, my local date and time which i assigned to a variable
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    // Creating a private static method, same method as above but just private now
    private static void log2(String description){

        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    // Creating a private NON-STATIC method
    private void logStage(FlightStages stage, String description){

        // Here I am just adding the stage to the description that was passed
        description = stage + ": " + description;
        // Now calling the private static method
        log2(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        // First I am assigning what comes back from FlightEnabled's transition method to a local variable named nextStage
        // because I want to print it out
        // I do that on the second line, passing the current stage as the first parameter to the private method, and
        // appending the nextStage to the text in the second argument, and then just return the next stage
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Beginning Transition to " + nextStage);
        return nextStage;
    }
}

interface FlightEnabled{

    // Abstract declaration here is unnecessary and redundant, any method declared without a body,
    // is really implicitly declared both public and abstract
    // EXAMPLE:  public abstract  void takeOff();

    // The variables are Upper case because, any field declared on an interface, are not really instance fields
    // They are implicitly public, static and final (which means they are really constants)
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = .621371;

    /*
    THESE ALL MEAN THE SAME THING ON AN INTERFACE:-----------------
        1. double MILES_TO_KM = 1.60934;
        2. final double MILES_TO_KM = 1.60934;
        3. public final double MILES_TO_KM = 1.60934;
        4. public static double MILES_TO_KM = 1.60934;

        NOTE: anything other then the first statement is redundant
     */

    // This is a PREFERRED declaration, public and abstract are implied
    void takeOff();
    void land();
    void fly();

    // Implementing the default method, Its common practice to write the way it below, or throw an exception, that
    // a default method isnt implemented. This means I really want every class using this interface to override it
    // before actually using it in code(The commented out statements)
    default FlightStages transition(FlightStages stage){
        //System.out.println("transition not implemented on " + getClass().getName());
        //return null;

        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }
}

interface Trackable{

    void track();
}

public abstract class Animal {

    public abstract void move();
}
