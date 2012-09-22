package daniel.egzamin;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        int tab[] = new int[5];
        int i;
        for (i = 0; i < 5; i++) {

            System.out.println("Podaj liczbę calkowita: ");
            Scanner strumienWejsciowy = new Scanner(System.in);

            while (!strumienWejsciowy.hasNextInt()) {

                if (strumienWejsciowy.next().equals("exit")) break;
                System.out.println("To nie jest liczba calkowita");
                System.out.println();

            }
            int podanaLiczba = strumienWejsciowy.nextInt();
            tab[i] = podanaLiczba;

        }
        System.out.println("Liczba zapisane w tablicy to: "+tab[0]+tab[1]+tab[2]+tab[3]+tab[4]);

    }

}