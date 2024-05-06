package UpcastingAndDownCasting;

public class Cat extends Animal{

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    public void playing(){
        System.out.println("The cat is playing ");
    }
}
