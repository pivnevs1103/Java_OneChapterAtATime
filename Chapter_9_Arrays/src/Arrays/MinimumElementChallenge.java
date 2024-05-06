package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    public static void main(String[] args) {

        int[] userInput = readIntegers();
        System.out.println(Arrays.toString(userInput));

        int smallestValue = findMin(userInput);
        System.out.println("The smallest value in the array is = " + smallestValue);

        reverse(userInput);
        System.out.println("The Array after its reversed = " + Arrays.toString(userInput));

        int[] doubleReverseArray = reverseCopy(userInput);
        System.out.println("Now we are reversing the array = " + Arrays.toString(doubleReverseArray));
    }

    private static int[] readIntegers(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number of integers and separate them by commas");
        String input = scanner.nextLine();

        String[] UserInput = input.split(",");
        int[] array = new int[UserInput.length];

        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(UserInput[i].trim());
        }
        return array;
    }

    private static int findMin(int[] array){

        int minValue = Integer.MAX_VALUE;
            for(int i : array){
                if(i < minValue){
                    minValue = i;
                }
            }
            return minValue;
    }

    private static void reverse(int[] array){

        System.out.println("The array before it is reversed = " + Arrays.toString(array));

        int left = 0;
        int right = array.length - 1;

        while(left < right){
            int tempVal = array[left];
            array[left] = array[right];
            array[right] = tempVal;
            left++;
            right--;
        }
    }

    private static int[] reverseCopy(int[] array){

        int[] reversedArray = new int[array.length];
        int maxValue = array.length - 1;

        for(int i : array){
            reversedArray[maxValue--] = i;
        }
        return reversedArray;
    }
}
