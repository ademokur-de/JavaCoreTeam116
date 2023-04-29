package day05_ifElseStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir ucgenin 3
        // kenar uzunlugunu alin, ucgen
        // eskenar ise “Eskenar ucgen” yazdirin.
        Scanner scanner =new Scanner(System.in);
         int birinciKenar, ikinciKenar,ucuncuKenar;

        System.out.println("Lütfen Ucgenin birinci kenarini giriniz :");
        birinciKenar = scanner.nextInt();
        System.out.println("Lütfen Ucgenin ikinci kenarini giriniz :");
        ikinciKenar = scanner.nextInt();
        System.out.println("Lütfen Ucgenin ucuncu kenarini giriniz :");
        ucuncuKenar = scanner.nextInt();

        if (birinciKenar==ikinciKenar && ikinciKenar==ucuncuKenar && birinciKenar>0)
            System.out.println("Eskenar ucgen");





    }
}
