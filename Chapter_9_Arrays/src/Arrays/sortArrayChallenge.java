package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class sortArrayChallenge {
    public static void main(String[] args) {

        int[] unsortedArray = getIntegers(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));

        printArray(sortedArray);
    }
    public static int[] getIntegers(int len){

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[len];

            for(int i = 0; i < len; i++){
                array[i] = scanner.nextInt();
            }

            return array;
        }

        public static int[] sortIntegers(int[] array){

            int temp;
            boolean flag = true;

            while(flag){
                flag = false;

                for(int i = 0; i < array.length - 1; i++){
                    if(array[i] < array [i + 1]){
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        flag = true;
                    }
                }
            }
            return array;
        }

        public static void printArray(int[] array){

            for(int i = 0; i < array.length; i++){
                System.out.println("Element " + i + " contents " + array[i]);
       }
    }
}
