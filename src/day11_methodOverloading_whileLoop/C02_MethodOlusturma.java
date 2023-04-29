package day11_methodOverloading_whileLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_MethodOlusturma {
    public static void main(String[] args) {

        //  Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        //          Girilen sayinin pozitif tam bolenleri sayisini bulup
        //          bize donduren bir method olusturun.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz : ");
        int sayi =scanner.nextInt();

        System.out.println("toplam Bölen sayisi : " + pozitifBolenSayisiBul(sayi));

        // verilen sayinin asal olup olmadigini bu method'u kullanarak yazdiralim

        int ptbs=pozitifBolenSayisiBul(sayi);

        if (ptbs<=2){
            System.out.println("Verilen Sayi Asal");
        }else {
            System.out.println("Verilen sayi Asal degil!");
        }


    }

    public static int pozitifBolenSayisiBul(int sayi){
        List<Integer> bolenlerListesi =new ArrayList<>(); //ADM ekleme
        int sayac=0;

        for (int i = 1
             ; i <=sayi ; i++) {

            if(sayi%i==0){
                sayac++;
                bolenlerListesi.add(i); //ADM ekleme
            }
        }
        System.out.println(bolenlerListesi); // ADM ekleme
        return sayac;

    }



}
