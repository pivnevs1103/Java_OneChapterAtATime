package Abstraction;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {

        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.println(getExplicitType() + " lazily swimming!");
        }else{
            System.out.println(getExplicitType() + " darting frantically");
        }
    }

    @Override
    public void makeNoise() {

        // here we can directly access 'type', a field on the abstract class, because we made that field protected
        if(type.equals("GoldFish")){
            System.out.print("swish! ");
        }else {
            System.out.print("Splash! ");
        }
    }
}
