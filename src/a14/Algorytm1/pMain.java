package a14.Algorytm1;

public class pMain {
    public static void main(){

        int level = 5;                 //RZAD = nasze "N"
        int size = level * 2;
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

            for(int j = 0; j < size ; j++){
                if(firstDot > 0){
                    wiatrak[i][j] = '.';
                    firstDot --;
                }else if (first_X > 0){
                    wiatrak[i][j] = 'X';
                    first_X --;
                }
                else if (secondDot > 0){
                    wiatrak[i][j] = '.';
                    secondDot --;
                }
                else if (second_X > 0){
                    wiatrak[i][j] = 'X';
                    second_X --;
                }
            }
        }

        {
            int firstDot = level - 1;
            int first_X = 2;
            int second_X = level - 1;

            for (int j = 0; j < size; j++) {
                if (firstDot > 0) {
                    wiatrak[level - 1][j] = '.';
                    firstDot--;
                } else if (first_X > 0) {
                    wiatrak[level - 1][j] = 'X';
                    first_X--;
                } else if (second_X > 0) {
                    wiatrak[level - 1][j] = 'X';
                    second_X--;
                }
            }
        }

        {

            int first_X = level-1;
            int second_X = 2;
            int firstDot = level-1;

            for (int j = 0; j < size; j++) {
                if (first_X > 0){
                    wiatrak[level][j] = 'X';
                    first_X --;
                }  else if (second_X > 0){
                    wiatrak[level][j] = 'X';
                    second_X --;
                }
                else if (firstDot > 0){
                    wiatrak[level][j] = '.';
                    firstDot --;
                }

            }
        }

        for (char[] wiersz : wiatrak){
            for (char element : wiersz){
                System.out.print(element);
            }
            System.out.println();
        }
    }
}
