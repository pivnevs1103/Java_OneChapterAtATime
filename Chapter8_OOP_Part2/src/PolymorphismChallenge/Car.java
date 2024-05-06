package PolymorphismChallenge;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public static void startCar(int carType){


    }

    public void startEngine(){
        System.out.println("Your engine has started");
    }

    public void drive(){
        System.out.println("You put your car in drive, now you are moving");
    }

    private void stayParked(){
        System.out.println("Your car is just parked and running");
    }

    private void runEngine(){
        System.out.println("Your car has started and now your Engine is Running");
    }

    private void turnOffTheCar(){
        System.out.println("Your engine stopped working and your car is now turned off");
    }
}
