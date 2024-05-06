package PolymorphismChallenge;

public class GasPoweredCar extends NewCar{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, int cylinders) {
        super(description);
        this.cylinders = cylinders;
        this.avgKmPerLitre = 5;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        info();
    }

    private void info(){
        System.out.println("Since you have a gas car, based on your " + cylinders+ " cylinder and the " +
                    avgKmPerLitre + " average Km per litre, you can drive up to " + cylinders * avgKmPerLitre +
                    " miles");
    }
}
