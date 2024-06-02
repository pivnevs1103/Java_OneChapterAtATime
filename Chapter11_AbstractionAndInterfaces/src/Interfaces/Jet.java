package Interfaces;

/*  - Creating a new class to showcase how interfaces are used, the bird and jet have very little in common besides
    flying and maybe have wings.
    - This is the beauty of interface, I can treat a bird and jet similarly, from the clients code perspective,
    - What they actually do, is dependent on how they implement the FlightEnabled methods, but the client can treat
    them as if they were the same
*/
public class Jet implements FlightEnabled, Trackable{


    // Interface method
    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    // Interface method
    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    // Interface method
    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    // Interface method
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }

    @Override
    public FlightStages transition(FlightStages stage) {
        System.out.println(getClass().getSimpleName() + " transitioning");
        // Whenever you call a default method from an overridden method, you need to qualify super with the interface
        // type
        return FlightEnabled.super.transition(stage);
    }
}
