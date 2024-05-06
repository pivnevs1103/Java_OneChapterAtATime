

public class numberPalindrome {
    public static void main(String[] args){

        System.out.println("The number is " +
                (isPalindrome(-222)? "": "NOT ") + "a " +
                "Palindrome number");
        System.out.println("The number is " +
                (isPalindrome(12345)? "": "NOT ") + "a " +
                "Palindrome number");
        System.out.println("The number is " +
                (isPalindrome(112211)? "": "NOT ") + "a " +
                "Palindrome number");
        System.out.println("The number is " +
                (isPalindrome(123454321)? "": "NOT ") + "a " +
                "Palindrome number");
        System.out.println("The number is " +
                (isPalindrome(-1000)? "": "NOT ") + "a " +
                "Palindrome number");

    }
    public static boolean isPalindrome(int number){

        int reverse = 0;

        if(number < 0){
            number *= -1;
        }
        int originalValue = number;

        while(number != 0){

            int lastDigit = number % 10;
            reverse += lastDigit;

            number /= 10;
            reverse *= 10;
        }
        reverse /= 10;
        return (reverse == originalValue);
    }
}
