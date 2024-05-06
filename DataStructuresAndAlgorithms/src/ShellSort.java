/*

 */

public class ShellSort {
    public static void main(String[] args){

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for(int gap = array.length / 2; gap > 0; gap /= 2){

            for(int i = gap; i < array.length; i++) {

                int newElement = array[i];

                int num1 = i;

                while (num1 >= gap && array[num1 - gap] > newElement) {
                    array[num1] = array[num1 - gap];
                    num1 -= gap;
                }

                array[num1] = newElement;
            }
        }


        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
