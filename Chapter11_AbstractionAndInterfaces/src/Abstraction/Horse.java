package Abstraction;

// This class extends the abstract class Mammal, which extends the abstract class Animal
// Which means it has to implement methods from Both of those abstract classes
public class Horse extends Mammal{

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedhair() {
        System.out.print(getExplicitType() + " sheds in the spring");
    }

    @Override
    public void makeNoise() {

    }

    // Notice how Horse doesnt have the move method in its class directly, buts it is because we implemented it in the
    // Mammal abstract class. If we didnt put it there, then it would have to be included here just like the makeNoise()
 }
