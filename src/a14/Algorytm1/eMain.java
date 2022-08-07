package a14.Algorytm1;
//https://pl.spoj.com/problems/PP0504B/


public class eMain {

    public static void main(){

        String myString1 = "1234567";
        String myString2 = "abcdef";

        char[] myString1Chars = myString1.toCharArray();
        char[] myString2Chars = myString2.toCharArray();
        char[] myStringSolvedChars;

        if (myString1Chars.length <= myString2Chars.length){
            myStringSolvedChars = new char[2 * myString1Chars.length];
        } else {
            myStringSolvedChars = new char[2 * myString2Chars.length];
        }

//        System.out.println(myStringSolvedChars.length);


        for (
                int i = 0, j = 0, k = 0;
                k <= myStringSolvedChars.length -1;
                i++, j++, k+=2
        ) {
            myStringSolvedChars[k] = myString1Chars[i];
            myStringSolvedChars[k+1] = myString2Chars[j];
        }

        myStringSolvedChars.toString();
        System.out.println(myStringSolvedChars);



    }
}
