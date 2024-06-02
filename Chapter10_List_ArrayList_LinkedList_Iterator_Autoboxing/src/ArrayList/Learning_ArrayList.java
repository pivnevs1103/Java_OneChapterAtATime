package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){

    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }
    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Learning_ArrayList {
    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        // Proper way to initiate an Array List
        ArrayList<GroceryItem> groceryList = new ArrayList<>(3);
        groceryList.add(new GroceryItem("butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));

        // We using an index specifier for apples to add it in the first spot and push everything in the list down
        // this will of course resize the arrayList
        groceryList.add(0, new GroceryItem("apples", "PRODUCE", 6));

        // Now I am using the set method to replace something in our list
        groceryList.set(1, new GroceryItem("Kit Kat", "CANDY", 1));

        // We can also remove something from our list
        groceryList.remove(2);
        System.out.println(groceryList);
    }
}

