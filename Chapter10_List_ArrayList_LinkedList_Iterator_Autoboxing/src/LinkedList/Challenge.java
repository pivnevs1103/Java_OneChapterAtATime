/*
       Challenge:
       - Using LinkedList functionality, create a list of places, ordered by distance from the starting point
       - Use a ListIterator, to move, both backwards and forwards, through this ordered itinerary of places
       - First, create a type that has a town or place name, and field for storing the distance from the start
       - Next, create a itinerary of places or towns to visit
       - Instead of Strings, create a LinkedList of place or town type
       - Sydney is the first element in the list
       - Cant have duplicate places in the data set
 */
package LinkedList;

import java.util.*;

public class Challenge {
    public static void main(String[] args) {

        printInfo();
        LinkedList<Town> destinations = new LinkedList<>();
        populatingList(destinations);
        sortingListBasesOnDistance(destinations);
        userInput(destinations);

    }

    // Prints out the menu option for the user to chose from
    public static void printInfo(){

        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
    }

    // Takes in user input and using a switch statement processes the user selection
    private static void userInput(LinkedList<Town> destinations){

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        // Setting up a list iterator, so that we can use the function like forward and backwards
        var list = destinations.listIterator();

        // The program will keep on running until user types 'q' or "quit"
        while (flag) {
        String input = scanner.nextLine();

         switch(input.toUpperCase()){
            case "F", "FORWARD" -> {
               movingForward(destinations, list);
               printInfo();
            }
            case "B", "BACKWARDS" -> {
                movingBackwards(destinations, list);
                printInfo();
            }
            case "L", "LIST PLACES" ->{
                listPlaces(destinations);
                printInfo();
            }
            case "M", "MENU" -> printInfo();
            case "Q", "QUIT" -> {flag = false;
                System.out.println("Closing the program, Thank you!");
            }
            default -> {System.out.println("ERROR: You have entered something wrong please try again...");
                        printInfo();
                }
            }
        }
    }

    private static void populatingList(LinkedList<Town> destinations){

        String[] cities = {"Sydney", "Adelaide", "Alice Springs", "Brisbane", "Darwin", "Melbourne", "Perth"};
        int[] distance = {0, 1374, 2771, 917, 3972, 877, 3923};

        for(int i = 0; i < cities.length; i++) {
            destinations.add(new Town(cities[i], distance[i]));
        }
    }

    private static void sortingListBasesOnDistance(LinkedList<Town> list){

        int i = 0;
        boolean flag = true;
        Town town;
        while(flag){
            flag = false;
        }
    }

    private static void movingForward(LinkedList<Town> destinations,  ListIterator list){

        if(list.nextIndex() == 0){
            System.out.println("\nYou are starting your trip from Sydney");
        }

        if(list.nextIndex() == destinations.size() - 1){
            System.out.println("No more towns left to visit, please go backwards to view previous " +
                    "destinations\n");
        }else {
            list.next();
            Town town = destinations.get(list.nextIndex());
            System.out.println("------------>The next town on your destination is: " + town.name() +
                    " and it is " + town.distance() + " miles away from Sydney\n");
        }
    }

    private static void movingBackwards(LinkedList<Town> destinations, ListIterator list){
        if(list.nextIndex() == (destinations.size() - 1)) {
            System.out.println("You are all the way at the end of your Itinerary, lets see what the place before is: ");
        }

        if(list.previousIndex() < 1){
            if(list.previousIndex() == 0){
            list.previous();
            }
            System.out.println("You are back At Sydney, please go forward to view your destinations");
        }
        else {
            list.previous();
            Town town = destinations.get(list.nextIndex());
            System.out.println("------------>The previous town on your destination is: " + town.name() +
            " and it is " + town.distance() + " miles away from Sydney\n");
        }
    }

    private static void listPlaces(LinkedList<Town> destinations){

        var list = destinations.listIterator();
        int i = 1;

        System.out.println("\nListing places based on the Itinerary: ");
        while(list.hasNext() && i < 7){
            Town town = destinations.get(i);
            System.out.println("Town name: " + town.name() + " -> Distance from Sydney: " + town.distance());
            list.next();
            i++;
        }
        System.out.println();
    }
}
record Town(String name, int distance){}

