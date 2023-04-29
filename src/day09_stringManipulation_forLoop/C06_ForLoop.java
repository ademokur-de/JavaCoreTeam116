package day09_stringManipulation_forLoop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {


        // Kullanicidan iki sayi alin ve bu sayilar dahil olarak
        // aralarindaki 3 ile bölünebilen sayilari yazdirin
        // ilk girilen sayi ikinci girilen sayidan büyük ise hata mesaji yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 2 pozitif tamsayi girin");

        int sayi1 = scanner.nextInt();
        int sayi2= scanner.nextInt();

        if (sayi1>sayi2) {
            System.out.println("Ilk sayi ikinciden büyük olamaz!!");
        }
        else {
            for (int i = sayi1; i <= sayi2 ; i++) {

                if (i%3==0){
                    System.out.println(i+ " ");
                }

            }
            System.out.println();
        }

    }
}
