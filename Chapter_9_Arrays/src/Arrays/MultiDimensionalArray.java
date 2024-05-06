package Arrays;

import java.util.Arrays;

/*
        - In java the inner arrays can be of any size, all the inner arrays do not have to be same size
        - Also even tho you mightve specified a certain size for the inner array, but that doesnt mean it has to stay
        that size. You can modify it
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {

        int[][] array = new int[4][4];

        // Even tho we specified that each inner array has to be size 4, here we are creating a new array and making it
        // size 3
        array[1] = new int[]{10, 20, 30};
        System.out.println(Arrays.deepToString(array));


        Object[] multiArray = new Object[3];
        System.out.println(Arrays.toString(multiArray));
        // First element is itself of a single-Dimension array
        multiArray[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(multiArray));

        // The second elements is a two-dimensional Array
        multiArray[1] = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {6, 7, 8}};
        System.out.println(Arrays.deepToString(multiArray));

        // The last, the third element is a three-dimensional array
        multiArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(multiArray));
        System.out.println("-".repeat(30));

        for(Object element : multiArray){
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            // We happen to know that teh each element is an array, but the java compiler doesnt know that,
            // The Arrays.deepToString method takes an array, so we need to cast out element to an array of Object,
            // before we pass it to this method
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }
}
