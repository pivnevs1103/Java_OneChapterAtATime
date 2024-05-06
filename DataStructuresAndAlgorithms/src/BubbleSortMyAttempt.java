public class BubbleSortMyAttempt {
    public static void main(String[] args){

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};


        for(int i = 0; i < intArray.length; i++){
            for(int j = 0; j < intArray.length - 1; j++){
                if(intArray[j] > intArray[j + 1]){
                    swap(intArray, j, (j+1));
                }
            }
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
