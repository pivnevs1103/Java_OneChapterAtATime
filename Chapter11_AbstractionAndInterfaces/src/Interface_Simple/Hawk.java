package Interface_Simple;

// A class that implements Predator interface
public class Hawk implements Predator{

    @Override
    public void hunt() {
        System.out.println("The hawk is hunting");
    }
}
