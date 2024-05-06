public class SelectionSortMyAttempt {
    public static void main(String[] agrs){

    int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

    for(int unSortedPart = intArray.length - 1; unSortedPart > 0; unSortedPart--){

        int largestNum = 0;

        for(int i = 1; i <= unSortedPart ; i++) {
             if(largestNum < intArray[i]){
                largestNum = i;
                continue;
             }
        }
        swap(intArray, largestNum, unSortedPart);
    }

    for(int i = 0; i < intArray.length; i++){
        System.out.println(intArray[i]);
        }
    }
    public static void swap(int[] array, int num1, int num2){

        if(num1 == num2){
            return;
        }

        int tempNum = array[num1];
        array[num1] = array[num2];
        array[num2] = tempNum;
    }
}
