package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {

        // Declaring an array of Strings of size 4
        String[] items = {"apples", "bananas", "milk", "eggs"};

        // Using a method onList, which is a factory method
        // This is where we call a static method on a class, and it returns a new instance of a class. And here I
        // am calling a static method on List, called 'of' and that returns a List of String elements back
        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        // Here I created a new ArrayList, and this time, I just passed a list of Strings to the static method on List,
        // List.of and I put that in the constructor parentheses as shown
        // This is one way to create and populate a small ArrayList, in one statement
        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        // Getting an element from the ArrayList using an index
        System.out.println("Third item = " + groceries.get(2));

        // Searching for an item in the arrayList
            // 1. This is a contains method that returns a boolean, returning true if it finds a match
        if(groceries.contains("mustard")){
            System.out.println("List contains mustard");
        }
            // 2. This method returns the index position of the element in the list, if it finds it
            // returns -1 if the element isn't found in the list
        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("second = " + groceries.lastIndexOf("yogurt"));
        System.out.println(groceries);

        // Removing items from the ArrayList
            // 1. Removing using an index
        groceries.remove(1);
        System.out.println(groceries);

            // 2. Removing using elements value... notice how we had two yogurts, this method only removes one value
            // at a time
        groceries.remove("yogurt");
        System.out.println(groceries);

        groceries.add("yogurt");
        System.out.println(groceries);
            // 3. Removes all the values that match. So if you have more than two of the same, it will remove all.
        groceries.removeAll(List.of("yogurt", "apples", "eggs"));
        System.out.println(groceries);

        // A method that is the opposite of the removeAll, this method retains the values listed and deletes everything
        // else in the list
        groceries.retainAll(List.of("pickles", "mustard"));
        System.out.println(groceries);

        // Removes everything from the list
        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        // Filling up the array again
        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        // This takes a variable argument list of elements, and produces a list, adn we can pass that list, to our
        // second call to groceries.addAll method.
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        // Sorting the array
        System.out.println(groceries);
        // This special typ allows instances to be compared to one another. String will be ordered alphabetically
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        // sorting in reverse
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        // This takes a typed array as an argument. This method will return an array, the same size as the array
        // we pass to it, and of the same type. Basically turns an ArrayList into a regular array
        String[] groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
