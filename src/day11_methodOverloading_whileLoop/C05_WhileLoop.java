package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan bir sayi alip 3 ile bölünüp bölünemedigini yazdirin
        // kullanici 3 ile bölünebilen bir sayi girinceye kadar
        // tekrar deger isteyin

        /*
            Tekrar sayisi tam olarak bilinmeyen
            tekrar sayisi farkli bir sarta bagli olan durumlarda while loop kullaniriz
         */

        Scanner scanner =new Scanner(System.in);


        // girilen sayi 3'e bölünebilene kadar tekrar et
        // while loop ta icine yazilan sart saglanmadigi müddetce
        // kod tekrar calisir

        int sayi =1;
        while (sayi%3 !=0){

            System.out.println("Lütfen pozitif bir tamsayi giriniz : ");
            sayi= scanner.nextInt();
            if (sayi%3==0){
                System.out.println("Sayi 3 ile tam bölünebiliyor");
            }else {
                System.out.println("Sayi 3 ile tam bölünemiyor");
            }


        }


    }
}
