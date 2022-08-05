package a14.Algorytm1;

import java.util.Arrays;

public class cMain {
    public static void main(){

        //DRUKOWANIE OD KONCA
        int[] myNumbers = {1, 2, 3, 4, 5};
        int[] myNumbersInverted = new int[myNumbers.length];

//        System.out.println(myNumbers.length);
//        System.out.println(myNumbers[myNumbers.length - 1]);


        // i = 4, i = 3, i = 2, i = 1, i = 0
        // j = 0, j = 1, j = 2, j = 3, j = 4
        //myNumbers.length = 5

        for (
                int i = myNumbers.length - 1, j = 0;
                i >=0 ;
                i--, j++
        ) {
            myNumbersInverted[j] = myNumbers[i];
//         1.   myNumbersInverted[0] = myNumbers[4];
//          myNumbersInverted[] = [5]
//         2.   myNumbersInverted[1] = myNumbers[3];
//          myNumbersInverted[] = [5,4]
//         3.   myNumbersInverted[2] = myNumbers[2];
//          myNumbersInverted[] = [5,4,3]
//         4.   myNumbersInverted[3] = myNumbers[1];
//          myNumbersInverted[] = [5,4,3,2]
//         5.   myNumbersInverted[4] = myNumbers[0];
//          myNumbersInverted[] = [5,4,3,2,1]



        }

        for(int myInt : myNumbersInverted){
            System.out.println(myInt);
        }






    }
}
