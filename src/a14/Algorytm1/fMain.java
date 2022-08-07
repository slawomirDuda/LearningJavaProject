package a14.Algorytm1;
//https://pl.spoj.com/problems/GLUTTON/

import java.util.ArrayList;

public class fMain {
    public static void main(){

        int paczkaCiastek = 10;
        int time = 24*60*60;

        ArrayList<Integer> obzartuchy = new ArrayList<>();

        obzartuchy.add(3600);
        obzartuchy.add(1800);
//        obzartuchy.add(10101);

        int liczbaCiastekNaDobe = 0;

        for (int obzartuch : obzartuchy) {
//            liczbaCiastekNaDobe = liczbaCiastekNaDobe + time/obzartuch;
            liczbaCiastekNaDobe += time/obzartuch;
        }

        float iloscPaczek = (float)liczbaCiastekNaDobe/(float)paczkaCiastek;
        System.out.println((int)Math.ceil(iloscPaczek));



    }
}
