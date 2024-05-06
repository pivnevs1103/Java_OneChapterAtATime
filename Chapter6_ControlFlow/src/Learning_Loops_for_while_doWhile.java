public class Learning_Loops_for_while_doWhile {
    public static void main(String[] args){

        for(double rate = 2.0; rate <= 5; rate++){
            System.out.println("$10,000 at " + rate + "% interest rate is = " +
                    calculateInterest(10000, rate));
        }
        System.out.println();

        for(double i = 7.5; i <= 10; i += .25){
            System.out.println("$100 at " + i + "% interest rate is = " +
                    calculateInterest(100, i));
        }
        System.out.println();

        for(double i = 10; i <= 30; i+= 3){
            System.out.println("$100 at " + i + "% interest rate is = " +
                    calculateInterest(100, i));
            if(i == 19){
                break;
            }
        }

    }
    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
