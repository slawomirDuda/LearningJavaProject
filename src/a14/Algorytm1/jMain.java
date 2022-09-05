package a14.Algorytm1;
//https://pl.spoj.com/problems/EUCGAME/

public class jMain {
    public static void main(){

        int Player_A = 9;
        int Player_B = 6;

        while (Player_A != Player_B){
            if(Player_A < Player_B){
                Player_B = Player_B - Player_A;
            } else{
                Player_A = Player_A - Player_B;
            }
        }
        System.out.println(Player_A + Player_B);


    }
}
