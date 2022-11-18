package a14.Algorytm1;
//https://pl.spoj.com/problems/PP0602A/ parzyste nieparzyste

public class vMain {
    public static void main(){

        int[] zbior = {1,2,3,5};
        int[] zbiorParzysty = new int[zbior.length/2];
        int[] zbiorNieParzysty = new int[zbior.length/2];

        for (int i=0, j=0, k=0 ; i< zbior.length ; i+=2, j++,k++){
            zbiorParzysty[k] = zbior[i];
            zbiorNieParzysty[j] = zbior[i+1];
        }

//        System.out.println("zbiorNieParzysty: " + zbiorNieParzysty);
//        System.out.println("zbiorParzysty: " + zbiorParzysty);
        for ( int i : zbiorNieParzysty){
            System.out.print(i + " ");
        }

        for ( int i : zbiorParzysty){
            System.out.print(i + " ");
        }
    }
}
