package util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryTester {


    public static void printlist(HashMap<String, ArrayList<GroceryList>> list){
        System.out.println("Current Grocery List:");
    }


    public static void runApp(HashMap<String, ArrayList<GroceryList>> list, Input in){
        System.out.println("Welcome to the Tres Locos Market! \n");
        boolean run = true;
        while (run) {
            System.out.println("Please make your selection: ");
            System.out.println("1. Add new item to the grocery list");
            System.out.println("2. View List");
            System.out.println("3. Quit");
            int userInput = in.getInt(1, 3);
            switch (userInput){
                case 1:
                    // add items to list here
                    System.out.println("Returning to menu.\n");
                    break;
                case 2:
                    // print list here
                    System.out.println("Returning to menu.\n");
                case 3:
                    System.out.println("Quit? Please confirm. (yes/no)");
                    if (in.yesNo()){
                        System.out.println("Thank you for shopping with Tres Locos. \n");
                        run = false;
                    } else {
                        System.out.println("Returning to menu. \n");
                    }
            }
        }
    }




    public static void main(String[] args) {

        HashMap<String, ArrayList<GroceryList>> list = new HashMap<>();
        list.put("Junk Food", new ArrayList<>());
        list.put("Produce", new ArrayList<>());
        list.put("Beverages", new ArrayList<>());
        list.put("Meat", new ArrayList<>());

//    runApp(list, new Input());
        for (Map.Entry<String, ArrayList<GroceryList>> pair : list.entrySet()){
            System.out.println(pair);
        }

        System.out.println(list.entrySet());

//        System.out.println(category.keySet());
//        System.out.println(category.entrySet());
//
//        GroceryList joe = new GroceryList("joe");
//        System.out.println(joe);
//        joe.addToList(0, "soda");
//        joe.addToList(1, "chips");
//        joe.addToList(2, "beer");
//        joe.addToList(3, "ribeye steak");
//
//        System.out.println(joe.getName());
//        System.out.println(joe.groceryList);



    }
}
