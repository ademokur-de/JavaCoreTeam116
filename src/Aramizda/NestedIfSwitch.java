package Aramizda;

import java.util.Scanner;

public class NestedIfSwitch {

    public static void main(String[] args) {
        /*
            Kullanicidan "Insan" mi yoksa "Mal" mi tasimak istedigini ve
            miktarini(insan: adet / Yük : Kg) alin
            Insan tasimak istiyorsa 5 e kadar "Size Otomobil gerekli" yazdirin
            45'e kadar "Size Otobus gerekli" yazdirin
            Yük tasimak istiyorsa 2000 kg a kadar "Size Kamyonet gerekli" yazdirin
            20000kg'a kadar "Size Kamyon gerekli" yazdirin
            0' altinda ve belirtilen miktarlarin üstünde "Hatali deger" yazdirin


         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen ne tasimak istediginizi girin : \n" +
                "(Yolcu icin ; Y ve Nakliye icin :N girin )");
        char tasimaTuru=scanner.next().toUpperCase().charAt(0);

        int tasinacakKisiAdedi;
        int yukMiktari;
        int arabaTuru=0;
        int kamyonTuru=0;

        if (tasimaTuru=='Y'){

            System.out.println("Tasinacak kisi sayisi(max.45) :");
            tasinacakKisiAdedi=scanner.nextInt();

            if (tasinacakKisiAdedi<=0||tasinacakKisiAdedi>45){
                System.out.println("Hatali Giris");
            } else if (tasinacakKisiAdedi<=5) {
                arabaTuru=1; // Otomobil gerekli

            } else if (tasinacakKisiAdedi<=20) {
                arabaTuru=2; // Minibus gerekli

            } else {
                arabaTuru=3; // Otobus gerekli
            }

        } else if (tasimaTuru=='N') {

            System.out.println("Tasinacak Yük miktari(kg olarak ve max.20000kg):");
            yukMiktari= scanner.nextInt();

            if (yukMiktari<=0||yukMiktari>20000){
                System.out.println("Hatali Giris");

            } else if (yukMiktari<=2000) {
                kamyonTuru=1; // Kamyonet gerekli

            }else if (yukMiktari<=10000){
                kamyonTuru=2; // Kamyon gerekli

            }else {
                kamyonTuru=3; // TIR gerekli

            }

        }else {
            System.out.println("Hatali giris");
        }

        switch (arabaTuru){
            case 1 :
                System.out.println("Otomobil");
                break;
            case 2 :
                System.out.println("Minibus");
                break;
            case 3 :
                System.out.println("Otobus");
                break;
        }
        switch (kamyonTuru){
            case 1 :
                System.out.println("Kamyonet");
                break;
            case 2 :
                System.out.println("Kamyon");
                break;
            case 3 :
                System.out.println("TIR");
                break;
        }
    }
}
