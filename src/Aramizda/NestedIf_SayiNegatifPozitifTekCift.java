package Aramizda;

import java.util.Scanner;

public class NestedIf_SayiNegatifPozitifTekCift {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin sayi
        // tek ise ( negatif veya pozitif tek sayi
                    //oldugunu yazdirin,)
        // sayi cift (sayi ise 10’un tam kati olup olmadigini
                    //yazdirin.)


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen pozitif veya negatif bir tamsayi giriniz : ");
        int sayi= scanner.nextInt();

        if (sayi%2==0){ // cift sayi

            if (sayi%10==0){
                System.out.println("Girdiginiz sayi 10'un tam katidir");

            }else {
                System.out.println("Girdiginiz sayi 10'un tam kati degildir");
            }


        }else { //sayi tek

            if (sayi<0){
                //tek sayi sifirdan kücükse
                System.out.println("Girdiginiz sayi Negatif bir tek sayidir");
            }else {
                System.out.println("Girdiginiz sayi Pozitif bir tek sayidir");
            }

        }



    }
}
