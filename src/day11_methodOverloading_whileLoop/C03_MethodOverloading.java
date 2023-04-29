package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C03_MethodOverloading {

    public static void main(String[] args) {

        /* overloading : asiri yükleme
            Bir class'ta ayni isme sahip birden fazla method olmasina denir

            Java'da bir class icerisinde ayni isim ayni sayida ve data türünde parametre ile
            olusturulursa Java CTE(Compile Time Error) verir(Altini Kirmizi cizer).

            bunun 3 cözümü vardir:
            1 - parametre sayisi degistirilebilir
            2 - parametrelerin data türleri degistirilebilir
            3 -

        */

        topla(5,8); // Iki Int'in tolami : 13
        topla('a','b'); // iki Char'in toplami : 195
        topla(3.4,5); // Double ve Int'in toplami : 8.4
        topla(5,2.1); // Int ve Double'in toplami : 7.1
        topla(3,5,4);
        topla('Z', 'K');
        topla('a','b','c');
        topla(5,6);
        topla(1,5,3);



        Scanner scanner=new Scanner(System.in);
        //System.out.println("Lütfen uc sayi giriniz :");

        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();
        int sayi3= scanner.nextInt();
        topla(sayi1,sayi2,sayi3);
    }

    public static void topla(int sayi1, int sayi2){

        System.out.println("iki Int'in toplami : " + (sayi1+sayi2));
    }
    public static void topla(int char1, int char2, int char3){

        System.out.println("Üc Int'in toplami : " + (char1+char2+char3));
    }

    public static void topla(char char1, char char2){

        System.out.println("iki Char'in toplami : " + (char1+char2));
    }

    public static void topla(char char1, char char2, char char3){
        System.out.println("Üc char'in toplami = " + (char1+char2+char3));

    }

    public static void topla(int sayi1, double sayi2){

        System.out.println("Int ve Double'in toplami : " + (sayi1+sayi2));
    }
    public static void topla(double sayi1, int sayi2){

        System.out.println("Double ve Int'in toplami : " + (sayi1+sayi2));
    }
}
