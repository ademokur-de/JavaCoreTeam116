package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C01_SifreKontrolu {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi isteyin
        Sayi asagidaki 4 sarti sagliyorsa "Mükemmel Sayi" yazdirin

        Saglanmayan sartlarin tamamini kullaniciya soyleyin

        1- sayi 4 basamakli olmalidir
        2- sayi 3 ile bölünebilmelidir
        3- sayi 5 ile bölünememelidir
        4- sayinin birler basamagi tek sayi olmalidir

         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz :");
        int sayi = scanner.nextInt();

        boolean sifreBasariliMi = true;

        // 1- sayi 4 basamakli olmalidir
        if (sayi<1000 || sayi>9999){
            System.out.println("sayi 4 basamakli olmalidir");
            sifreBasariliMi=false;
        }
        // 2- sayi 3 ile bölünebilmelidir
        if (sayi %3 !=0){
            System.out.println("2- sayi 3 ile bölünebilmelidir");
            sifreBasariliMi=false;
        }
        // 3- sayi 5 ile bölünememelidir
        if (sayi %5==0){
            System.out.println("3- sayi 5 ile bölünememelidir");
            sifreBasariliMi=false;
        }
        // 4- sayinin birler basamagi tek sayi olmalidir
        if (sayi %2 ==0){
            System.out.println("4- sayinin birler basamagi tek sayi olmalidir");
            sifreBasariliMi=false;
        }
        if (sifreBasariliMi){
            System.out.println("Mükemmel Sayi");
        }

    }
}
