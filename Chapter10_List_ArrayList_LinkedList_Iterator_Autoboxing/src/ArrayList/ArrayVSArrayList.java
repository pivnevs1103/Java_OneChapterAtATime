package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

public class ArrayVSArrayList {
    public static void main(String[] args) {

        /**************************************************************************
                            Instantiating WITHOUT Values
         **************************************************************************/
         // Array
        String[] array = new String[10];

        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        /**************************************************************************
                            Instantiating WITH Values
         **************************************************************************/
        // Array
        String[] array2 = new String[] {"first", "second", "third"};
                        // OR another way
        String[] array3 = {"first", "second", "third"};

        // ArrayList
        ArrayList<String> arrayList1 = new ArrayList<>(List.of("first", "second", "third"));

        /**************************************************************************
                            Element Information
         **************************************************************************/
        // ARRAY
            // Index value of the last element
            int lastElement  = array.length - 1;
            // Retrieving number of elements
            int elementCount = array.length;
            // Setting(assigning an element)
            array[0] = "zero";
            // Getting an element
            String element = array[0];

         // ARRAYLIST
            // Index value of the last element
            lastElement = arrayList.size() - 1;
            // Retrieving number of elements
            elementCount = arrayList.size();
            // Setting(assigning an element)
            arrayList.set(0, "zero");
            // Getting an element
            element = arrayList.get(0);

         /**************************************************************************
                   Getting a String representation for a single dimension
         **************************************************************************/
        // Arrays
        System.out.println(Arrays.toString(array));

        // ArrayList
        System.out.println(arrayList);

        /*************************************************************************
                Getting a String representation for a multi-dimensional
         **************************************************************************/
        // ARRAY
        String[][] array4 = {
                {"first", "second", "third"},
                {"fourth", "fifth"}
        };
        // Printing out multi-dimensional array
        System.out.println(Arrays.deepToString(array4));

        // ARRAYLIST
        ArrayList<ArrayList<String>> multiDArrayList = new ArrayList<>();
        // Printing out multi-dimensional ArrayList
        System.out.println(multiDArrayList);

        /*************************************************************************
                    Finding an element in an Array or ArrayList
         **************************************************************************/
        // Array, NOTE: Array must be sorted beforehand
        Arrays.binarySearch(array2, 0);

        // ArrayList
        arrayList1.contains(0);
        arrayList1.containsAll(List.of("first", "second"));
        arrayList1.indexOf(0);
        arrayList1.contains("first");
        arrayList1.lastIndexOf("first");

        /*************************************************************************
                                    Sorting
         **************************************************************************/
        // Array
        Arrays.sort(array2);

        // ArrayList
        arrayList1.sort(Comparator.naturalOrder());
        arrayList1.sort(Comparator.reverseOrder());

        /*************************************************************************
                             Array as an ArrayList NOTE: not resizable
         **************************************************************************/
        String[] originalArray = new String[] {"first", "second", "third"};
        var originalList = asList(originalArray);

        // When you make adjustments to the List, they automatically update in the array
        originalList.set(0, "one");
        System.out.println("list: " + originalList);

        // Sorting the List will also sort the original array
        originalList.sort(Comparator.naturalOrder());
        System.out.println(Arrays.toString(array));

        // Creating a fixed size List
        List<String> newList = Arrays.asList("monday", "tuesday", "wednesday");
        System.out.println(newList);

        /*************************************************************************
                    Creating Special Kind of Lists
         **************************************************************************/
        // Using Arrays.asList = Returned List is NOT resizable, but is mutable -  2 ways of doing it
            // 1.
        var newList1 = Arrays.asList("Sunday", "Monday", "Tuesday");
            // 2.
        String[] days = new String[]{"Sunday", "Monday", "Tuesday"};
        List<String> newList2 = Arrays.asList(days);


        // Using a List.of = Returned List is IMMUTABLE(means you can not change) - 2 ways of doing it
            // 1.
        var listOne = List.of("Sunday", "Monday", "Tuesday");
            // 2.
        String[] days1 = new String[]{"Sunday", "Monday", "Tuesday"};
        List<String> listOne1 = List.of(days1);

        /*************************************************************************
                        Creating an Array from ArrayList
         **************************************************************************/
        ArrayList<String> stringLists = new ArrayList<>(List.of("Jan", "Feb", "Mar"));
        String[] stringArray = stringLists.toArray(new String[0]);
    }
}
