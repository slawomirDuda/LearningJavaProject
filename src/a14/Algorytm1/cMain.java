package a14.Algorytm1;

import java.util.Arrays;

public class cMain {
    public static void main(){

        //DRUKOWANIE OD KONCA
        int[] myNumbers = {567, 44, 343, 24, 7};
        int[] myNumbersInverted = new int[5];

//        System.out.println(myNumbers.length);
//        System.out.println(myNumbers[myNumbers.length - 1]);

        int j = 0;
        int i;   // 4
        //myNumbers.length   //5

        for (i = myNumbers.length - 1; i >=0 ; i--, j++) {
            myNumbersInverted[j] = myNumbers[i];


        }

        for(int myInt : myNumbersInverted){
            System.out.println(myInt);
        }






    }
}
