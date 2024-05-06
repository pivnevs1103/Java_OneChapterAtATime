// This is a small challenge that was assigned to me to just practice using methods.
// This is just 2 methods that assign a place to a player based on the points that he got.


public class Challenge_DisplayingHighScore {
    public static void main(String[] args) {

        //Calling methods which will assign the score first and then will use the first method
        //to print out the results
        int playersPlace = calculateHighScorePosition(1500);
        displayHighScorePosition("Sergey", playersPlace);
        displayHighScorePosition("Michael", calculateHighScorePosition(1000));
        displayHighScorePosition("Gabby", calculateHighScorePosition(500));
        displayHighScorePosition("Nicole", calculateHighScorePosition(100));
        displayHighScorePosition("Victor", calculateHighScorePosition(25));
    }

    // Method used as print out statement with 2 parameters and no return
    public static void displayHighScorePosition(String playersName, int playersPlace) {

        System.out.println(playersName + " managed to get into position " + playersPlace
                + " on the high score list");
    }

    // This method calculates the position that the player received based on the amount of points he got
    public static int calculateHighScorePosition(int playersScore){

        // An IF statement to fit all the possible conditions and returns the position the person got
        if(playersScore >= 1000)
            return 1;
        else if (playersScore >= 500)
            return 2;
        else if(playersScore >= 100)
            return 3;

        return 4;
    }
}
