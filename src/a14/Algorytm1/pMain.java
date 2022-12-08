package a14.Algorytm1;
public class pMain {
    static int size;
    public static void main(){

        int level = 10;                 //RZAD = nasze "N"
        size = level * 2;
        char[][] wiatrak = new char[size][size];

        for (int i=0 ; i<size ; i++){
            for (int j=0 ; j<size ; j++){
                wiatrak[i][j] = '?';
            }
        }

        for(int i=0 ; i<level-1 ; i++){
            int firstDot = i;
            int first_X = level - i;
            int secondDot = level-1-i;
            int second_X = i + 1;
            wypelnijWierszGora(firstDot, first_X, secondDot, second_X, wiatrak[i]);
        }

        {
            int firstDot = level - 1;
            int first_X = 2;
            int second_X = level - 1;
            wypelnijWierszGora(firstDot, first_X, 0, second_X, wiatrak[level-1]);
        }
        {
            int first_X = level-1;
            int second_X = 2;
            int secondDot = level-1;
            wypelnijWierszDol(first_X, 0, second_X, secondDot, wiatrak[level]);
        }

        for(int i=0 ; i<level-1 ; i++){
            int first_X = level-1-i;
            int firstDot = i + 1;
            int second_X = i + 2;
            int secondDot = level-2-i;
            wypelnijWierszDol(first_X, firstDot, second_X, secondDot, wiatrak[level+1+i]);
        }

        for (char[] wiersz : wiatrak){
            for (char element : wiersz){
                System.out.print(element);
            }
            System.out.println();
        }
    }
    private static char[] wypelnijWierszGora(int firstDot, int first_X, int secondDot, int second_X, char[] wiersz){
        for(int j = 0; j < size ; j++){
            if(firstDot > 0){
                wiersz[j] = '.';
                firstDot --;
            }else if (first_X > 0){
                wiersz[j] = 'X';
                first_X --;
            }
            else if (secondDot > 0){
                wiersz[j] = '.';
                secondDot --;
            }
            else if (second_X > 0){
                wiersz[j] = 'X';
                second_X --;
            }
        }
        return wiersz;
    }
    private static char[] wypelnijWierszDol(int first_X, int firstDot, int second_X, int secondDot, char[] wiersz){
        for(int j = 0; j < size ; j++){
            if(first_X > 0){
                wiersz[j] = 'X';
                first_X--;
            }else if (firstDot > 0){
                wiersz[j] = '.';
                firstDot --;
            }
            else if (second_X > 0){
                wiersz[j] = 'X';
                second_X --;
            }
            else if (secondDot > 0){
                wiersz[j] = '.';
                secondDot --;
            }
        }
        return wiersz;
    }
}
