package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_Scanner_Adm_ornek {
    public static void main(String[] args) {

        // iki sayi iste toplamini ve carpimlarini yazdir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ondalikli bir sayi giriniz : ");
        double ondalikliSayi1 = scanner.nextDouble();

        System.out.println("Lutfen bir tam sayi giriniz : ");
        int tamSayi2 = scanner.nextInt();

        System.out.println("Sayilarin Toplami  : " + (ondalikliSayi1+tamSayi2));
        System.out.println("Sayilarin carpimi : " + (ondalikliSayi1*tamSayi2));
    }
}
