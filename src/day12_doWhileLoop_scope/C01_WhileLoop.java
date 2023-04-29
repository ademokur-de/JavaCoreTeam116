package day12_doWhileLoop_scope;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
            While Loop'ta kullanacagimiz variable'lara bastan deger atamamiz gerekir
            eger bu variable'lrara yanlis deger atamasi yaparsak
            while loop body'si hic calismayabilir

            Java bu dezaavantaji ortadan kaldirmak icin
            "do while loop" olusturmustur

            do-while-loop
            ilk kontrolü yapmadan kodu bir kez calistirir
            sonra kotrolü yapar.
         */

        //kullanicidan sayi degerleri alip toplayalim
        //kullanici 0Äa bastiginda islem bitsin
        // ve toplami yazdririn-

        Scanner scanner = new Scanner(System.in);
        int sayi=0;
        int toplam = 0;

        System.out.println("Lütfen toplamak icin bir sayi yazin\n bitirmek icin 0' a basin");
        sayi=scanner.nextInt();
        toplam +=sayi;

        while (sayi!=0){
            System.out.println("Lütfen toplamak icin bir sayi yazin\n bitirmek icin 0' a basin");
            sayi=scanner.nextInt();
            toplam+=sayi;
        }

        System.out.println("Girilen sayilarin toplami : "+ toplam);

    }
}
