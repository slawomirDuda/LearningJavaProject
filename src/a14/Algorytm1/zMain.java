package a14.Algorytm1;
// WIATRACZKI https://pl.spoj.com/problems/FANGEN/
public class zMain {

    public static void main(){

        int level = 10;
        int size = level * 2;
        char[][] wiatrak = new char[size][size];

        for(int i = 0 ; i < level - 1 ; i++){
            for(int j = 0 ; j < level ; j++){                       // GORA LEWO
                if(j >= i){
                    wiatrak[i][j] = 'X';
                }else{
                    wiatrak[i][j] = '.';
                }
            }
            for(int j = level ; j < size ; j++){          // GORA PRAWO
                if(j >= size - 1 - i){
                    wiatrak[i][j] = 'X';
                }else{
                    wiatrak[i][j] = '.';
                }
            }
        }

        for(int i = level + 1 ; i < size ; i++){
            for(int j = 0 ; j < level ; j++){                       // DOL LEWO
                if(j < size - i){
                    wiatrak[i][j] = 'X';
                }else{
                    wiatrak[i][j] = '.';
                }
            }
            for(int j = level ; j < size ; j++){          // DOL PRAWO
                if(j <= i){
                    wiatrak[i][j] = 'X';
                }else{
                    wiatrak[i][j] = '.';
                }
            }
        }

        for(int i = level - 1 ; i <= level ; i++){                    // SRODEK
            for(int j = 0 ; j < size ; j++){
                if(i == level - 1){
                    if(j >= level -1){
                        wiatrak[i][j] = 'X';
                    }else{
                        wiatrak[i][j] = '.';
                    }
                }else{
                    if(j <= level){
                        wiatrak[i][j] = 'X';
                    }else{
                        wiatrak[i][j] = '.';
                    }
                }
            }
        }

        for (char[] wiersz : wiatrak){                              // WYPISANIE
            for (char element : wiersz){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
