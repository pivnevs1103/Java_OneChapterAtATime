package Composition;

public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2028", "Dell",
                "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27,"2540 x 1440");
        MotherBoard theMotherboard = new MotherBoard("BJ-200", "Asus",
                4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                theCase, theMonitor, theMotherboard);

        // First we call the object, then the getter method from the first class, which gives us acccess to all the
        // methods in the other classes.
        // thePC.getMonitor().drawPixelAt(10,10,"Red");
        // thePC.getMotherBoard().loadProgram("Windows OS");
        // thePC.getComputerCase().pressPowerButton();

        // does the same thing as above except we made it easier and called the methods within the class it self,
        // hiding away the fact that we may have other classes
        thePC.powerUP();
    }
}
