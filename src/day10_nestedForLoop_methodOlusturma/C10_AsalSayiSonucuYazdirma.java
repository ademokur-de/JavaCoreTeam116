package day10_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C10_AsalSayiSonucuYazdirma {
    public static void main(String[] args) {

        //verilen sayinin asal sayi olup olmadigini yazdiran bir method olurturun

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Asal olup olmadigini ögrenmek icin bir sayi giriniz : ");
int sayi = scanner.nextInt();
        asalSayiYazdir(sayi);
    }

    public static void asalSayiYazdir(int sayi) {

        //int sayi =2;

        boolean asalMi = true;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
                break; //asal olmadigini bulunca loop tan cikmasi icin break yazdik!!
            }
        }
        if (asalMi) {
            System.out.println("Sayi asal");
        } else {
            System.out.println("Sayi asal degil");
        }
    }
}
