package a15.Algorytm2powtorka;

import java.util.Arrays;
import java.util.Objects;

public class bMain {

    public static void main() {

        String wyraz = "WWWWWWPIERRRRDOOLLLLE";
        String[] wyrazSplitted = wyraz.split("");
        int counter = 1;

        for (int i = 0; i < wyrazSplitted.length; i++) {

            if (i != wyrazSplitted.length - 1) {

                if (Objects.equals(wyrazSplitted[i], wyrazSplitted[i + 1])) {
                    counter++;
                }
                else {

                    if (counter != 1) {
                        System.out.print(wyrazSplitted[i] + counter);
                    }
                    else {
                        System.out.print(wyrazSplitted[i]);
                    }
                    counter = 1;

                }
            }
            else {
                System.out.println(wyrazSplitted[i]);
            }
        }
    }
}
