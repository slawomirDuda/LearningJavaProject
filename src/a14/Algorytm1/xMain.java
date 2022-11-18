package a14.Algorytm1;
//https://pl.spoj.com/problems/FZI_STEF/fbclid=IwAR2W3TljeEtsqK8YHLHrRwDxSKp2Fph-pSXGJJWFlnV6k10DRUeBDtMQUps
//STEFAN - bez patrzenia

public class xMain {
    public static void main(){

        int[] trasa = {1,-2,4,5,-8,3,4,1,1,1,-10,1,1,-4,1,1,1};
        int suma = 9;
        int sumaReszty = 0;


        for (int i = 0; i< trasa.length; i++){
            if(suma < suma + trasa[i]){
                suma = suma + trasa[i];
            }
            else{
                if(i != trasa.length-1){
                    if(-trasa[i]>suma){
                        suma = 0;
                    }else if(-trasa[i]<trasa[i+1]){
                        suma = suma + trasa[i];
                    }
                }
//                for(int j = i+1 ; j< trasa.length; j++){
//                    sumaReszty = sumaReszty + trasa[j];
//                }
//
//                if(i < trasa.length/2){
//
//                    if(-trasa[i]>suma){
//                        suma = 0;
//                    }else if(-trasa[i]<sumaReszty){
//                        suma = suma + trasa[i];
//                    }
//                }
//                else if (i > trasa.length/2){
//
//                    if(-trasa[i]>suma){
//                        suma = 0;
//                    }else if(-trasa[i]<sumaReszty){
//                        suma = suma + trasa[i];
//                    }
//                }
//                else{//(i == trasa.length/2)
//
//                    if(-trasa[i]>suma){
//                        suma = 0;
//                    }else if(-trasa[i]<sumaReszty){
//                        suma = suma + trasa[i];
//                    }
//                }
//                System.out.println(sumaReszty);
            }
        }
        System.out.println(suma);
    }
}
