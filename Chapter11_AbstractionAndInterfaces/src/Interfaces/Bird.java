package Interfaces;

// Using both extends and implements in the same class declaration
public class Bird extends Animal implements FlightEnabled, Trackable{

    /*
    Similar to the way an abstract class forces its subclasses, to implement the abstract method it declares, the
    interface requires any class that implements it, to do the same
     */

    // Abstract class method
    @Override
    public void move() {
        System.out.println("Wings Flap");
    }

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
}
