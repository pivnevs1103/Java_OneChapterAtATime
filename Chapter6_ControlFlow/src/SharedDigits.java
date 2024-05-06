public class SharedDigits {
    public static void main(String[] args){

        System.out.println(hasSharedDigit(21,12));

    }
    public static boolean hasSharedDigit(int num1, int num2){

        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
            return false;
        }

        int currentDigitNum1 = num1 % 10;
        num1 /= 10;
        int currentDigitNum2 = 0;
        int count = 0;

        while(num2 != 0){

            currentDigitNum2 = num2 % 10;
            count++;

            if(currentDigitNum2 == currentDigitNum1 || num1 == currentDigitNum2){
                return true;
            }
            num2 /= 10;
        }
        return false;
    }
}
