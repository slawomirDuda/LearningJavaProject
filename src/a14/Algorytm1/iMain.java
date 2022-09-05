package a14.Algorytm1;
//https://pl.spoj.com/problems/PTROL/

public class iMain {

    public static void main(){

        int[] zbior = {3,1,4,5,2};                                      //BASE
        int[] zbiorPrzesuniety =  new int[zbior.length];               //RESULT

        for (
                int i = 0;
                i < zbior.length;
                i++
        ) {
            if (i == 0){
                zbiorPrzesuniety[zbior.length - 1] = zbior[i];
            } else{
                zbiorPrzesuniety[i-1] = zbior[i];
            }
        }

        String resultString = "";

        for (int loopInt : zbiorPrzesuniety) {
            resultString = resultString + loopInt + ",";
        }

        System.out.println(resultString.substring(0,resultString.length()-1));
    }
}
