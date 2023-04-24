package a15.Algorytm2powtorka;
//https://pl.spoj.com/problems/PRIME_T/
public class aMain {

    public static void main() {

        int[] myNumbers = {11,1,4};
        float myFloat = 0;

        for ( int i : myNumbers) {
            if( i / 2 != myFloat) {
                System.out.println("NIE");
            } else {
                System.out.println("TAK");
            }
        }
    }
}
