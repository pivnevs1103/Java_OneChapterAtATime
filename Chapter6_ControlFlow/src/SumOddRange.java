/* This code has two methods, the first method checks if the number is an odd
 number or not, the second method takes in two numbers, the first number is the
 initial number and the second number is the end, then using a for loop starting
 from the first number to the second, we go through all the numbers and by calling
 the first method we find the odd numbers and them to the sum. Then we print out
 the sum
 */

public class SumOddRange {
    public static void main(String[] args){

        // Testing all cases and either getting -1 for incorrect number
        // or the sum of all odd numbers is printed
        System.out.println(sumOdd(10,5));
        System.out.println(sumOdd(1,11));
        System.out.println(sumOdd(-5,-5));
        System.out.println(sumOdd(0,100));
        System.out.println(sumOdd(5, -5));
    }

    // This method uses and if statement to find if a number is odd or not
    public static boolean isOdd(int number){

        if(number <= 0 || number % 2 == 0){
            return false;
        }else return true;
    }

    // Take in two numbers, the first one is the starting number
    // the second number is the ending number and we go through
    // all the numbers using the for loop to find the odd numbers
    public static int sumOdd(int startNum, int endNum){

        int sum = 0;

        // Verifies that no negative numbers can be entered, as
        // well as the starting number cant be bigger than the ending
        if(startNum > endNum || startNum < 0 || endNum < 0) {
            return -1;
        }

        // Doesn't initiate the first value because it doesn't need to
        for(;startNum <= endNum; startNum++){

            // Calls the second method and if the number is odd than
            // it adds it to the sum variable
            if(isOdd(startNum)){
                sum += startNum;
            }
        }
            return sum;
    }
}
