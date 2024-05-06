public class InsertionSortMyAttempt {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        insertion(array);

        for(int i = 0; i < array.length;i++){
        System.out.println(array[i]);
        }
    }

    public static void insertion(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int tempValue = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > tempValue){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tempValue;
        }
    }
}
