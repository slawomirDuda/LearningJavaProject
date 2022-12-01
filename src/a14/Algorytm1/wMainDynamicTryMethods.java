package a14.Algorytm1;

import java.util.Scanner;

public class wMainDynamicTryMethods {
    public static void stworzTabele(int iloscKolumn, int iloscWierszy) {
        Scanner myscanner = new Scanner(System.in);
        int counter = 1;
        int przesuniecie = 1;
        int[][] tabela = new int[iloscKolumn][iloscWierszy];
        int[][] tabelaPrzesunieta = new int[iloscKolumn][iloscWierszy];
        for (int i = 0; i < iloscKolumn; ++i) {
            for (int j = 0; j < iloscWierszy; ++j) {
                tabela[i][j] = counter;
                counter++;
                if(counter==10){
                    counter=0;
                }
            }
        }
        for (int i = 0; i < iloscKolumn; ++i) {
            for (int j = 0; j < iloscWierszy; ++j) {
                tabelaPrzesunieta[i][j] = tabela[i][j];
            }
        }
        System.out.println();
        System.out.println("Twoja tabela:");
        for (int[] x : tabela) {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }System.out.println();


        System.out.println("Obracamy (tak/nie)?");
        String userChoice = myscanner.nextLine();
        if(userChoice.contains("tak")){
            System.out.println();
            for (int i = 0; i < iloscKolumn; ++i) {
                for (int j = 0; j < iloscWierszy; ++j) {
                    if (i == 0) {
                        if(j == 0) {
                            tabelaPrzesunieta[i][j] = tabela[i+przesuniecie][j];
                        }else {
                            tabelaPrzesunieta[i][j] = tabela[i][j-przesuniecie];
                        }
                    } else if (i>0 && i< iloscKolumn - 1) {
                        if (j == 0) {
                            tabelaPrzesunieta[i][j] = tabela[i+przesuniecie][j];
                        } else if (j==iloscWierszy - 1){
                            tabelaPrzesunieta[i][j] = tabela[i-przesuniecie][j];
                        } else {
                            tabelaPrzesunieta[i][j] = tabela[i][j];
                        }
                    } else {
                        if (j != iloscWierszy - 1) {
                            tabelaPrzesunieta[i][j] = tabela[i][j+przesuniecie];
                        } else {
                            tabelaPrzesunieta[i][j] = tabela[i-przesuniecie][j];
                        }
                    }
                }
            }
            System.out.println("Po przesunieciu w prawo o: " + "'" + przesuniecie+"'");
            for (int[] x : tabelaPrzesunieta) {
                for (int y : x) {
                    System.out.print(y + " ");
                }
                System.out.println();
            }
        }else {
            System.out.println("NIE TO NIE");
            System.out.println("NAURA!!!");
        }
    }
}



