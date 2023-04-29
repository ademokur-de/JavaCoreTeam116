package day10_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C09_FaktoryelDegeriYazdirma {
    public static void faktoryel(int sayi){

        int faktoryel=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryel *= i;
        }
        System.out.println(sayi+"! = "+faktoryel);

    }
    public static void main(String[] args) {
        // verdigimiz bir sayinin faktoryel degerini yazdirian
        // bir method olusturun
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen Faktöriyelini istediginiz sayiyi giriniz: ");
        int sayi = scanner.nextInt();
        faktoryel(sayi);
    }



}
