public class Challenge_sum3And5 {
    public static void main(String[] args){
        int sum = 0;
        int counter = 0;

        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                sum += i;
                counter++;
                System.out.println("The number that's divisible by 3 and 5 = " + i);
            }
            if(counter == 5){
                break;
            }
        }
        System.out.println("The sum of the 5 numbers is " + sum);

    }
}
