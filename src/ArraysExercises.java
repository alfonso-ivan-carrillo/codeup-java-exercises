import java.util.Arrays;

public class ArraysExercises {


//    public static Person[] addPerson(Person persons[], Person person){
//        persons = Arrays.copyOf(persons, persons.length + 1);
//        persons[persons.length -1] = person;
//        System.out.println(Arrays.toString(persons));
//        return persons;
//    }
    public static Person[] addPerson(Person persons[], Person person){
        persons = Arrays.copyOf(persons, persons.length + 1);
        persons[persons.length - 1] = person;
//        System.out.println(Arrays.toString(persons));
        for (Person a : persons){
            System.out.println(a.getName());
        }
        return persons;
    }

    public static int[] numArray(int arr[], int n){
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length -1] = n;
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args){
        int [] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); // prints out location of the array in memory -> [I@70beb8a3
        System.out.println(Arrays.toString(numbers)); // -> formats out to show: [1, 2, 3, 4, 5]

        numArray(numbers, 6);


        Person[] persons = {new Person("Ethan"), new Person("Kathy"), new Person("Alfonso")};
        System.out.println(Arrays.toString(persons));


//        for(Person person : persons){
//            System.out.println(person.getName());
//        }

        Person bella = new Person("Bella");

        addPerson(persons, bella);






    }
}
