package AbstractChallengeMySolution;

public class Sticks extends ProductsForSale{

    public Sticks(String type, double price, boolean description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(" ".repeat(20) + "!!!DETAILS!!!\nSTICK DETAILS -> " + type + "\nPRICE: $" +
                price + " per stick");
        if(description) {
            System.out.print("""
                    \nExperience unmatched performance and precision on the ice with our latest hockey stick,
                    designed using cutting-edge materials to enhance your game. Try it risk-free with our 30-day 
                    warranty, ensuring you have the confidence to elevate your skills to the next level.\n""");
        }    }
}
