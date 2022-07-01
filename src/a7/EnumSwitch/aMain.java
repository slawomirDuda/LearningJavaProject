package a7.EnumSwitch;

import java.util.Scanner;

public class aMain {

    public static void main() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Choose Level:");
        System.out.println("1.LOW");
        System.out.println("2.MEDIUM");
        System.out.println("3.HIGH");

        Level myEnum = Level.LOW;
        String input = myScanner.nextLine();

        //        switch(input) {
//            if case "1":
//                myEnum = Level.LOW;
//                break;
//            case "2":
//                myEnum = Level.MEDIUM;
//                break;
//            case "3":
//                myEnum = Level.HIGH;
//                break;
//        }  //todo TO JEST TO SAMO WYZEJ I NIZEJ TYLKO ZA POMOCA 'SWITCHa' LUB 'IFELSA' ↑↓↑↓↑↓↑↓

        if(input.equals("1")){
            myEnum = Level.LOW;
        } else if (input.equals("2")) {
            myEnum = Level.MEDIUM;
        } else if (input.equals("3")){
            myEnum = Level.HIGH;
        }



        //ENUM JEST UZYWANY ZE SWTCHEM PRAWIE ZAWSZE ↓

        switch(myEnum) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
