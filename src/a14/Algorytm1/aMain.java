package a14.Algorytm1;

public class aMain {
    public static void main(){
        String myString = "costam1 Kamil costam2";
        String myString2 = "costam1 Kamil costam2 Kamil costam3 Kamil costam4 Kamil";

        String searchString = "Kamil";

        if(myString.contains(searchString)){
            System.out.println("True");
            System.out.println(myString.indexOf(searchString));

            String[] array = myString.split(searchString);
            System.out.println();
            System.out.println(array[1]);
//            for(String word : array){
//                System.out.println(word);
////            }
            System.out.println();
        } else{
            System.out.println("False");
        }

        if(myString2.contains(searchString)){
            System.out.println("True");
            System.out.println(myString2.indexOf(searchString));

            int indexKamil = myString2.indexOf("Kamil");
            String word2 = myString2.substring(indexKamil);
            System.out.println();
            System.out.println(word2);

            System.out.println(myString2.substring(indexKamil + searchString.length()));


        } else{
            System.out.println("False");
        }
    }
}
