package day12_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        /*
            Do While loop kontrol etmeden önce
            bir kere loop'u calistirir

            while loop'ta loop body'sinin calisma ihtimali VARDIR

            do while loop'da loop body'sinin calismama ihtimali YOKTUR


         */

        // kullanicidan sayi degerleri alip toplayalim
        // kullanici 0'a bastiginda islem bitsin
        // ve toplami yazdirsin

        Scanner scanner = new Scanner(System.in);
        int sayi =0;
        int toplam = 0;

        do {
            System.out.println("Lütfen toplamak icin bir sayi yazin\n bitirmek icin 0' a basin");
            sayi=scanner.nextInt();
            toplam +=sayi;
        }while (sayi!=0);

    }
}
