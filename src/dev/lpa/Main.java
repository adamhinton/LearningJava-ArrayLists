package dev.lpa;

// ArrayLists:
// Can add, delete etc
// Have mutation methods, the equivalents of push, pop etc in JS
// More flexible than Array
// Its capacity grows as elements are added; that's all handled BTS

import java.util.ArrayList;

record GroceryItem (String name, String type, int count){
    public GroceryItem(String name){
        this(name,"DAIRY", 1);
    }
}

public class Main {
    public static void main(String[] args) {

//        GroceryItem[] groceryArray = new GroceryItem[3];
//        groceryArray[0] = new GroceryItem("milk");
//        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
//        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
//        System.out.println(Arrays.toString(groceryArray));




        // Generics FTW
        // ALs are resizable, don't need to spec size
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Yogurt"));


    }
}