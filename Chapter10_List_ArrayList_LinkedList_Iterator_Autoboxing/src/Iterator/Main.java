package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>(List.of("Moscow", "Sydney", "Paris", "Rio",
                "Miami", "New York"));

        testIterator(cities);

        usingListIterator(cities);
    }

    private static void testIterator(LinkedList<String> list){

        var iterator = list.iterator();
        // This type of iterator only allows us to move forward with the elements
        while(iterator.hasNext()){
            if(iterator.next().equals("Rio")){
                // Make sure to call the iterator object and not the list object when using .remove()
                iterator.remove();
            }
            System.out.println(iterator.next());
        }
        System.out.println(list);
    }

    /*
            Iterator vs. ListIterator
            - An iterator: is forwards only, and only supports the remove method

            - ListIterator:can be used to go both forwards and backwards, and in addition to the remove method,
            it also supports add and set method
     */

    public static void usingListIterator(LinkedList<String> list){

        var iterator = list.listIterator();

        while(iterator.hasNext()){
            if(iterator.next().equals("Moscow")){
                iterator.remove();
                iterator.add("Omsk");
            }
        }

        //  Note: cannot do this, because the iterator has already gone through the loop and you can not reuse it
        // You would have to create a new instance or move backwards
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(list);

        // This code is iterating backwards through the list and printing each town
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        // Another thing we can do, is call the listIterator method and pass, the cursor position we want to start at
        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());
        System.out.println(iterator2.next());
        System.out.println(iterator2.previous());

        /*
            IMPORTANT: Iterator position vs. Element position

            - The iterators cursor positions, are between the elements. When the iterator is at position 0, or the
            start, its not pointing at element 0
         */
    }
}
