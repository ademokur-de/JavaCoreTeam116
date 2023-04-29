package Aramizda;

import java.util.Scanner;

public class TernaryEmekliSorusu {
    //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
    // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri
    // emekli olabilir. Cinsiyet ve yasini dikkate
    // alarak “Emekli olabilirsin” veya “Emekli olmak
    // icin .. Yil daha calisman gerekir” yazdirin
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz, \nKadin icin :K Erkek icin E");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinizi giriniz :");

        int yas = scanner.nextInt();

//        System.out.println(yas>85||yas<10?"Hatali Yas" :cinsiyet=='E'||cinsiyet=='K'?"":"Hatali Cinsiyet");

        System.out.println( cinsiyet=='E'?
                yas>=65 ? "Emekli olabilirsin" : "Emekli olmak icin "+(65-yas)+" Yil daha calisman gerekir"
                :
                yas>=60 ? "Emekli olabilirsin" : "Emekli olmak icin "+(60-yas)+" Yil daha calisman gerekir"

                );


    }
}
