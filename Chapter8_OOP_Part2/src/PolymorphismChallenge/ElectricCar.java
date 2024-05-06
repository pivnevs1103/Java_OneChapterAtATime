package PolymorphismChallenge;

public class ElectricCar extends NewCar{

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, int batterySize) {
        super(description);
        this.batterySize = batterySize;
        this.avgKmPerCharge = 10;
    }

    @Override
    public void startEngine() {
        System.out.println("Your car doesnt have an Engine, since its an electric car");
        info();
    }

    private void info(){
        System.out.println("Since you have an electric car with a battery size of " + batterySize);
        System.out.println("Based on the batter size and your cars average Km per charge, your car can go up to "
                + avgKmPerCharge * batterySize + " miles");
    }
}
