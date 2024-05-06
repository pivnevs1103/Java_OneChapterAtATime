package Arrays;

public class Main {
    public static void main(String[] args) {

        // Creating an int array of size 10
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        // A short cut for creating an array but you must know the values in advance;
        int[] mySecondIntArray = {10, 5, 3, 8};
        System.out.println(mySecondIntArray[0]);

        // Creating a double array of size 10
        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("First element " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("The size of the array " + arrayLength);
        // Notice how it had to be arrayLength - 1 because the index of an array starts at 0
        System.out.println("Last element " + firstTen[arrayLength - 1]);

        // CANNOT do this
        // int[] array;
        // array = {1, 2, 3, 4, ,5};

        // However you can do this
        int[] array;
        array = new int[]{1, 2, 3, 4, 5};

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        // Creating a new array to populize it
        int[] newArray = new int[5];

        for(int i = 0; i < newArray.length; i++){
            newArray[i] = newArray.length - i;
        }
        System.out.println();
        for(int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
    }
}
