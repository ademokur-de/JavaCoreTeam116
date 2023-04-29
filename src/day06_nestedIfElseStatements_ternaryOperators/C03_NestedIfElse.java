package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri
        // emekli olabilir. Cinsiyet ve yasini dikkate
        // alarak “Emekli olabilirsin” veya “Emekli olmak
        // icin .. Yil daha calisman gerekir” yazdirin

        // önce yas veya cinsiyetten birini ana degisken secip
        // ona göre bir if else olusturun

        // Cinsiyet ana degisken olsun

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz, \nKadin icin :K Erkek icin E");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinizi giriniz :");

        int yas = scanner.nextInt();

        if (yas<10 || yas>80){ // 1. Bölge
            System.out.println("Gecersiz yas girisi.");
        } else if (yas<60) { // 2. Bölge
            if(cinsiyet!='E' && cinsiyet!='K'){
                System.out.println("Cinsiyet girisi hatali");
            } else if (cinsiyet=='K') {
                System.out.println("Kadin 60 yasina kadar calismalidir. Daha " + (60-yas) + " yil calismalisin");
            }else {
                System.out.println("Erkek 65 yasina kadar calismalidir. Daha " + (65-yas) + " yil calismalisin");
            }

        } else if (yas<65) { // 3. Bölge
            if(cinsiyet!='E' && cinsiyet!='K'){
                System.out.println("Cinsiyet girisi hatali");
            } else if (cinsiyet=='K') {
                System.out.println("Emekli Olabilirsin");
            }else {
                System.out.println("Erkek 65 yasina kadar calismalidir. Daha " + (65-yas) + " yil calismalisin");
            }
        }else { // 4. Bölge

        }


    }
}
