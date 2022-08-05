//https://pl.spoj.com/problems/BFN1/
//PALINDROM
package a14.Algorytm1;

public class dMain {
    public static void main() {

        Integer number = 997;
        System.out.println(isPalindrom(number));
        System.out.println(addRegularPlusInverted(number));

        while (!isPalindrom(number)){
            number = addRegularPlusInverted(number);
        }
        System.out.println(number);

    }

    private static boolean isPalindrom(Integer number){
        String numberString = number.toString();
        char[] numberStringChars = numberString.toCharArray();
        char[] numberStringCharsInverted = new char[numberStringChars.length];
        for (
                int i = numberStringChars.length - 1, j = 0;
                i >= 0;
                i--, j++
        ) {
            numberStringCharsInverted[j] = numberStringChars[i];

        }
        String numberStringInverted = String.valueOf(numberStringCharsInverted);

//        for(char myChar : numberStringCharsInverted){
//            System.out.println(myChar);
//        }
//        System.out.println(String.valueOf(numberStringChars));
//        System.out.println(String.valueOf(numberStringCharsInverted));

        if (numberString.equals(numberStringInverted)){
            return true;
        } else{
            return false;
        }
    }

    private static Integer addRegularPlusInverted(Integer number){

        String numberString = number.toString();
        char[] numberStringChars = numberString.toCharArray();
        char[] numberStringCharsInverted = new char[numberStringChars.length];
        for (
                int i = numberStringChars.length - 1, j = 0;
                i >= 0;
                i--, j++
        ) {
            numberStringCharsInverted[j] = numberStringChars[i];

        }
        String numberStringInverted = String.valueOf(numberStringCharsInverted);
        Integer invertedNumber = Integer.parseInt(numberStringInverted);

        return number + invertedNumber;
    }

}
