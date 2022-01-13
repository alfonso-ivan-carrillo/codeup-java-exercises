package util;

import java.util.ArrayList;

public class GroceryList {

    private String name;
    private int quantity;
    //    public ArrayList<String> groceryList;

    // constructor
    public GroceryList(){}

    public GroceryList(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
    // setter and getter
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(){
        this.quantity = quantity;
    }

//    public void addToList(int index, String name){
//        groceryList.add(index, name);
//    }



}
