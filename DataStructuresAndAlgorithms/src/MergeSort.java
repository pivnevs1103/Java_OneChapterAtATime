public class MergeSort {
    public static void main(String[] args){
        int[] array = {20, 35, -15, 7, 55, 1, -22 };
        mergeSort(array, 0, array.length);

        int[] array2 = {10, -5, 15, 1};
        mergeSort(array2, 0, array2.length);

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void mergeSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end){
        if(input[mid -1] <= input[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        // Creating a temporary array to store
        int[] tempArray = new int[end - start];

        while(i < mid && j < end){
            tempArray[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        // IF there are elements left over in the left array this will copy them directly
        // from one location in the input array, to another location in the input array
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        System.arraycopy(tempArray, 0, input, start, tempIndex);
    }
}
