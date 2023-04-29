package Aramizda;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        //yas 18 den kucukse cocuk, degilse yetiskin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz : ");
        int yas= scanner.nextInt();

        String durum= yas<18 ?  "Cocuk"  : "Yetiskin";

        //System.out.println( yas<18 ?  "Cocuk"  : "Yetiskin"  );

        System.out.println(durum);


    }
}
