package a6.Scanner;

import java.util.Scanner;

public class aMain {
    public static void main() {

       //todo SIMPLE EXAMPLE:
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // String input
        String name = myObj.nextLine();

        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);



        //todo MOJE NIESKONCZONE:
//        Scanner myObj = new Scanner(System.in); // Create a Scanner object
//
//
//        System.out.println("Enter name:");
//        String name = myObj.nextLine();        // String input
//        if(name.contains("Kamil")){
//            System.out.println("Awww, what a beautiful name :)");
//        } else if (name.contains("Slawek")) {
//            System.out.println("You have best name on earth");
//        } else{
//            System.out.println("Ugly name, best names are 'Slawek' and 'Kamil'");
//        }
//
//        System.out.println("Do you have job?");
//        String job = myObj.nextLine();
//
//        System.out.println("Ok, so tell me: how big is your salary?");
//        double salary = myObj.nextDouble();    // Numerical input
//
//
//
//        Scanner myObj2 = new Scanner(System.in);  //todo DLACZEGO MUSIALEM ZROBIC myObj2, inaczej nie działało!!!!
//
//        System.out.println("Ok, aaaand, do you have car?");
//        String car = myObj2.nextLine();         // String input
//        if(car.contains("Yes")) {
//            System.out.println("How old is your car?:");
//            int carAge = myObj2.nextInt();          //Numerical input
//        }else {
//            System.out.println("Go to work you lazy ass and get a car");
//        }
    }
}
