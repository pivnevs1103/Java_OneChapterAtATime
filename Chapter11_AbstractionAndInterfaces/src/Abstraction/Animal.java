package Abstraction;

public abstract class Animal {

    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    // Abstract methods... no body or curly braces
    public abstract void move(String speed);
    public abstract void makeNoise();

    // Concrete method in an abstract class, however because its final no child class can Override it
    public final String getExplicitType(){
        return getClass().getSimpleName() + " (" + type + ")";
    }
}

//-----------------------------------------------------------------------------------------------

// An abstract class that extends the abstract class Animal
abstract class Mammal extends Animal{

    // Notice how, we were forced to create a constructor but not the method such as: "makeNoise()"
    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    // The method has to be concrete and not abstract because the method was originally declared in Animal class
    @Override
    public void move(String speed){
        System.out.println(getExplicitType() + " ");
        System.out.println(speed.equals("slow") ? "walks" : "runs");
    }

    // Its own unique abstract method
    public abstract void shedhair();

    /*
         An abstract class doesnt have to implement abstract methods
            - An abstract class that extends another abstract class has some flexibility
                    o It can implement all of the parent's abstract methods
                    o It can implement some of them
                    o Or it can implement none of them

         It can also include additional abstract methods, which will force subclasses to implement BOTH Animal's
         abstract methods, as well as Mammal's
     */
}
