package Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysChallenge_ProfessorsSolution {
    public static void main(String[] args) {

        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = random.nextInt(1000);
        }

        return array;
    }

    private static int[] sortIntegers(int[] arrays){

        int[] sortedArray = Arrays.copyOf(arrays, arrays.length);

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}