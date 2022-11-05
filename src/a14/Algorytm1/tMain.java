package a14.Algorytm1;

public class tMain {
    public static void main(){

        int[] zbior = {1,2,3,4,5,6};
        int[] zbiorPrzesuniety = new int[zbior.length];
        int przesuniecie = -4;

        System.out.println("PRZED PRZESUNIECIEM:");
        for (int i : zbior){
            System.out.print(i + " ");
        }
        System.out.println();

        if(przesuniecie>0){
            for(int i=0, j=0 ; j<= zbior.length-1 ; i++, j++){
                if(i<przesuniecie){
                    zbiorPrzesuniety[j] = zbior[i + zbior.length - przesuniecie];
                }else{
                    zbiorPrzesuniety[j] = zbior[i - przesuniecie];
                }
            } System.out.println("PO PRZESUNIECIU W PRAWO O:"+" "+"'"+przesuniecie+"'");
            for (int i : zbiorPrzesuniety){
                System.out.print(i + " ");
            }
        }else{
            przesuniecie = przesuniecie*(-1);
            for(int i=0, j=0 ; j<= zbior.length-1 ; i++, j++){
                if(i<zbior.length-przesuniecie){
                    zbiorPrzesuniety[j] = zbior[i + przesuniecie];
                }else{
                    zbiorPrzesuniety[j] = zbior[i + przesuniecie - zbior.length];
                }
            } System.out.println("PO PRZESUNIECIU W LEWO O:"+" "+"'"+przesuniecie+"'");
            for (int i : zbiorPrzesuniety){
                System.out.print(i + " ");
            }
        }
    }
}

