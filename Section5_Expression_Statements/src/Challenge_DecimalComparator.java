// Challange: Write a method areEqualByThreeDecimalPlaces with
// two parameters of type double.The method should return boolean
// and it needs to return true if two double numbers are the same
// up to three decimal places. Otherwise, return false.

public class Challenge_DecimalComparator {
    public static void main(String[] args){

        //Calling the methods to test all kind of scenarios
        System.out.println(areEqualByThreeDecimalPlaces(1.112, 1.123));
        System.out.println(areEqualByThreeDecimalPlaces(0, 0));
        System.out.println(areEqualByThreeDecimalPlaces(1.523, 1.153));
        System.out.println(areEqualByThreeDecimalPlaces(10.5, 10.2));
        System.out.println(areEqualByThreeDecimalPlaces(-1.123, -1.123));
        System.out.println(areEqualByThreeDecimalPlaces(5.234, 5.234));
        System.out.println(areEqualByThreeDecimalPlaces(999, 999));

    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        // These if statement make sure that every number is at least turns out to
        // be 3 digits, so that in the while loop I am able to isolate each number
        // and then test them if they are equal or not and return the answer
        if(num1 < 100 && num1 > 9){
            num1 *= 10;
            num2 *= 10;
        }
        else if(num1 < 10) {
            num1 *= 100;
            num2 *= 100;
        }
        int newNum1 = 0;
        int newNum2 = 0;
        while(newNum2 == newNum1 && !(num1 == 0)){

            newNum1 = (int)num1  % 10;
            num1 = (int)num1 / 10;

            newNum2 = (int)num2 % 10;
            num2 = (int)num2 / 10;
        }
        return newNum1 == newNum2;
    }
}
