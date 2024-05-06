/*
-Array can store data of specified type
- Elements iof an array are located in a contiguous
- Each element of an array has a unique index
- The size of an array is predefined and connot be modified
- When its
 */
import java.sql.SQLOutput;

public class Arrays {
    public static void main(String[] args){

        // Time complexity = 0(1)
        // Creating an array
        int[] intArray = new int[7];

        //Assigning values to the array
        // Time complexity = O(n)
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        // Printing out the values in the array one by one
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }


    }
}
