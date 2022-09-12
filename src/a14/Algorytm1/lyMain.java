package a14.Algorytm1;

public class lyMain {

    public static void main(){

        int[] daneEnter = {42,42,12,13,42,11,42,43,42,42,99,1};
        Integer poprzednia = null;
        int counter = 0;

        for (int loopInt : daneEnter) {
            System.out.println(loopInt);
            if(loopInt == 42 && poprzednia != null && poprzednia != 42){
                counter++;
                if(counter == 3){
                    break;
                }
            }
            poprzednia = loopInt;
        }



    }
}
