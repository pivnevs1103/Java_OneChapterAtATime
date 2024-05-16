package Autoboxing_And_Unboxing;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Preferred but unnecessary(Manually)
        // Boxing
        Integer boxedInt = Integer.valueOf(15);
        //Unboxing
        int unboxedInt = boxedInt.intValue();

        // Out of dated and deprecated(Although its red it will still run)
        Integer deprecatedBoxing = new Integer(15);


        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());

        // remember for this method the return type is double which means its being boxed
        Double resultBoxed = getLiteralDoublePrimitive();
        // Remember for this method the return type is DOUBLE, which means its being unboxed
        double resultUnboxed = getDoubleObject();

        // HOW THIS APPLIES TO ARRAYS AND LISTS ----------------------------------------------------------
        Integer[] wrappedArray = new Integer[5];
        // This autoboxes the primitive integer literal
        wrappedArray[0] = 50;
        System.out.println(Arrays.toString(wrappedArray));
        // Proof that JVM auto-boxed the literal number 50, before assigning it to an element in the array
        System.out.println(wrappedArray[0].getClass().getName());

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = getList(1, 2, 3, 4, 5);
        System.out.println(ourList);

        var secondList = getList2(1, 2, 3, 4, 5);
        System.out.println(secondList);

    }

    private static Double getDoubleObject(){

        return Double.valueOf(100.0);
    }

    private static double getLiteralDoublePrimitive(){
        return 100.0;
    }

    // This method is declared with a single parameter a variable arguments declaration, for the int primitive.
    // This means this method can be called with 0 to many int values
    private static ArrayList<Integer> getList(int... varargs){

        // This method autoboxes
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i : varargs){
            aList.add(i);
        }
        return aList;
    }
    // Same thing as above except we are passing a wrapper class now, rather a primitive data
    private static ArrayList<Integer> getList2(Integer... varargs){

        ArrayList<Integer> aList = new ArrayList<>();
        for(int i : varargs){
            aList.add(i);
        }
        return aList;
     }

    // In this code, we take a java.lang.Integer parameter as an argument, and simply return it from this method,
    // whose return type is an int primitive
    private static int returnAnInt(Integer i){
        return i;
    }

    // The opposite of whats happening above
    private static Integer returnAnInteger(int i){
        return i;
    }

    /*
           - What all of this means is that, we can almost use primitives, and their corresponding wrappers,
           interchangeably
           - What this means is that for the factory objects, that create list, we can create lists from primitive
           literals, as we did here, in the main method.
     */
}
