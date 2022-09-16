package a14.Algorytm1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mMain {
    public static void main(){

        int[] ciag = {1,2,3,5};

        int rozmiarParzysty= (int)Math.floor(ciag.length / 2f);
        int rozmiarNieParzysty= (int)Math.ceil(ciag.length / 2f);

        int[] ciagParzysty = new int[rozmiarParzysty];
        int[] ciagNieParzysty = new int[rozmiarNieParzysty];

        int counterParzysty = 0;
        int counterNieparzysty = 0;

        for (int i=0 ; i<ciag.length ; i++){

            if (i % 2 == 0){
               ciagNieParzysty[counterNieparzysty++] = ciag[i];
            }else {
                ciagParzysty[counterParzysty++] = ciag[i];
            }

        }

        for (int loopInt : ciagParzysty){
            System.out.print(loopInt + " ");
        }
        for (int loopInt : ciagNieParzysty){
            System.out.print(loopInt + " ");
        }









    }
}
