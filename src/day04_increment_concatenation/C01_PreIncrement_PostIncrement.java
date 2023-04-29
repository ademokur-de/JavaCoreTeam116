package day04_increment_concatenation;

import java.util.Scanner;

public class C01_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        //kullanicaidan Tam sayi al
        // girilen sayiyi yazdir
        // sonra bir artirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz : ");
        int girilenSayi = scanner.nextInt();

        System.out.println("Girilen Sayi : " + girilenSayi);

        girilenSayi++;

        //kullanicaidan Tam sayi al
        // girilen sayiyi 1 artirin
        // sonra bir yazdirin

        System.out.println("Lütfen bir tamsayi daha giriniz : ");
        int girilenSayi2= scanner.nextInt();
        girilenSayi2++;
        System.out.println("Girilen Ikinci Sayi : " + girilenSayi2);

        System.out.println("Kodun sonunda GirilenSayi1 : " + girilenSayi + ", GirilenSayi2 : " + girilenSayi2);



    }
}
