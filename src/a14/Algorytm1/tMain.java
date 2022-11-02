package a14.Algorytm1;

public class tMain {
    public static void main(){
        int[] zbior = {1,2,3,4,5,6};
        //2,3,4,5,6,1
        int[] zbiorPrzesuniety = new int[zbior.length];
        int przesuniecie = 2;

        for(int i=0, j=0 ; j<= zbior.length-1 ; i++, j++){
            if(i>=przesuniecie){
                zbiorPrzesuniety[j] = zbior[i - przesuniecie];
            }else{
                zbiorPrzesuniety[j] = zbior[i + zbior.length - przesuniecie];
            }
        }

        for (int i : zbiorPrzesuniety){
            System.out.print(i + " ");
        }
    }
}
