package a14.Algorytm1;

public class sMain {
    public static void main(){
        char[] myString1 = {'1','2','3','4','5','6','7'};
        char[] myString2 = {'A','B','C','D','E','F','G'};

        char[] myStringSolved;

        if (myString1.length> myString2.length){
            myStringSolved = new char[myString2.length*2];
        } else {
            myStringSolved = new char[myString1.length*2];
        }

        for(int i=0, j=0; j< myStringSolved.length-1 ; i++, j+=2){
            myStringSolved[j] = myString1[i];
            myStringSolved[j+1] = myString2[i];
        }

        for( char i : myStringSolved){
            System.out.print(i + " ");
        }
    }
}
