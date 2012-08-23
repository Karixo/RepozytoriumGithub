/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 15.08.12
 * Time: 12:22
 * To change this template use File | Settings | File Templates.
 */
public class Zmienne {
    public static void main(String[] args){
        int liczba1 = 7, liczba2 = 8, liczba3 = 12;
        int pojedynczazmienna = 1;
        // mozna deklarowac jedna zmienna w lini jak i wiele zmiennych lecz wiele zmiennych musi miec ten sam typ
        // mozna równierz jak widac ponizej zadeklarowac wartosc zmiennej później
        int przyklad;
        przyklad = 2;
        byte przyklad2, przyklad3 = 3;
        przyklad2 = 99;
        System.out.println(przyklad2 + przyklad3);
        // up@ wywołuje na ekran sumę wartości przykładów dwa i trzy
        // ponizszy kod wywołuję na ekran "napis" a obok niego wartosci zmiennej "przyklad"
        System.out.println("napis "+ przyklad);
        System.out.println("napis1 "+ przyklad +" napis2 "+ przyklad2);
        // mozna  wpisac po sobie kilka zmiennych ale musza byc czyms oddzielone w tym przypadku napisami
    }
}
