package day07_switchStatements_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan ay numarasini alin,
        //        o ayin mevsimini yazdirin.
        //        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //        Kullanici o veya O yazdiginda output Ocak olsun.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir ay numarasi giriniz : ");

        int ayNo = scanner.nextInt();

        switch (ayNo){
            case 12 :
                System.out.println("Kis");
                break;
            case 1 :
                System.out.println("Kis");
                break;
            case 2 :
                System.out.println("Kis");
                break;
            case 3:
                System.out.println("Ilkbahar");
                break;
            case 4 :
                System.out.println("Ilkbahar");
                break;
            case 5 :
                System.out.println("Ilkbahar");
                break;
            case 6 :
                System.out.println("Yaz");
                break;
            case 7 :
                System.out.println("Yaz");
                break;
            case 8 :
                System.out.println("Yaz");
                break;
            case 9 :
                System.out.println("Sonbahar");
                break;
            case 10 :
                System.out.println("Sonbahar");
                break;
            case 11 :
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Gecersiz Ay Numarasi!");



        }
    }
}
