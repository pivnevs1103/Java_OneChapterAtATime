package Interfaces;

public class TestForNewFeautersSinceJDK8 {
    public static void main(String[] args) {

        inFlight(new Jet());

        // calling the public static method on the interface 'OrbitEarth'
        OrbitEarth.log("Testing " + new Satellite());

        // Trying to call the private static method on the interface 'OrbitEarth', but we obvsiously cant
        // OrbitEarth.log2("Testing " + new Satellite());

        orbit(new Satellite());
    }

    private static void inFlight(FlightEnabled flier) {

        // Calling flier interface methods
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.transition(FlightStages.CRUISE);
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void orbit(OrbitEarth flier) {

        System.out.println("GOING TO ORBIT" + "-".repeat(30));
        // Calling flier interface methods
        flier.takeOff();
        flier.fly();
        flier.land();

    }
}
