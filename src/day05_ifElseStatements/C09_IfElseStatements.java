package day05_ifElseStatements;

import java.util.Scanner;

public class C09_IfElseStatements {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir harf isteyin, girilen
        // karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir harf giriniz : ");

        char harf= scanner.next().charAt(0);

        if ('a'<= harf && harf <='z'){
            System.out.println("Girilen harfin yeni hali :" + Character.toUpperCase(harf));
        }else {
            System.out.println("Girilen karakter : " + harf);
        }
    }
}
