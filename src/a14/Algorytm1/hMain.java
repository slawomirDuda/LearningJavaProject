package a14.Algorytm1;

import java.util.ArrayList;

public class hMain {

    public static void main(){

        ArrayList<Krok> kroksy = new ArrayList<Krok>();
        kroksy.add(new Krok(0,1));
        kroksy.add(new Krok(0,2));
        kroksy.add(new Krok(0,0));
        kroksy.add(new Krok(0,0));

        int vertical = 0;
        int horizontal = 0;

        for (Krok pojedynczyKrok : kroksy) {

            if (pojedynczyKrok.kierunek == 0){
                vertical = vertical + pojedynczyKrok.liczbaKrokow;
            }
            else if (pojedynczyKrok.kierunek == 1){
                vertical = vertical - pojedynczyKrok.liczbaKrokow;
            }
            else if (pojedynczyKrok.kierunek == 2){
                horizontal = horizontal - pojedynczyKrok.liczbaKrokow;
            }
            else if (pojedynczyKrok.kierunek == 3){
                horizontal = horizontal + pojedynczyKrok.liczbaKrokow;
            }

        }
        if (vertical == 0 && horizontal == 0){
            System.out.println("STUDNIA");
        } else if (vertical != 0 && horizontal != 0){

            if (horizontal > 0 ){
                System.out.println("3" + "," + horizontal);
            } else {
                System.out.println("2" + "," + Math.abs(horizontal) );
            }
            //ODDZIELNIE!!!
            if (vertical > 0 ){
                System.out.println("0" + "," + vertical);
            } else {
                System.out.println("1" + "," + Math.abs(vertical));
            }

        } else if (horizontal != 0){
            if (horizontal > 0 ){
                System.out.println("3" + "," + horizontal);
            } else {
                System.out.println("2" + "," + Math.abs(horizontal) );
            }
        } else { //(vertical != 0)
            if (vertical > 0 ){
                System.out.println("0" + "," + vertical);
            } else {
                System.out.println("1" + "," + Math.abs(vertical));
            }
        }

    }

    static class Krok{
        int kierunek;
        int liczbaKrokow;

        public Krok(int kierunek, int liczbaKrokow) {
            this.kierunek = kierunek;
            this.liczbaKrokow = liczbaKrokow;
        }
    }
}
