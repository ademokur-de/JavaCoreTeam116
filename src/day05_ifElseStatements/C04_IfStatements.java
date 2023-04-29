package day05_ifElseStatements;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen pozitif bir tamsayi giriniz:");

        int girilenSayi = scanner.nextInt();
        int sayac=0;
        if (girilenSayi %2==0) sayac++;
        if (girilenSayi %3==0) sayac++;
        if (girilenSayi %5==0) sayac++;
        if (girilenSayi %7==0) sayac++;
        if (girilenSayi %11==0) sayac++;
        if (girilenSayi %23==0) sayac++;
        System.out.println("Girdiginiz sayi 2,3,5,7,11,23 sayilarindan  " + sayac + "  tanesine tam bölünebilir");


    }
}
