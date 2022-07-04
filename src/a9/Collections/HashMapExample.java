package a9.Collections;


import java.util.HashMap;

public class HashMapExample {
    public static void main() {

        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));  // get single element (=London)
        capitalCities.remove("Germany");   //removes element (Germany)
//        capitalCities.clear();    // remove all elements
        capitalCities.size(); // show size of Hashmap


//        //todo Print keys
//        for (String i : capitalCities.keySet()) {
//            System.out.println(i);
//        }

//        //todo Print values
//        for (String i : capitalCities.values()) {
//            System.out.println(i);
//        }

//        //todo Print keys and values
//        for (String i : capitalCities.keySet()) {
//            System.out.println("key: " + i + " value: " + capitalCities.get(i));
//        }



        //todo OTHER TYPES (wrapper classes)

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("Name: " + i + " Age: " + people.get(i));
        }
    }
}
