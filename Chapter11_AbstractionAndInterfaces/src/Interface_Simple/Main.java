package Interface_Simple;

public class Main {
    public static void main(String[] args) {

        /*
            Interface - a template that can be applied to a class.
                        similar to inheritance, but specifies what a class has/must do.
                        classes can apply more than one interface, inheritance is limited to 1 super class
         */

        /*
        `   Regular implementation:
         */

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();


        /*
            Same thing as above except we are not calling these methods using the interfaces reference
         */
        Prey pray1 = new Rabbit();
        pray1.flee();

        Predator hawk2 = new Hawk();
        hawk2.hunt();

        Predator fish2 = new Fish();
        fish.hunt();

        if(fish2 instanceof Prey fish3) {
            fish3.flee();
        }
    }
}
