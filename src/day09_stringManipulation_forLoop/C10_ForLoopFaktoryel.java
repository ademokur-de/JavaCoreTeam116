package day09_stringManipulation_forLoop;

import java.util.Scanner;

public class C10_ForLoopFaktoryel {
    public static void main(String[] args) {

//        // 5 faktoryel hesaplayiniz.
//
//        int sayi =5;
//        int toplam = 1;
//
//        for (int i = sayi; i >=1 ; i--) {
//
//            toplam=i*toplam;
//
//        }
//        System.out.println(toplam);
//
//        toplam =1;
//        // sonucu 5! = 5*4*3*2*1=120 seklinde yazdirin
//
//        String sonuc = sayi + " ! = ";
//
//        System.out.print(sonuc);
//
//        for (int i = sayi; i >=1 ; i--) {
//
//            toplam *= i;
//
//            if ((i!=1)){
//                System.out.print( i + " * ");
//
//            }else {
//
//                System.out.print("1 = ");
//            }
//            System.out.println(toplam);
//
//
//        }
//
//
//
// Hocanin Kodlari :
        // verilen bir sayinin faktoryel degerini bulun
        // 5 ! = 5 * 4 * 3 * 2 * 1 = 120
        int sayi = 10;
        int faktoryel=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryel *= i;
        }
        System.out.println(faktoryel);

        faktoryel=1;
        // sonucu 5 ! = 5 * 4 * 3 * 2 * 1 = 120  seklinde yazdirin
        String sonuc = sayi+" ! = ";
        System.out.print(sonuc);
        for (int i = sayi; i >=1 ; i--) {
            faktoryel *= i;
            if (i != 1){
                System.out.print(i+" * ");
            }else{
                System.out.print("1 = ");
            }
        }
        System.out.println(faktoryel);

    }
}
