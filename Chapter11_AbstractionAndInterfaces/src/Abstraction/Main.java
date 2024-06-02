package Abstraction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Even though we created a constructor in the Animal abstract class, you still cant create an instance of it
        // CANT DO THIS -> Animal animal = new Animal("animal", "big", 100);

        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();

        Fish fish = new Fish("GoldFish", "small", 5);
        doAnimalStuff(dog);

        // If we were to create a ArrayList of type Dog or Fish, we would need two different ArrayList
        // but because its of type Animal, we only need one of type 'Animal'
        ArrayList<Animal> animals = new ArrayList<>(List.of(dog, new Dog("German Shappard",
                        "Big", 150), fish, new Fish("Barracuda", "big", 15)));

        animals.add(new Horse("Clydesdale", "large", 1000));
        for (Animal animal : animals){
            doAnimalStuff(animal);
            // We check if our loop variable, currentAnimal, is a mammal, if thats true, we will get a mammal variable
            // named currentMammal, which gets assigned the loop element, only if its really a Mammal subtype.
            if(animal instanceof Mammal currentMammal){
                currentMammal.shedhair();
                if(currentMammal instanceof Horse currentHorse){
                    currentHorse.move("slow");
                }
            }
        }
    }

    // While we cant create an instance of the abstract class. Here however, it doesnt prevent us from using that type
    // in methods, declarations and lists. Regardless what that object is, as long as its an Animal, meaning it has the
    // Animal class in its hierarchy, this code will continue to work
    private static void doAnimalStuff(Animal animal){

        animal.makeNoise();
        animal.move("slow");
    }
}
