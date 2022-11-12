package a14.Algorytm1;
//https://pl.spoj.com/problems/EUCGAME/fbclid=IwAR044zDVOOZACmALPRaqc8lD3QdG08MrrMnQj1Q4jsvbH_Tr35rXoFoS7vY
//GRA EUKLIDESA - bez patrzenia na //todo J-MAIN

public class vMain {
    public static void main(){
//        int graczA = 2;
//        int graczB = 4;
        int[] punkty = {2,4};
//        int[] wynik = new int[punkty.length-1];

        for (int i = 0; i<punkty.length-1 ; i++){
            if (punkty[i]>punkty[i+1]){
                punkty[i] = punkty[i] - punkty[i+1];
            }else if(punkty[i]<punkty[i+1]){
                punkty[i+1] = punkty[i+1] - punkty[1];
            }else{
               punkty[i] = punkty[i] + punkty[i+1];
            }
        }
//        for (int i : wynik){
//            System.out.print(i);
//        }
        for (int i : punkty){
            System.out.print(i);
        }


    }
}
