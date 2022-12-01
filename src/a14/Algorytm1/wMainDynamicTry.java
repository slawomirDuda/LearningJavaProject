package a14.Algorytm1;
import java.util.Scanner;
//dodac try/catch, moze switch, PODZIELIC NA METODY?

public class wMainDynamicTry {
    public static void main(){

        System.out.println("TWORZENIE I OBRACANIE TABELI");
        System.out.println();

        System.out.println("Podaj ilosc Kolumn: ");
        Scanner myscanner = new Scanner(System.in);
        int iloscKolumn = Integer.parseInt(myscanner.nextLine());
        System.out.println("Podaj ilosc Wierszy: ");
        int iloscWierszy = Integer.parseInt(myscanner.nextLine());

        wMainDynamicTryMethods.stworzTabele(iloscKolumn,iloscWierszy);

    }
}
