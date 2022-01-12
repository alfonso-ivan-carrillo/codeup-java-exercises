package util;

import java.util.HashMap;

public class GroceryTester {
    public static void main(String[] args) {

        HashMap<Integer, String> category = new HashMap<>();
        category.put(1,"junk food");
        category.put(2, "produce");
        category.put(3, "beverage");
        category.put(4, "meat");

        System.out.println(category.keySet());
        System.out.println(category.entrySet());

        GroceryList joe = new GroceryList("joe");
        System.out.println(joe);
        joe.addToList(0, "soda");
        joe.addToList(1, "chips");
        joe.addToList(2, "beer");
        joe.addToList(3, "ribeye steak");

        System.out.println(joe.getName());
        System.out.println(joe.groceryList);



    }
}
