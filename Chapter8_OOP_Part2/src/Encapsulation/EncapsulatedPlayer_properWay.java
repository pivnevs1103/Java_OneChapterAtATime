package Encapsulation;

public class EncapsulatedPlayer_properWay {

    private String name;
    private int HealthPercentage;
    private String weapon;

    public EncapsulatedPlayer_properWay(String name) {
        this(name, 100, "sword");

        this.name = name;
    }

    public EncapsulatedPlayer_properWay(String name, int HealthPercentage, String weapon) {

        // In the proper way we can create validation and make sure that the player is only starting with health in the
        // range between 1-100
        this.name = name;
        if(HealthPercentage <= 0){
            this.HealthPercentage = 1;
        }else if (HealthPercentage > 100){
            this.HealthPercentage = 100;
        }else
            this.HealthPercentage = HealthPercentage;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){

        HealthPercentage -= damage;
        if(HealthPercentage <= 0){
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining(){
        return HealthPercentage;
    }

    public void restoreHealth(int extraHealth){
        HealthPercentage += extraHealth;
        if(HealthPercentage > 100){
            System.out.println("Player restored to 100%");
            HealthPercentage = 100;
        }
    }
}
