package a9.Collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main() {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");       // cant duplicate items in HashSet
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println("check if 'Mazda exists: " + cars.contains("Mazda"));  // check if item exists
        cars.remove("Volvo");  // removes one item
//        cars.clear();   //removes all items
        System.out.println("Cars size: " + cars.size());  // show HashSet Size / how many items

        System.out.println();


        //todo ForLoop
//        for (String i : cars) {
//            System.out.println(i);
//        }


        //todo OTHER TYPES (wrapper classes)
        //// Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}
