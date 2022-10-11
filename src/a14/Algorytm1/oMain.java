package a14.Algorytm1;
//https://pl.spoj.com/problems/PP0602B/

public class oMain {
    public static void main(){


        int iloscWierszy = 5;
        int iloscElementow = 5;

        char[][] tablica = {{'1','2','3','4','5'},{'6','7','8','9','0'},{'1','2','3','4','5'},{'6','7','8','9','0'},{'1','2','3','4','5'}};
        char[][] tablicaPrzesunieta = {{'x','x','x','x','x'},{'x','x','x','x','x'},{'x','x','x','x','x'},{'x','x','x','x','x'},{'x','x','x','x','x'}};

        for (int i=iloscElementow-1 ; i>0 ; i--){
            tablicaPrzesunieta[0][i-1]=tablica[0][i];
        }
        for (int i=0 ; i<iloscElementow-1 ; i++){
            tablicaPrzesunieta[iloscWierszy-1][i+1]=tablica[iloscWierszy-1][i];
        }
        for (int i=0 ; i<iloscWierszy-1 ; i++){
            tablicaPrzesunieta[i+1][0] = tablica[i][0];
        }
        for (int i=iloscWierszy-1 ; i>0 ; i--){
            tablicaPrzesunieta[i-1][iloscElementow-1]=tablica[i][iloscElementow-1];
        }
        for (int i=1 ; i<=iloscWierszy-2 ; i++){
            for (int j=1 ; j<=iloscElementow-2 ; j++){
                tablicaPrzesunieta[i][j]=tablica[i][j];
            }

        }

        for (char[] wiersz : tablicaPrzesunieta){
            for (char element : wiersz){
                System.out.print(element+" ");
            }
            System.out.println();
        }

        System.out.println();

        for (char[] wiersz : tablica){
            for (char element : wiersz){
                System.out.print(element+" ");
            }
            System.out.println();
        }


    }
}
