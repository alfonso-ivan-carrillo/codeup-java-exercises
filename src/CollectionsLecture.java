import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLecture {
    // A collection is a data structure that collects, or groups objects together.
    // int[]  nums = int[5]; creating an array creating and ArrayList syntax appears similiar.

    // package - import java.util.ArrayList;

    public static void main(String[] args) {
    // To instantiate an Arraylist
        ArrayList<String> petNames = new ArrayList<String>();

    // .add(item to add) - adds an element to the ArrayList.
    // OVERLOADED METHOD - .add(index, item) - where to add in ArrayList and item to add
        petNames.add("Kali");
        petNames.add("Bella");
        petNames.add(0,"Jack");
        petNames.add("Buster");
        petNames.add("Bella");
        petNames.add("Lexi");

        System.out.println(petNames);

    //  With arrays we find the number of elements by using the .length field
    //  With ArrayLists, we can use the .size() method.

        System.out.println(petNames.size());

    //  .get(index) - returns the element of specified index.
        System.out.println(petNames.get(3));

    // .indexOf(elementValue) - returns the index of the first occurrence of the element specified.
        System.out.println(petNames.indexOf("Bella"));
        System.out.println(petNames.indexOf("Jo")); // returns -1 since it does not exist in ArrayList

    // to iterate through an ArrayList
        for(String name: petNames){
            System.out.println(name);
        }

    //  .contains(element) - returns a boolean of whether or not the ArrayList contains an element.
        System.out.println(petNames.contains("Bella"));

    // .lastIndexOf(element) - returns the index of the last occurrence of the specified element.
        System.out.println(petNames.lastIndexOf("Bella"));

    // .isEmpty() - returns a boolean whether or not the ArrayList has any elements.
        System.out.println(petNames.isEmpty());

    // .remove(element) - NO RETURN - removes the first occurrence of the element specified.
        petNames.remove("Bella");
        System.out.println(petNames);

    // NO SORT METHOD FOR ARRAYLIST - you would have to create a custom sort method



    // HASH MAPS
    // package - import java.util.HashMap;
    // A hash map is a data structure of key-value pairs, implemented with the hashMap class in java.
    // A has map is a data structure for key-value pairs.

        HashMap<String, Person> people = new HashMap<>();

        Person p1 = new Person("Logan");
        Person p2 = new Person("Xavier");
        Person p3 = new Person("Scott");
        Person p4 = new Person("Jean");

    // .put(key, value) - establishes the key and value.
        people.put(p1.getName(), p1);
        people.put(p2.getName(), p2);
        people.put(p3.getName(), p3);
        people.put(p4.getName(), p4);
        System.out.println(people);


        // .putIfAbsent(key, value) - only sets a key-pair value if it does not exist.
        people.putIfAbsent("Jay", new Person("Jay"));
        System.out.println(people);

    // .get(key) - returns the value for the specified key.
        System.out.println(people.get("Logan"));

    // .keySet() - returns the keys of the pairs
        System.out.println(people.keySet());

        //  .getOrDefault(key, value) - like get, but with a defined value instead of null.
        System.out.println(people.getOrDefault("Adam", p1));

    // .containsKey(key) - returns a boolean whether or not the Key exists in the Map.
        System.out.println(people.containsKey("Scott"));

    // .containsValue(value) - returns a boolean whether or not the Value exists in the map.
        System.out.println(people.containsValue(p1));

    // .remove(key) - NO RETURN - removes a key-value pair
        people.remove("Jean");
        System.out.println(people);

    // .replace(key, value) - replace a value at a given key
        people.replace("Xavier", new Person("Xavier"));
        System.out.println(people);

    // .clear() - NO RETURN - empties the array
        people.clear();
        System.out.println(people);

        // .isEmpty() - returns boolean on whether elements exist in the array or not
        System.out.println(people.isEmpty());

    }
}
