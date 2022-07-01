package a1.LoopsObjectsGetterSetter;

import java.util.Scanner;

public class aMain {

    public static void main() {
        Car myCar = new Car(750, "Honda", false);
        Car myCar2 = new Car();
        myCar2.hp = 7580;
        myCar2.isLpg = true;
        myCar2.name = "zapierdalacz2";

        Person person1 = new Person("Slawek","Duda",29,true);

        Person person2 = new Person();
        person2.name = "Slawek";
        person2.surname = "Duda";
        person2.age = 29;
        person2.setHetero(false);

//        person1.printMe();
        person2.printMe();

        PersonBMI slawek = new PersonBMI(170,67);
        PersonBMI kamil = new PersonBMI(180,99);

        System.out.println(slawek.getBMI());
        slawek.setHeight(1900);
        System.out.println(slawek.getBMI());




        Scanner myscanner = new Scanner(System.in);

        System.out.println("Enter height");
        int userHeight = Integer.parseInt(myscanner.nextLine());

        System.out.println("Enter weight");
        int userWeight = Integer.parseInt(myscanner.nextLine());

        PersonBMI yourBMI = new PersonBMI(userHeight,userWeight);


        System.out.println("Your BMI is: " + yourBMI.getBMI());

        System.out.println("Display advice? Yes/No");
        String userChoice = myscanner.nextLine();
        if(userChoice.contains("Yes")){
            if (yourBMI.getBMI()>=2){
                System.out.println("GRATULACJE");
            } else{
                System.out.println("IDZ POCWICZYC");
            }
        }
    }

}
