public class CalculatingFactorialInAIterativeFashion {

            public static void main(String[] args){

                System.out.println(recursiveFactorial(3));
                System.out.println(iterativeFactorial(3));

            }

            // 1! = 0! * 2 = 1
            // 2! = 2 * 1 = 2 * 1!
            // 3! = 3 * 2 * 1 = 3 * 2!
            // 4! = 4 * 3 * 2 * 4 * 3!


            // n! = n * (n - 1)!
            // More elegant and easier to understand
            public static int recursiveFactorial(int num){

                // Break condition, without you get a stack overflow
                if(num == 0){
                    return 1;
                }

                return num * recursiveFactorial(num - 1);
            }
            // Usually runs faster and uses less memory but its not intuitive
            // and can be very long
            public static int iterativeFactorial(int num) {

                if(num == 0) {
                    return 1;
                }

                    int factorial = 1;
                    for (int i = 1; i <= num; i++) {
                        factorial *= i;
                    }
                    return factorial;
                }
            }
