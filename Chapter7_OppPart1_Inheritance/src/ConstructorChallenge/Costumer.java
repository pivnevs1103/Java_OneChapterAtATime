package ConstructorChallenge;

public class Costumer {

    private String name;
    private int creditLimit;
    private String emailAddy;

    public Costumer(String name, int creditLimit, String emailAddy){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddy = emailAddy;
        System.out.println("Third Constructor");
    }

    public Costumer(){
        this("Connor Bedard", "connorBedard@gmail.com");
        System.out.println("First Constructor");
    }
    public Costumer(String name, String emailAddy){
        this(name, 10000, emailAddy);
        System.out.println("Second Constructor");
    }
    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddy() {
        return emailAddy;
    }
}
