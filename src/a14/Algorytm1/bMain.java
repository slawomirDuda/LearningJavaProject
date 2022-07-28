//https://pl.spoj.com/problems/FLAMASTE/

package a14.Algorytm1;

public class bMain {
    public static void main(){
        String myString = "ABBCCCDDDDEEEEEFGGHIIJKKKL";    //A1    B2    C3   D4   E5   F1    G2   H1    I2   J1 K3 L1

        int counter = 0;               // 1
        Character currentChar = null; // L
        //loopChar                    // L

        for(char loopChar : myString.toCharArray()){
//            System.out.println(loopChar); //todo 1STEP separate
            if(currentChar == null){
                currentChar = loopChar;
                counter = 1;
            }else if(currentChar == loopChar){
                counter++;
            }else if(currentChar != loopChar){
                //save currentChar & counter
                currentChar = loopChar;
                counter = 1;
            }
        }
        //save currentChar & counter
    }
}
