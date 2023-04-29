package Aramizda;

import java.util.Scanner;

public class NestedIf_YukInsanTasimaSoru {

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
                "(insan icin ; H ve Yük icin :Y girin )");
        char tasimaTuru=scanner.next().toUpperCase().charAt(0);
        int tasinacakKisiAdedi=0;
        int yukMiktari=0;

        if (tasimaTuru=='H'){ //Yolcu Tasiniyorsa

            System.out.println("Tasinacak kisi sayisi(max.45) :");
            tasinacakKisiAdedi=scanner.nextInt();

            if (tasinacakKisiAdedi<=0 || tasinacakKisiAdedi>45){ // Hatali giris
                System.out.println("Hatali Giris");

            } else if (tasinacakKisiAdedi<=5) {
                System.out.println("Size Otomobil gerekli");

            } else if (tasinacakKisiAdedi<=20) {
                System.out.println("Size Minibus gerekli");

            } else {
                System.out.println("Size Otobus gerekli");
            }

        } else if (tasimaTuru=='Y') {

            System.out.println("Tasinacak Yük miktari(kg olarak ve max.20000kg):");
            yukMiktari= scanner.nextInt();

            if (yukMiktari<=0||yukMiktari>20000){
                System.out.println("Hatali Giris");

            } else if (yukMiktari<=2000) {
                System.out.println("Size bir Kamyonet gerekli");
            }else {
                System.out.println("Size bir Kamyon gerekli");
            }

        }else {
            System.out.println("Hatali giris");
        }
    }
}
