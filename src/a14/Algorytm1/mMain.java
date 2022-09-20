package a14.Algorytm1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mMain {
    public static void main(){

        int[] ciagMain = {1,1,2,2,2,3,3,4,4,4,5,5,8,8,8};

        int rozmiar1= ciagMain.length;
        int rozmiar2= ciagMain.length;

        int[] ciag1 = new int[rozmiar1];
        int[] ciag2 = new int[rozmiar2];

        int[] ciagFinal = new int[ciagMain.length];

        System.out.println(ciagFinal[5]);

        int counter1 = 0;
        int counter2 = 0;
        int counterFinal = 0;

        boolean isCiag1 = true;

        for (int i=0 ; i<ciagMain.length ;){

            if (isCiag1){
               ciag1[counter1++] = ciagMain[i++];
               ciag1[counter1++] = ciagMain[i++];
            }else {
                ciag2[counter2++] = ciagMain[i++];
                ciag2[counter2++] = ciagMain[i++];
                ciag2[counter2++] = ciagMain[i++];
            }
            isCiag1 = !isCiag1;

        }

//        ciag1[0] = ciagMain[0];
//        ciag1[1] = ciagMain[1];
//
//        ciag2[0] = ciagMain[2];
//        ciag2[1] = ciagMain[3];
//
//        ciag1[2] = ciagMain[4];
//        ciag1[3] = ciagMain[5];
//
//        ciag2[2] = ciagMain[6];
//        ciag2[3] = ciagMain[7];

        for (int loopInt : ciag1){
            if (loopInt != 0){
                ciagFinal[counterFinal++] = loopInt;
            }
        }

        for (int loopInt : ciag2){
            if (loopInt != 0){
                ciagFinal[counterFinal++] = loopInt;
            }
        }

        for (int elementCiagu : ciagFinal){
            System.out.print(elementCiagu + " ");
        }









    }
}
