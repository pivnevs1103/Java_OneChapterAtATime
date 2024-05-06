package Arrays;

import java.util.Arrays;
import java.util.Random;

/* This is a helper class with different functions to help you work with Arrays
        - Most Common methods I would use
 */
public class UsingPackage_Java_Util_Arrays {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);

        // To String method that prints all the values in the array
        System.out.println(Arrays.toString(firstArray));

        // This method sorts the array for us, from the smallest value to the biggest
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        // Creating a new Array
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        // This .fill method sets all the values in our array to value of my choice( 5 in this case)
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        // Creating a third Array
        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        // Created a fourth array and then copied over the all the values from it and the size of it
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        // Doing stuff to the copy of the array does not impact the original array
        // As we can see, fourthArray is a copy of the third and we sorting the fourth array, however thirdArray
        // remains the same
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));
    }

    private static int[] getRandomArray(int len){

        Random random = new Random();

        int[] array = new int[len];
        for(int i = 0; i < len; i++){
            // Assigns random numbers between 0-99 to the array
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
