package a14.Algorytm1;
import java.util.Scanner;
//dodac try/catch, moze switch, PODZIELIC NA METODY?, ZAPETLIC???
public class wMainDynamicTry {
    public static void main() {

        try {
            System.out.println();
            System.out.println("LALALA INTERAKTYWNE DYNAMICZNE TABELKI WIELOKROTNEGO OBRACANIA LALALA");
            System.out.println();
            System.out.println("'Tworzenie tabeli'");
            Scanner myscanner = new Scanner(System.in);
            System.out.println("Podaj ilosc Kolumn: ");
            int iloscKolumn = Integer.parseInt(myscanner.nextLine());
            System.out.println("Podaj ilosc Wierszy: ");
            int iloscWierszy = Integer.parseInt(myscanner.nextLine());

            int counter = 1;
            int przesuniecie = 1;
            int[][] tabela = new int[iloscKolumn][iloscWierszy];
            int[][] tabelaPrzesunieta = new int[iloscKolumn][iloscWierszy];
            for (int i = 0; i < iloscKolumn; ++i) {
                for (int j = 0; j < iloscWierszy; ++j) {
                    tabela[i][j] = counter;
                    counter++;
                    if (counter == 10) {
                        counter = 0;
                    }
                }
            }
            for (int i = 0; i < iloscKolumn; ++i) {
                for (int j = 0; j < iloscWierszy; ++j) {
                    tabelaPrzesunieta[i][j] = tabela[i][j];
                }
            }
            System.out.println();
            System.out.println("Twoja tabela:");
            for (int[] x : tabela) {
                for (int y : x) {
                    System.out.print(y + " ");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println("Obracamy? (tak/nie)");
            String userChoice = myscanner.nextLine();
            while (userChoice.contentEquals("tak")) {
                System.out.println();
                System.out.println("W ktora strone? (lewo/prawo)");
                userChoice = myscanner.nextLine();
                if (userChoice.contentEquals("prawo")) {
                    for (int i = 0; i < iloscKolumn; ++i) {
                        for (int j = 0; j < iloscWierszy; ++j) {
                            if (i == 0) {
                                if (j == 0) {
                                    tabelaPrzesunieta[i][j] = tabela[i + przesuniecie][j];
                                } else {
                                    tabelaPrzesunieta[i][j] = tabela[i][j - przesuniecie];
                                }
                            } else if (i > 0 && i < iloscKolumn - 1) {
                                if (j == 0) {
                                    tabelaPrzesunieta[i][j] = tabela[i + przesuniecie][j];
                                } else if (j == iloscWierszy - 1) {
                                    tabelaPrzesunieta[i][j] = tabela[i - przesuniecie][j];
                                } else {
                                    tabelaPrzesunieta[i][j] = tabela[i][j];
                                }
                            } else {
                                if (j != iloscWierszy - 1) {
                                    tabelaPrzesunieta[i][j] = tabela[i][j + przesuniecie];
                                } else {
                                    tabelaPrzesunieta[i][j] = tabela[i - przesuniecie][j];
                                }
                            }
                        }
                    }
                    System.out.println();
                    System.out.println("Po przesunieciu w prawo o: " + "'" + przesuniecie + "'");
                    for (int[] x : tabelaPrzesunieta) {
                        for (int y : x) {
                            System.out.print(y + " ");
                        }
                        System.out.println();
                    }
                } else if (userChoice.contentEquals("lewo")) {
                    for (int i = 0; i < iloscKolumn; ++i) {
                        for (int j = 0; j < iloscWierszy; ++j) {
                            if (i == 0) {
                                if (j == iloscWierszy - 1) {
                                    tabelaPrzesunieta[i][j] = tabela[i + przesuniecie][j];
                                } else {
                                    tabelaPrzesunieta[i][j] = tabela[i][j + przesuniecie];
                                }
                            } else if (i > 0 && i < iloscKolumn - 1) {
                                if (j == 0) {
                                    tabelaPrzesunieta[i][j] = tabela[i - przesuniecie][j];
                                } else if (j == iloscWierszy - 1) {
                                    tabelaPrzesunieta[i][j] = tabela[i + przesuniecie][j];
                                } else {
                                    tabelaPrzesunieta[i][j] = tabela[i][j];
                                }
                            } else {
                                if (j != 0) {
                                    tabelaPrzesunieta[i][j] = tabela[i][j - przesuniecie];
                                } else {
                                    tabelaPrzesunieta[i][j] = tabela[i - przesuniecie][j];
                                }
                            }
                        }
                    }
                    System.out.println();
                    System.out.println("Po przesunieciu w lewo o: " + "'" + przesuniecie + "'");
                    for (int[] x : tabelaPrzesunieta) {
                        for (int y : x) {
                            System.out.print(y + " ");
                        }
                        System.out.println();
                    }
                }else{
                    System.out.println();
                    System.out.println("WRONG INPUT. NAUCZ SIE PISAC");
                }
                for (int i = 0; i < iloscKolumn; ++i) {
                    for (int j = 0; j < iloscWierszy; ++j) {
                        tabela[i][j] = tabelaPrzesunieta[i][j];
                    }
                }
                System.out.println();
                System.out.println("Obracamy dalej? (tak/nie)");
                userChoice = myscanner.nextLine();
            }

            if (userChoice.contentEquals("nie")) {
                System.out.println();
                System.out.println("NIE TO NIE");
                System.out.println("NAURA!!!");
            } else {
                System.out.println();
                System.out.println("WRONG INPUT. NAUCZ SIE PISAC");
            }
        }catch (Exception e){
            System.out.println();
            System.out.println("WRONG INPUT !!! PODAJ WARTOSC LICZBOWA");
        }
    }
}
