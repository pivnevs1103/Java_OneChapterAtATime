/*
-Time complexity for the whole thing is O(mn) = m for rows and n for columns

 */

import java.util.Arrays;

public class twoDimensionalArray {
    public static void main(String[] args) {

        // Declaring the array
        int[][] intArray;

        // Declaring the size of it. So 2 rows and 2 columns
        intArray = new int[2][2];

        // Initialize the values into the array
        intArray[0][0] = 1;
        intArray[0][1] = 2;
        intArray[1][0] = 3;
        intArray[1][1] = 4;

        System.out.println(Arrays.deepToString(intArray));


        String s2Darray[][] = {{"a", "b"}, {"c", "d"}};
        System.out.println(Arrays.deepToString(s2Darray));


        int[][] array = insertingTwoDimensionalArray(5,5);
        InsertValue(array, 2);

    }
    public static int[][] insertingTwoDimensionalArray(int numberOfRows, int numberOfColumns){

        int[][] twoDArray = new int[numberOfRows][numberOfColumns];

        for(int row = 0; row < twoDArray.length; row++){
            for(int col = 0; col < twoDArray[0].length; col++){
                twoDArray[row][col] = Integer.MIN_VALUE;
            }
        }
        System.out.println(Arrays.deepToString(twoDArray));
        return twoDArray;
    }
    public static void InsertValue(int[][] array, int value){




            System.out.println("Hello");                    }
                }
