package util;

import java.util.ArrayList;

public class GroceryList {
    public String name;
    public ArrayList<String> groceryList;

    // constructor
    public GroceryList(String name){
        this.name = name;
        this.groceryList = new ArrayList<String>();
    }

    public GroceryList(){}

    public String getName(){
        return name;
    }

    public void addToList(int index, String name){
        groceryList.add(index, name);
    }



}
