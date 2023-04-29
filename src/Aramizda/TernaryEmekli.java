package Aramizda;

import java.util.Scanner;

public class TernaryEmekli {
    public static void main(String[] args) {
        /*
            Kullanicidan cinsiyetini ve yasini alin,
            Kadin, 60 yas ve uzeri ,
            Erkek 65 yas ve uzeri emekli olabilir.
            Cinsiyet ve yasini dikkate alarak “Emekli
            olabilirsin” veya “Emekli olamazsin” yazdirin.
         */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi girin :\nK:Kadin E:Erkek");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yasinizi giriniz :");
        int yas = scanner.nextInt();
        System.out.println(   cinsiyet=='K' ?    (yas>=60 ? "Emekli olabilirsin" : "Emekli olamazsin" )
                                            :
                                                    (yas>=65  ? "Emekli olabilirsin" : "Emekli olamazsin")    );

    }
}
