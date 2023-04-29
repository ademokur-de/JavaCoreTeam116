package day05_ifElseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {
        //Soru 1-   Kullanicidan bir ucgenin
        //          3 kenar uzunlugunu alin, ucgen eskenar ise
        //          “Eskenar ucgen” yazdirin,
        //          degilse “Eskenar degil” yazdirin.

        Scanner scanner =new Scanner(System.in);
        double birinciKenar, ikinciKenar,ucuncuKenar;

        System.out.println("Lütfen Ucgenin birinci kenarini giriniz :");
        birinciKenar = scanner.nextDouble();
        System.out.println("Lütfen Ucgenin ikinci kenarini giriniz :");
        ikinciKenar = scanner.nextDouble();
        System.out.println("Lütfen Ucgenin ucuncu kenarini giriniz :");
        ucuncuKenar = scanner.nextDouble();

        if (birinciKenar==ikinciKenar && ikinciKenar==ucuncuKenar && birinciKenar>0) {
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar Degil");
        }
    }
}
