package EccapsulationChallenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,  boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100)? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){

        int tonerLevelAdded = tonerLevel + tonerAmount;
        if(tonerLevelAdded > 100 || tonerLevelAdded < 0){
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages){

        System.out.println("You are trying to print out " + pages + " pages");

        int jobPages = (duplex)? (pages / 2) + (pages % 2): pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
