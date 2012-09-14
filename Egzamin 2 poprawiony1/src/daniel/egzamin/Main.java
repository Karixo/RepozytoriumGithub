package daniel.egzamin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
        System.out.println("Liczba zapisana w pierwszej tablicy to: "+podanaLiczba);

        System.out.println("Podaj liczbę calkowita: ");
        Scanner strumienWejsciowyy = new Scanner(System.in);

        while (!strumienWejsciowyy.hasNextInt()) {
            if(strumienWejsciowyy.next().equals("exit")) break;
            System.out.println("To nie jest liczba calkowita");
            System.out.println();

        }

        int podanaLiczba1 = strumienWejsciowyy.nextInt();
        int tablica[] = new int[1];
        tablica[0] = podanaLiczba1;
        System.out.println("Liczba zapisana w drugiej tablicy to: " +podanaLiczba1);

    }

}