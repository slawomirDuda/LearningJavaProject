package a6.Scanner;

import java.util.Scanner;

public class aMain {
    public static void main() {

       //todo SIMPLE EXAMPLE:
//        Scanner myScanner = new Scanner(System.in);
//
//        System.out.println("Enter name, age and salary:");
//
//        // String input
//        String name = myScanner.nextLine();
//
//        // Numerical input
//        int age = myScanner.nextInt();
//        double salary = myScanner.nextDouble();
//
//        // Output input by user
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Salary: " + salary);



        //todo MOJE NIESKONCZONE:
        Scanner myScanner = new Scanner(System.in); // Create a Scanner object


        System.out.println("Enter name:");
        String name = myScanner.nextLine();        // String input
        if(name.contains("Kamil")){
            System.out.println("Awww, what a beautiful name :)");
        } else if (name.contains("Slawek")) {
            System.out.println("You have best name on earth");
        } else{
            System.out.println("Ugly name, best names are 'Slawek' and 'Kamil'");
        }

        System.out.println("Do you have job?");
        String job = myScanner.nextLine();

        System.out.println("Ok, so tell me: how big is your salary?");

        //        int salary = myScanner.nextInt();
//          Numerical input todo np nextInt albo nextDouble czyta tylko int albo double,
//         todo ZOSTAWIA ZNAK NOWEJ LINII I KRZACZY, solution ponizej

        double salary = Double.parseDouble(myScanner.nextLine());
        // Numerical input todo musisz zaczytaj cala linijke wlacznie ze
        // todo ZNAKIEM NOWEJ LINII (\n), nastepnie skonwertowac na docelowy typ!!!!


//        Scanner myScanner2 = new Scanner(System.in);  //todo DLACZEGO MUSIALEM ZROBIC myScanner2, inaczej nie działało!!!!

        System.out.println("Ok, aaaand, do you have car?");
        String car = myScanner.nextLine();         // String input
        System.out.println(car);
        if(car.contains("Yes")) {
            System.out.println("How old is your car?:");
            int carAge = myScanner.nextInt();          //Numerical input
        }else {
            System.out.println("Go to work you lazy ass and get a car");
        }
    }
}
