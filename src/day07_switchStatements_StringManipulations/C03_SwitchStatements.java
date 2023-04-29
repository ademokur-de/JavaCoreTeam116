package day07_switchStatements_StringManipulations;

import java.util.Scanner;

public class C03_SwitchStatements {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz :");

        int rakam= scanner.nextInt();

        switch (rakam){
            case 0:
                System.out.println("Sifir");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("Iki");
                break;
            case 3:
                System.out.println("Üc");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Bes");
                break;
            case 6:
                System.out.println("Alti");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Lütfen 0-9 arasi bir rakam giriniz!!");
        }


    }
}
