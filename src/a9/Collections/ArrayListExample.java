package a9.Collections;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public static void main() {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        cars.set(0, "Opel"); // change 1st element
        cars.remove(1); // remove 2nd element
//        cars.clear(); //remove all elements

        //todo po usunieciu 1 elemntu, drugi staje sie pierwszym itd!!!!!
//        System.out.println(cars.get(0));
//        cars.remove(0);
//        System.out.println(cars.get(0));

        System.out.println();

        System.out.println("Print whole colletion:\n" + cars);
        System.out.println();
        System.out.println("Print 1st element:\n" + cars.get(0));
        System.out.println();
        System.out.println("Print array size:\n" + cars.size());
        System.out.println();


        System.out.println("FOR LOOP EXAMPLE↓↓↓");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println();

        System.out.println("FOR EACH EXAMPLE↓↓↓");
        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("OTHER TYPE + SORT + FOR EACH↓↓↓");
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }



    }
}
