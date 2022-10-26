package a14.Algorytm1;

public class rMain {

    private static boolean isEven (int number){
        if (number % 2 == 0){
            return true;
        } else{
            return false;
        }

    }

    public static void main(){

        int[] tablica = {0,1,2,3,4,5,8};
        int suma = 0;

        for (int i=0 ; i<= tablica.length-1 ; i+=2){
            if(tablica.length % 2 == 0){
                suma = suma + tablica[i] * tablica[i+1];
            }else{
                if (i != tablica.length-1){
                    suma = suma + tablica[i] * tablica[i+1];
                }else{
                    suma = suma + tablica[i];
                }
            }
        }

        System.out.println(suma);

    }
}
