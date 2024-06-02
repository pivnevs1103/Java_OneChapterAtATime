package Interface_Simple;

// This class showcases that you can implement more than one interface on a single class
// This class implements both Prey and Predator interface's
public class Fish implements Prey, Predator{


    @Override
    public void hunt() {
        System.out.println("This fish is hunting smaller fish");
    }

    @Override
    public void flee() {
        System.out.println("This fish is fleeing from a larger fish");
    }
}
