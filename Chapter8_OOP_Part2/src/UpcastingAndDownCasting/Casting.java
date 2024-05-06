package UpcastingAndDownCasting;

public class Casting {
    public static void main(String[] args) {

        /* ***************************************************************************************************
        UPCASTING:
        - In this case this means that every dog IS an animal
        - With this myAnimal variable you can do anything you can that part of the Animal class
        - But Since its Animal class variable, you CANT do any of the things that only Apply to Dogs()
        - Example: You cant run myAnimal.growl(); since its only applicable to Dog()
        - Always works and always happens automatically
         *****************************************************************************************************/
        Animal myAnimal = new Dog();

        /* ***************************************************************************************************
          DOWNCASTING:
          -

         *******************************************************************************************************/
    }
}
