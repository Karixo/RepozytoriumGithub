package daniel.egzamin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for(int i=0; i<2; i++){
        System.out.println("Podaj liczbę calkowita: ");

        Scanner strumienWejsciowy = new Scanner(System.in);

        while (!strumienWejsciowy.hasNextInt()) {

            if(strumienWejsciowy.next().equals("exit")) break;

            System.out.println("To nie jest liczba calkowita");

            System.out.println();
            /*
           spróbuj napisać program który będzie pobierał liczby z klawiatury i zapisywał
           je do tablicy odnośnie pobierania wartości z klawiatury wykorzystaj kod który ja napisałem i ci wysłałem
            */
        }

        int podanaLiczba = strumienWejsciowy.nextInt();

        int tab[] = new int[1];
        tab[0] = podanaLiczba;
        System.out.println("Liczba zapisana w tablicy to: "+podanaLiczba);
        }
    }

}