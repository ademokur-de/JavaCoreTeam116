package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        // Soru 7 (Interview)- Kullanicidan iki sayi alip
        //        ikisinin degerlerini degistirin(swap).
        Scanner scanner =new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi giriniz : ");
        double sayi1 = scanner.nextDouble();

        System.out.println("Lutfen ikinci sayiyi giriniz : ");
        double sayi2 = scanner.nextDouble();

        // mesela sayi1= 10 , sayi2= 20 , temp=0

        double temp = sayi2;

        //  sayi1= 10 , sayi2= 20 , temp=20

        sayi2= sayi1;

        //  sayi1= 10 , sayi2= 10 , temp=20

        sayi1 =temp;

        //  sayi1= 20 , sayi2= 10 , temp=20

        System.out.println("Sayilarin yerini degistirdim. \n artik Sayi1=" + sayi1 + "\nSayi2 =" + sayi2);







    }
}
