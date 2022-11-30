package a14.Algorytm1;
//https://pl.spoj.com/problems/PP0602B/fbclid=IwAR3TXAAm_8uYawfjUkb9xEGpGoMbW1cRDT5erEutc6rlvC2uML3c0W5ZfbA
//TABELKI - bez patrzenia na //todo O-MAIN

import java.util.Arrays;

public class wMain {
    public static void main(){

        int[][] tabela = { {1,2,3,4,5,6}, {7,8,9,0,1,2}, {3,4,5,6,7,8}, {9,0,1,2,3,4} };
        int[][] tabelaPrzesunieta = { {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0} };
        int przesuniecie = 1;

        System.out.println("PRZED PRZESUNIECIEM:");
        for (int[] x : tabela)
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }System.out.println();

        if(przesuniecie>0){
            if(przesuniecie==1){
                for(int i = 0; i < tabelaPrzesunieta.length; ++i){
                    for(int j = 0; j < tabelaPrzesunieta[i].length; ++j){
                        if(i==0){
                            if(j==0){
                                tabelaPrzesunieta[i][j] = tabela[i+przesuniecie][j];
                            }else{
                                tabelaPrzesunieta[i][j] = tabela[i][j-przesuniecie];
                            }
                        }else if(i>0 && i< tabela.length-1){
                            if(j==0){
                                tabelaPrzesunieta[i][j] = tabela[i+przesuniecie][j];
                            }else if(j==tabela[i].length-1){
                                tabelaPrzesunieta[i][j] = tabela[i-przesuniecie][j];
                            }else{
                                tabelaPrzesunieta[i][j] = tabela[i][j];
                            }
                        }else{
                            if(j!=tabela[i].length-1){
                                tabelaPrzesunieta[i][j] = tabela[i][j+przesuniecie];
                            }else{
                                tabelaPrzesunieta[i][j] = tabela[i-przesuniecie][j];
                            }
                        }
                    }
                }

                System.out.println("PO PRZESUNIECIU W PRAWO O: " + "'" + przesuniecie+"'");
                for (int[] x : tabelaPrzesunieta)
                {
                    for (int y : x)
                    {
                        System.out.print(y + " ");
                    }
                    System.out.println();
                }
            }
        }

    }
}


