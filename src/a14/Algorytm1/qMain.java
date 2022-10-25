package a14.Algorytm1;

public class qMain {
    public static void main() {

        int[] myNumbers = {1, 2, 3, 4, 5};
        int[] myNumbersInverted = new int[myNumbers.length];

        for (int i=0, j=myNumbers.length-1 ; i<myNumbers.length ; i++, j--){
            myNumbersInverted[j] = myNumbers[i];
        }

        for( int i : myNumbersInverted){
            System.out.print(i + " ");
        }
    }
}


