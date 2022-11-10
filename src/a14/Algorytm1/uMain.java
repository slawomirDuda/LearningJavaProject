package a14.Algorytm1;
//https://pl.spoj.com/problems/SKARBFI/fbclid=IwAR0XzfrPyywyFk8MyGgYzZF66hbz2rUkMCbhpsYCO8wRub_x_SmNNl2c-Bo
//        SKARBFINDER - bez patrzenia w //todo H-MAIN

public class uMain {
    public static void main(){
//        int[] instrukcje = {0,1,2,1,1,1,3,1};  //todo STUDNIA
//        int[] instrukcje = {1,1,0,2,3,1};     //todo 1-przyklad (0,1,3,1)
        int[] instrukcje = {1,5,0,2,3,1,2,4};  //losowe
        int kierunekPP;
        int kierunekWZ;
        int sumaKrokowPP = 0;
        int sumaKrokowWZ = 0;
        String kierunekStringPP = "";
        String kierunekStringWZ = "";
//        int[] wynikKoncowy = {kierunekPP,sumaKrokowPP,kierunekWZ,sumaKrokowWZ};

        for(int i=0; i<instrukcje.length-1; i+=2){
            if(instrukcje[i]==0){
                sumaKrokowPP = sumaKrokowPP + instrukcje[i+1];
            }else if (instrukcje[i]==1){
                sumaKrokowPP = sumaKrokowPP - instrukcje[i+1];
            }else if (instrukcje[i]==2){
                sumaKrokowWZ = sumaKrokowWZ - instrukcje[i+1];
            }else {
                sumaKrokowWZ = sumaKrokowWZ + instrukcje[i+1];
            }
        }

        if(sumaKrokowPP>0){
            kierunekPP = 0;
        }else {
            sumaKrokowPP = -sumaKrokowPP;
            kierunekPP = 1;
        }

        if(sumaKrokowWZ>0){
            kierunekWZ = 3;
        }else {
            sumaKrokowWZ= -sumaKrokowWZ;
            kierunekWZ = 2;
        }

        if (kierunekPP == 0){
            kierunekStringPP = "POLNOC";
        }
        if (kierunekPP == 1){
            kierunekStringPP = "POLUDNIE";
        }
        if (kierunekWZ == 2){
            kierunekStringWZ = "ZACHOD";
        }
        if (kierunekWZ == 3){
            kierunekStringWZ = "WSCHOD";
        }

        if (sumaKrokowPP==0 & sumaKrokowWZ==0){
            System.out.println("STUDNIA");
        }else{
            System.out.print(kierunekStringPP + "- ");
            System.out.println(sumaKrokowPP);
            System.out.print(kierunekStringWZ + "- ");
            System.out.println(sumaKrokowWZ);
        }




//        for (int i : wynikKoncowy){
//            System.out.print(i + " ");
//        }



    }
}

