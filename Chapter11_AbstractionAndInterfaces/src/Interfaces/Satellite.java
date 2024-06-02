package Interfaces;

// This class implements the interface 'OrbitEarth', which extends the other interface 'FlightEnabled'
public class Satellite implements OrbitEarth{

    FlightStages stage = FlightStages.GROUNDED;

    // Make sure to declare -> Override and the fact that the method is now public
    @Override
    public void achieveOrbit() {
        transition("Orbit Achieved!");
    }

    /*
        Because the interface 'OrbitEarth" extends the interface 'FlightEnabled', it forces this class to implement
        all the abstract methods from the interface 'FlightEnabled'
     */
    @Override
    public void takeOff() {
        transition("Taking Off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {
        achieveOrbit();
        transition("Data Collection while Orbiting!");
    }

    public void transition(String description) {
        System.out.println(description);
        // I set the stage using the OrbitEarth transition method
        stage = transition(stage);
        stage.track();
    }
}

// To show that record types can implement interfaces(which means it does have to implement the abstract
// methods of that interface)!!!!
// HOWEVER, remember that records can NOT extend classes
record DragonFly(String name, String type) implements FlightEnabled{

    // INTERFACE METHODS
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

// To show that Enum types can implement interfaces(which means it does have to implement the abstract
// methods of that interface)!!!!
// HOWEVER, remember that Enum can NOT extend classes
// This enum describes 4 stages of a satellite launch
enum FlightStages implements Trackable{
    GROUNDED,
    LAUNCH,
    CRUISE,
    DATA_COLLECTION;

    // Interface method
    @Override
    public void track() {
        if(this != GROUNDED){
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage(){

        // First I created a local variable allStages, which gets assigned the array of enum values, then we get back
        // from the values method.
        FlightStages[] allStages = values();
        // The expression below uses the modulus operator, to return ordinal + 1 in every case, except when (ordinal is
        // + 1) is equal to the length of the array, allStages. In that case, it will be 4 over 4.
        return allStages[(ordinal() + 1) % allStages.length];
    }
}