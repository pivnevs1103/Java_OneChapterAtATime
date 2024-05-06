package Arrays;

import java.util.Arrays;

/*
    Enhanced for Loop/ For Each Loop
    - This loop was designed to walk through elements in an array, or some other type of collection
    - it processes one element at a time, from the first element to the last

    SYNTAX:
    for( declaration : collection){
        // Block of statements
        }
    - The first part is a DECLARATION expression, which includes the type and a variable name. This is usually a local
    variable with the same type as an element in the array
    - And the second component is the array, or some other collection variable
*/
public class EnhancedForLoop_ForEachLoop {
    public static void main(String[] args) {

        // Creating an array
        int[] array = {1, 2, 3, 4, 5};

        for(int element : array){
            System.out.print(element + " ");
        }
        System.out.println();

        // this 'Arrays.toString()' is part of the Arrays class that we can use to print out all the elements in our
        // array in a single line with brackets and commas
        System.out.println(Arrays.toString(array));


        // ANOTHER THING:  You can assign any array, to an Object variable
        // In this code we are assigning an integer array refernce, to an object reference and notice here, we can still
        // use the instanceof operator, using an array type on the right side of the operand. This operand will test if
        // if our Object variable, is really an instance of the integer array. An array is a special class, recognized
        // by Java through the use of the square brackets, It still inherits from java.lang.Object class
        // Why would we do something like this? Well, you could create an array of Objects, that supports any kind of
        // type in Java
        Object object = array;
        if(object instanceof int[]){
            System.out.println("ObjectVariable is really an int array");
        }

        // Created an objectArray that has all kind of data that can be put into it, such as String, int , double
        // You could also assign another array into the array itself (Called: Nested Array)
        Object[] objectArray = new Object[5];

        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = 2;
        objectArray[3] = 5.5;
        objectArray[4] = new int[] {1, 2, 3, 4, 5};


        for(int i = 0; i < objectArray.length; i++){
            System.out.println(objectArray[i]);
        }
    }
}
