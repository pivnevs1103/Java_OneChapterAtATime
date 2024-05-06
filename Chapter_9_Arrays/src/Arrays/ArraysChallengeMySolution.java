package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*
        Sorts the array from highest to lowest number
 */
public class ArraysChallengeMySolution {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];

        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(0,100);
        }

        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] < array[j +1]){
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }

        System.out.println(Arrays.toString(array));

    }
}
