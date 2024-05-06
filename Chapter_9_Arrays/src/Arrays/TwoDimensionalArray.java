package Arrays;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        // Declaring a two dimnesional array
        int[][] array2 = new int[4][4];

        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length =" + array2.length);

        for(int[] outer : array2){
            System.out.println("Print outer array list = " + Arrays.toString(outer));
        }

        for(int i = 0; i < array2.length; i++){
            var innnerArray = array2[i];
            for(int j = 0; j < innnerArray.length; j++){
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // The 'VAR' variable allows java to predict what kind of a variable this actyally is and will decide itself
        for(var outer : array2){
            for(var element : outer){
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println();
        // A method to print a two dimensional array using the Arrays class
        System.out.println(Arrays.deepToString(array2));
        System.out.println();

        // Filling up the two dimensional array
        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < array2.length; j++){
                array2[i][j] = (i * 10) + (j + 1);
            }
        }
        System.out.println(Arrays.deepToString(array2));
    }
}
