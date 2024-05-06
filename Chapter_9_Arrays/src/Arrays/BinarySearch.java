package Arrays;

import java.util.Arrays;

/*
        Binary Search:
        - works by splitting the array into two pieces, and then splitting those parts by two again, and this continues
        on until you found what you looking for
        - There are many algorithms for this
        - Java provides us with a method for this "Arrays.binarySearch"
                To use this method, few rules
                    - The array has to be sorted
                    - If there is duplicate values in the array, there is no guarantee which one it will match on
                    - Elements must be comparable, trying to compare instances of different types, may lead to errors
                        and invalid results
 */
public class BinarySearch {
    public static void main(String[] args) {

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        // Sorts it by the first letter in alphabetical order
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));


        // Using the binary Search you first have to sort it then pass the name of the array and then what you are
        // looking for
        if(Arrays.binarySearch(sArray, "Mark") > 0){
            System.out.println("Found Mark in the list");
        }

        /******************************************************************************************************
         * BONUS: COMPARING IF ARRAYS ARE EQUAL

            Two arrays are considered equal if both arrays contain the same number of elements, and all elements
            in the same position in both arrays, are equal. The values have to be in the same position too.
            This means that the arrays literally have to be perfect replicas of each other to be considered equal
         *******************************************************************************************************/

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        if (Arrays.equals(s1, s2)){
            System.out.println("The arrays are equal");
        } else {
            System.out.println("The arrays are NOT equal");
        }
    }
}
