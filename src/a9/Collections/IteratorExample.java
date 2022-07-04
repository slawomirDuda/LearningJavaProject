package a9.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main() {

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> iterator = cars.iterator();

        System.out.println(iterator.next());   //print first item
        System.out.println(iterator.next());   //print NEXT item

        System.out.println();

        //loop through whole collecion (hasNext() and next() - petla while)
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        //todo REMOVE ITEMS (only with while loop)
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        Iterator<Integer> iterator1 = numbers.iterator();

        while(iterator1.hasNext()) {
            Integer item = iterator1.next();
            if(item < 10) {
                iterator1.remove();
            }
        }
        System.out.println(numbers);

    }
}
