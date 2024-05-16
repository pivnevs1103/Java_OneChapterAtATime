package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while(flag) {
            System.out.print("""
                    Available options:
                                    
                    0 - to shutdown
                    1 - to add item(s) to list (comma delimited list)
                    2 - to remove any items (comma delimited list)
                    Enter a number for which action you want to do:""");
            int input = scanner.nextInt();
            switch (input){
                case 0 -> flag = false;
                case 1 -> addingItem(arrayList);
                case 2 -> removingItem(arrayList);
                default -> System.out.println("Oops, you have entered something incorrect, try again!");
            }
            System.out.println();
            arrayList.sort(Comparator.naturalOrder());
            System.out.println("\nSHOPPING LIST: " + arrayList);
        }
    }
    public static void addingItem(ArrayList<String> list){
        System.out.print("Please enter, separated by comma the items you want to add to your grocery list: ");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while(flag){
        String[] array = scanner.nextLine().split(",");

        for(int i = 0; i < array.length; i++) {
            if (!list.contains(array[i])) {
                list.add(i, array[i].trim());
                System.out.println("... Nice, you have just added: " + array[i].toUpperCase() + " to your " +
                                                   " shopping List");
            } else {
                System.out.print("The item " + array[i] + " is already in the list, please enter the list again" +
                        " without that item");
                System.out.println();
                break;
                }
            if(array.length - i == 1){
                flag = false;
                }
            }
        }
    }

    public static void removingItem(ArrayList<String> list){

        System.out.println("Please enter the item/s you would like to remove from your list");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            String[] array = scanner.nextLine().split(",");

            for(int i = 0; i < array.length; i++){
                if(list.contains(array[i])){
                    list.remove(array[i].trim());
                    System.out.println("... Nice, you have just removed the item: " + array[i].toUpperCase() +
                            " from your shopping List");
                }else {
                    System.out.print("An item " + array[i] + " is not in your list, Please try again: ");
                    break;
                }
                if(array.length - i == 1){
                    flag = false;
                }
            }
        }
    }
}
