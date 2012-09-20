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

        }

        int podanaLiczba = strumienWejsciowy.nextInt();
        int tab[] = new int[2];
        tab[0] = podanaLiczba;
        System.out.println("Liczba zapisana w pierwszej komórce tablicy to: "+podanaLiczba);

        System.out.println("Podaj liczbę calkowita: ");


        while (!strumienWejsciowy.hasNextInt()) {
            if(strumienWejsciowy.next().equals("exit")) break;
            System.out.println("To nie jest liczba calkowita");
            System.out.println();

        }

        int podanaLiczba1;
        podanaLiczba1 = strumienWejsciowy.nextInt();
        tab[1] = podanaLiczba1;
        System.out.println("Liczba zapisana w drugiej komórce tablicy to: " +podanaLiczba1);


    }

}