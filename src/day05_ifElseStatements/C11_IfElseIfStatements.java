package day05_ifElseStatements;

import java.util.Scanner;

public class C11_IfElseIfStatements {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir sayi alin,
        // sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”,
        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
        // Hem 3 hem de 5'e bölünebiliyorsa SUPER yazdirin.
        /*
        NOT: coklu if else bloklari
        else ile biterse tüm durumlari kapsiyor demektir ve
        her durumda bir if body si calisir.

        Ancak else ile bitmiyorsa
        bu durumda bazi degerler icin kodumuz calisir
        ama hic bir if boddy si calismayabilir.
         */

        Scanner scanner =new Scanner(System.in);
        System.out.println(" Lütfen bir tamsayi giriniz :");

        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 ==0 && girilenSayi % 5 == 0){
            System.out.println("SUPER");
        } else if (girilenSayi % 5 == 0) {
            System.out.println("Bes ile bölünebilen sayi");
        } else if (girilenSayi % 3 == 0  ) {
            System.out.println("Üc ile bölünebilen sayi");
        }
    }
}
