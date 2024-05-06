package Encapsulation;

public class Main {
    public static void main(String[] args) {

        /*
                        IMPROPER WAY OF ENCAPSULATION
         */
        NonEncapsulatedClass_Player player = new NonEncapsulatedClass_Player();
        // I can set these field like this because I made them public in the class
        player.name = "tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());

        // This is where the danger can begin because now since our player above died, I can just additionally add
        // more health. The other danger is that in the other class we set up a method to regen health and made it
        // so that the max health there can be is 100 but because its a public variable, i am able to add any amount
        // of health i want
        player.health = 500;


        /*
                                    THE PROPER WAY TO ENCAPSULATE!!!! CORRECT WAY!!!
         */

        // This way we have more control and no one cant just edit any info they would like
        EncapsulatedPlayer_properWay sergey = new EncapsulatedPlayer_properWay("Sergey");
        System.out.println("Initial health is " + sergey.healthRemaining());

    }
}
