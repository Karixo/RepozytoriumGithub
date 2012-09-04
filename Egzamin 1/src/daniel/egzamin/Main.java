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
        System.out.println("Liczba ktora podales to: "+podanaLiczba);
        boolean zmiennalogiczna = true;
//w zmiennej podanaLiczba znajduje sie wartosc calkowita ktora wpisales z klawiatury
//w tym miejscu musisz dopisac taki kod ktory bedzie korzystal z tej zmiennej
//i bedzie realizowal to co napisalem
        int zero = podanaLiczba;
        float zmiennazmiennoprzecinkowa = podanaLiczba;
        double zmiennazmiennoprzecinkowa2 = podanaLiczba;
        System.out.println("Zmienne arytmetyczne:");
        System.out.println("                zmienna typu byte: "+ (podanaLiczba - zero));
        System.out.println("                zmienna typu byte: "+(podanaLiczba - zero));
        System.out.println("                zmienna typu byte: "+(podanaLiczba - zero));
        System.out.println("                zmienna typu byte: "+(podanaLiczba - zero));
        System.out.println("Zmienne zmiennoprzecinkowe:");
        System.out.println("                zmienna typu float: "+(zmiennazmiennoprzecinkowa - zero));
        System.out.println("                zmienna typu double: "+(zmiennazmiennoprzecinkowa2 - zero));
        System.out.println("Zmienne znakowe:");
        System.out.println("                zmienna typu char: "+(podanaLiczba - zero));
        System.out.println("                zmienna typu String: "+(podanaLiczba - zero));
        System.out.println("Zmienne logiczne:");
        System.out.println("                zmienna typu Boolean: "+zmiennalogiczna);
        System.out.println("");
        System.out.println("------------------------------------------------");
        System.out.println("Zmienne arytmetyczne:");
        System.out.println("                zmienna typu byte: "+podanaLiczba);
        System.out.println("                zmienna typu byte: "+podanaLiczba);
        System.out.println("                zmienna typu byte: "+podanaLiczba);
        System.out.println("                zmienna typu byte: "+podanaLiczba);
        System.out.println("Zmienne zmiennoprzecinkowe:");
        System.out.println("                zmienna typu float: "+zmiennazmiennoprzecinkowa);
        System.out.println("                zmienna typu double: "+zmiennazmiennoprzecinkowa2);
        System.out.println("Zmienne znakowe:");
        System.out.println("                zmienna typu char: "+podanaLiczba);
        System.out.println("                zmienna typu String: "+podanaLiczba);
        System.out.println("Zmienne logiczne:");
        System.out.println("                zmienna typu Boolean: "+zmiennalogiczna);


    }

}