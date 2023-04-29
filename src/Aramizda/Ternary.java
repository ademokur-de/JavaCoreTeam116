package Aramizda;

import java.util.Scanner;

public class Ternary {


    public static void main(String[] args) {
        /*
            /*   7-

         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ucharfli bir kelime giriniz :");
        String kelime= scanner.nextLine();

        System.out.println(
                (kelime.charAt(0)==kelime.charAt(1))|| (kelime.charAt(0)==kelime.charAt(2))||(kelime.charAt(1)==kelime.charAt(2)) ?
                        "Kelime Unique degildir"
                        :
                        "Kelime Unique dir"
        );
    }
}
