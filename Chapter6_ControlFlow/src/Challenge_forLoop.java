import java.sql.SQLOutput;

/* In this challenge I am practicing a for loop, by going through 100 numbers and
 printing out whether the number is prime or not
 */
public class Challenge_forLoop {
    public static void main(String[] args){

        int counter = 0;

        for(int i = 1; i <= 100; i++){

            // Simple print out statement that uses an if statement to
            // print out whether it is a prime or number
            System.out.println(i + " is " + (isPrimeNumber(i)? "": "Not ") +
                    "a prime number");

            // Counts all the prime numbers and adds its to the variable counter
            if(isPrimeNumber(i)){
                counter++;
                // Once there has been 8 prime number founds this break statement is
                // used to exit the for loop
                if(counter == 8){
                    break;
                }
            }
        }
        System.out.println(counter);

    }
    // Method that returns whether a number is a prime number or not
    // using an if else statement
    public static boolean isPrimeNumber(int num) {

        if (num == 2 || num == 3) {
            return true;
        } else if (num < 2 || num % 2 == 0 || num % 3 == 0) {
            return false;
        } else
            return true;
    }
}
