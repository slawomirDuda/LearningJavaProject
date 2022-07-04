package a10.WrapperClasses;

public class aMain {

    public static void main() {
        Integer myInt = 5;
        Integer myInt2 = 6;
        Integer myInt3 = myInt.intValue() + myInt2.intValue();  //poprawny zapis
//        int myInt3 = myInt + myInt2;  //tez bedzie dzialac bo java madra, ale wiadomo
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(myInt.intValue());
        System.out.println(myInt2.intValue());
        System.out.println(myInt3.intValue());
//        System.out.println(myInt3);   // to tez bedzie dzialac
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        System.out.println();

        //toString() method uzywamy do zmiany opakowanego obiektu w string
        Integer myInt4 = 100;
        String myString = myInt4.toString();
        System.out.println(myString.length());
    }
}
