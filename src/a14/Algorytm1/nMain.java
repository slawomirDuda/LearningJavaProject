package a14.Algorytm1;

public class nMain {
    public static void main(){

        int[] tablica = {9,8,7,6,5,4,3,2,1,0};
        int przesuniecie = -1;
        int[] tablicaPrzesunieta = new int[tablica.length];

        for (int i=0, j=i+przesuniecie ; i<tablica.length ; i++, j=i+przesuniecie){

            if(przesuniecie<0){
                if(j<0){
                    tablicaPrzesunieta[tablica.length + j] = tablica[i];
                } else{
                    tablicaPrzesunieta[j] = tablica[i];
                }
            }else {
                if(j > tablica.length -1){
                    tablicaPrzesunieta[j - tablica.length] = tablica[i];
                } else{
                    tablicaPrzesunieta[j] = tablica[i];
                }
            }

        }
        for (int elementCiagu : tablicaPrzesunieta){
            System.out.print(elementCiagu + " ");
        }
    }
}


