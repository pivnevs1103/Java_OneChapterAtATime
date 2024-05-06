package Arrays;

import java.util.Arrays;

public class ArrayReference {
    public static void main(String[] args) {

        // Variable myIntArray, holds a reference or address, to an array in memory
        // And we use the reference to access and control the object in memory
        int[] myIntArray = new int[5];
        // Now we got two references pointing to the same array in memory
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        // Making a change to the array using the 2nd reference
        anotherArray[0] = 1;
        modifyArray(myIntArray);

        // Because of the above, both will print array with the first value in place 0 being 1 and place 1 with value 2
        // This is because both of them are just references to the same array
        System.out.println("After change myIntArray = "  + Arrays.toString(myIntArray));
        System.out.println("After change anotherArray = "  + Arrays.toString(anotherArray));

    }
    private static void modifyArray(int[] array){

        array[1] = 2;
    }
}
