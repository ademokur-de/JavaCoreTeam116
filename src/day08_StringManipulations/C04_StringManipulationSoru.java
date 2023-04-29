package day08_StringManipulations;

import java.util.Scanner;

public class C04_StringManipulationSoru {
    public static void main(String[] args) {
        //SORU : kullanicidan bir mail alin
        // - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.

        Scanner scanner=new Scanner(System.in);
// 1. adım kullanıcın mailin alma
        System.out.println("Lütfen mail adresinizi giriniz:");
        String str = scanner.nextLine();


//        if (!str.contains("@")){
//            System.out.println("Gecersiz mail");
//        }
//
//        if (!str.contains("@gmail.com")){
//            System.out.println("mail gmail olmali");
//        }
//
//        if (!str.endsWith("@gmail.com")){
//            System.out.println("mailde yazim hatasi var");
//        }


        if (!str.contains("@")) {
            System.out.println("gecersiz mail");
        } else if (!str.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!str.endsWith("@gmail.com")) {
            System.out.println("mailde yaim hatasi var");

        }else System.out.println("Mail basarili");


    }
}
