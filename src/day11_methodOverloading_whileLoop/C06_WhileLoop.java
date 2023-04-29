package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayilar alin
        // toplam 500 olu veya gecerse deger almayi durdurup
        // kac sayi girildigini ve toplamin kac oldugunu yazdirin

        Scanner scanner=new Scanner(System.in);

        int sayac=0;
        int toplam=0;
        int sayi=0;

        while (toplam < 500){

            System.out.println("Toplanmak icin tam sayi giriniz : ");
            sayi = scanner.nextInt();
            sayac++;
            toplam += sayi;

        }

        System.out.println(sayac + " adet sayinin toplami : " + toplam);


    }
}
