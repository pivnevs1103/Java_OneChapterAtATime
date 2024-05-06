public class MergeSortAnotherVariation {
    public static void main(String[] agrs){

        int[] array = {20, 35, -15, 7, 55, 1, -22 };

        mergeSort(array);

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void mergeSort(int[] inputArray){

        int arrayLength = inputArray.length;

        if(arrayLength < 2){
            return;
        }

        int midIndex = arrayLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arrayLength - midIndex];

        // Populating the left side of the array
        for(int i = 0; i < midIndex; i++){
            leftHalf[i] = inputArray[i];
        }
        // Populating the right side of the array
        for(int i = midIndex; i < arrayLength; i++){
            // This makes sure that we start at the beginning of the right side
            // of the array
            rightHalf[i - midIndex] = inputArray[i];
        }

        //Recursion methods to merge until each element in the array is its own sorted array
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //Merging the two separate arrays
        merge(inputArray, leftHalf, rightHalf);
    }

    public static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        // i is for the left array, j is for the right side array and k is to keep track
        // of how many numbers we have processed
        int i = 0, j = 0, k = 0;

        // If the number on the left is side is smaller we add it to the array
        // and increment i by one to compare the next number in line
        // Now we do the same thing but for the right side by using the else statement
        while(i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        // This is to account for any numbers that are left over, they will be added
        // to the back of the array
        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        // This is to account for any numbers that are left over, they will be added
        // to the back of the array
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
   }
}
