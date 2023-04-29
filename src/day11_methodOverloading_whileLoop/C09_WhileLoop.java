package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {

        // kullanicindan toplanmak üzere pozitif tamsayilar isteyin
        // kullanici 0'a basana kadar isleme devam edin
        // kullanici sifira bastiginda
        // girdigi pozitif tamsayi adedini ve toplamini yazdirin
        // kullanici negatif sayi girerse uyari verin ve o sayiyi adet'e eklemeyin.

        Scanner scanner =new Scanner(System.in);

        int sayi=1; // 0'a basinca islem biteceginden 1 aldik
        int sayac=0;
        int toplam =0;

        while (sayi!=0){
            System.out.println("toplanmak icin bir sayi girin \n Bitirmek icin 0'a basin. ");
            sayi= scanner.nextInt();

            if (sayi>0){
                sayac++;
                toplam+=sayi;

            } else if (sayi<0) {
                System.out.println("Pozitif tamsayi girmelisiniz");


            }



        }
        System.out.println("Girdiginiz "+ sayac + " adet pozitif tamsayinin toplami : "+ toplam);

    }
}
