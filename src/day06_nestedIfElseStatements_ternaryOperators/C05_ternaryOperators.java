package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C05_ternaryOperators {
    public static void main(String[] args) {

        int sayi = 14;

        // sayinin tek veya cift oldugunu yazdirin

        if (sayi %2==0){
            System.out.println("Verilen sayi cift sayidir");
        }else {
            System.out.println("Verilen sayi tek sayidir");
        }

        // ternary Operatorleri basit if-else cumlelerini daha kisa yazdirmak icin kullanilir.

        System.out.println(sayi % 2 == 0 ? "Verilen sayi cift sayidir" : "Verilen sayi tek sayidir");
    }
}
