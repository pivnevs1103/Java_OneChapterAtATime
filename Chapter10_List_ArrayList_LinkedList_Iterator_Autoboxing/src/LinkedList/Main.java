package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        // Calling the addingElements method which showcases the use of List, queue and stack commands/methods
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        // Calling the removeElements method which showcases the use of List, queue and stack commands/methods
        removeElements(placesToVisit);
        System.out.println(placesToVisit);

        // Repopulating the linked list
        addMoreElements(placesToVisit);

        // Calling the method that gets retrieves elements from the Linked List
        // The big O notation here is O(n)
        gettingElements(placesToVisit);

        // Showcasing how to traverse the LinkedList
        printItinerary(placesToVisit);

        // Traversing the linked list using enhanced 'for' loop
        printItineraryTwo(placesToVisit);

        // Using LISTITERATOR, we are traversing the list and printing it out, same as above
        printItineraryThree(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){

        // Regular List methods
        // Adds it to the start of the list
        list.addFirst("Darwing");
        // Adds it to the end of the list
        list.addLast("Hobard");

        // Queue methods ------------------------------------------------------------------------------------
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");


        // Stack methods -------------------------------------------------------------------------------------
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list){

        // Regular List methods
        list.remove(4);
        list.remove("Brisbane");

        // Additional remove methods, one is a no argument remove method ---------------------------------------------
        System.out.println(list);
        // Removes first element
        String s1 = list.remove();
        System.out.println(s1 + " was removed");
        // Same thing as above but it just makes it more readable and understandable
        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        // removes the last element
        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

        // Queue methods ----------------------------------------------------------------------------------------
        String p1 = list.poll();
        System.out.println(p1 + " the first element was removed");
        // same as above
        String p2 = list.pollFirst();
        System.out.println(p2 + " the first element was removed");
        // removes the last element
        String p3 = list.pollLast();
        System.out.println(p3 + " the first element was removed");

        // Stack methods----------------------------------------------------------------------------
        // Repopulating the list
        list.push("Sydney");
        list.push("Canberra");
        list.push("Brisbane");

        // Removes first element
        String p4 = list.pop();
        System.out.println(p4 + " first element was removed");
    }

    // Method that retrieves elements from a linked list
    private static void gettingElements(LinkedList<String> list){

        // O(n) because it has to traverse the LinkedList
        System.out.println("Retrieved Element = " + list.get(4));

        // Gets the first and last elements in the Linked List
        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        // Returns the index of the item you are searching for
        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

        // QUEUE retrieval method--------------------------------------------------------------------------------
        System.out.println("Element from element() = " + list.element());

        // STACK retrieval method---------------------------------------------------------------------------------
        System.out.println("Element from element() = " + list.peek());
        System.out.println("Element from element() = " + list.peekFirst());
        System.out.println("Element from element() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list){

        // Printing out the List to show case all the places to visit
        System.out.println(list);
        // Prints out the first place to visit
        System.out.println("Trip starts at " + list.getFirst());

        // We printing out all the places to visit except the first and the last place
        for(int i = 1; i < list.size(); i++){
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        // Printing out the last place we are visiting
        System.out.println("Trip ends at " + list.getLast());
    }

    // Same thing as above but it just uses the enhanced for loop
    public static void printItineraryTwo(LinkedList<String> list){

        // Prints out the first place to visit
        System.out.println("Trip starts at " + list.getFirst());

        // We printing out all the places to visit except the first and the last place
        // creating a variable and assigning the first element to it
        String previousTown = list.getFirst();
        for(String town : list){
            // Prints out the town we are starting from to the next town
            System.out.println("--> From: " + previousTown + " to " + town);
            // Setting the previous town to the next town because the town variable itself will iterate
            previousTown = town;
        }
        // Printing out the last place we are visiting
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItineraryThree(LinkedList<String> list){

        // Prints out the first place to visit
        System.out.println("Trip starts at " + list.getFirst());

        // Using the List Iterator
        String previousTown = list.getFirst();
        // Set up a local variable with a type of list iterator with type string and assigned it toa method on LinkedList
        ListIterator<String> iterator = list.listIterator(1);
        // iterator.hasNext() will return true if there are more elements to process
        while(iterator.hasNext()){
            // Local loop variable, which is set to the result of another method, called next(), which reads the next
            // item in the list
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        // Printing out the last place we are visiting
        System.out.println("Trip ends at " + list.getLast());
    }
}
