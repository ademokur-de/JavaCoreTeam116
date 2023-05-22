package Aramizda;

import java.util.Scanner;

public class Aramizda {

    public static void main(String[] args) {

        /*
 Sayisi(lenght) : 1 2 3 4 5 6 7 8 9
        Metin   : A l i   A k k u s
        index   : 0 1 2 3 4 5 6 7 8
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen birinci notunuzu giriniz : ");
        double sayi1= scanner.nextInt();
        System.out.println("Lütfen ikinci notunuzu giriniz : ");
        double sayi2=scanner.nextInt();

//        boolean ilksayiGecersizMi=(sayi1<0 || sayi1>100);
//        boolean ikinciSayiGecersizMi=(sayi2<0 || sayi2>100);
        boolean ilksayiGecersizMi=sayi1>0 && sayi1<=100;
        boolean ikinciSayiGecersizMi =sayi2>0 && sayi2<=100;
        if (!ilksayiGecersizMi || !ikinciSayiGecersizMi){
            System.out.println("Giris Gecersiz");
        } else if ((sayi1+sayi2)/2>=50) {
            System.out.println("Tebrikler Gectiniz.");
        }else
            System.out.println("Maalesef Kaldiniz!.");


    }
}
