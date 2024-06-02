package Interface_Simple;

// A class that implements the Prey interface
public class Rabbit implements Prey{

    @Override
    public void flee(){
        System.out.println("The rabbit is fleeing");
    }
}
