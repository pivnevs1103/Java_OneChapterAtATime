public class PerfectNumber {
    public static void main(String[] args){

        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number){

        int sumOfNums = 0;

        if(number < 1){
            return false;
        }

        for(int i = 1; i < number; i++){

            if(number % i == 0){
                sumOfNums += i;
            }
        }
        return (sumOfNums == number);
    }
}
