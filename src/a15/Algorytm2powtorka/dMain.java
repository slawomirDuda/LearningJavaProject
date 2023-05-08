package a15.Algorytm2powtorka;
//https://pl.spoj.com/problems/RNO_DOD/
public class dMain {

    public static void main(){

        int[] liczby = {1,2,3,4,5};
        int wynik = 0;

        for (int i = 0 ; i< liczby.length ; i++) {

            if (i==0) {
                wynik = liczby[i];
            }
            else {
                wynik = wynik + liczby[i];
            }
        }

        System.out.println("WYNIK TO:");
        System.out.println(wynik);
    }
}
