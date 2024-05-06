package PolymorphismChallenge;

public class HybridCar extends NewCar{

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, int batterySize, int cylinders) {
        super(description);
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        info();
    }

    private void info(){
        System.out.println("Since you have a gas car, based on your " + cylinders+ " cylinder,and the " +
                avgKmPerLitre + " average Km per litre, you can drive up to " + cylinders * avgKmPerLitre +
                " miles");
    }
}
