/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 29.08.12
 * Time: 20:29
 * To change this template use File | Settings | File Templates.
 */
public class program {
    public static void main(String[] args){
        int a=10;
        int b=99;

        if(a+b > 100){
            System.out.println("Suma tych dwóch liczb przekroczyła 100");
        }
        if(a-b<0){
            System.out.println("Różnica jest mniejsza od zera");
        }
        else{
            System.out.println("Różnica jest większa od zera");
        }
        if(b/a==1){
            System.out.println("Wynik jest równy jeden");
        }
        if(a*b > 1000){
            System.out.println("Iloraz zmiennych przekroczył 1000");
        }

    }

}
