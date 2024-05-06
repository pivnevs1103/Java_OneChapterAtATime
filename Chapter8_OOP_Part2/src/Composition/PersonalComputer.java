package Composition;

public class PersonalComputer extends Product{

    // I am declaring those variables as their class datatype
    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor,
                            MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    // These two methods calling the methods in the other classes and this way hiding the fact that
    // there are other classes and methods
    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "Yellow");
    }

    public void powerUP(){
        computerCase.pressPowerButton();
        drawLogo();
    }
    // this if uncommented would allo us in the main to references the actual classes
    //public ComputerCase getComputerCase() {
    //    return computerCase;
    //}

    //public Monitor getMonitor() {
    //    return monitor;
    //}

    //public MotherBoard getMotherBoard() {
    //    return motherBoard;
    //}
}
