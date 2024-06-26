public class CountingSort {
    public static void main(String[] args){

        int[] array = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(array, 1, 10);

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void countingSort(int[] array, int min, int max){

        // This array will be counting of how many of each number we get
        int[] countArray = new int[(max - min) + 1];

        for(int i = 0; i < array.length; i++){
            countArray[array[i] - min]++;
        }

        int j = 0;
        for(int i = min; i <= max; i++){
            while(countArray[i - min] > 0){
                array[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
