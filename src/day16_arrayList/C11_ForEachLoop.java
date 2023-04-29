package day16_arrayList;

import java.util.Scanner;

public class C11_ForEachLoop {

    public static void main(String[] args) {
        /*
            Soru 4- Kullanicidan bir cumle ve bir harf alin,
                harf cumlede kullanilmissa kac kere
                kullanildigini yazdirin,
                kullanilmadiysa “harf cumlede kullanilmamis" yazdirin
         */
        //java icin
        //  1) split ile "" parcaliyoruz
        //  2) forEachLoop ile harfler teker teker kontrol edilir
        //  3) istenilen harfe denk gelindiginde sayac bir artirilir
        //  4) sayac=0 ise “harf cumlede kullanilmamis" yazdirilir. degilse sayac yazdirilir

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir cumle giriniz : ");
        String str= scanner.nextLine();
        System.out.println("Aranan harfi giriniz : ");
        String arananHarf=scanner.next();

        //  1) split ile "" parcaliyoruz
        String[] arr=str.split("");

        //  2) forEachLoop ile harfler teker teker kontrol edilir
        int sayac=0;
        for (String each:arr
             ) {
            // 3) istenilen harfe denk gelindiginde sayac bir artirilir
            if (each.equals(arananHarf)){
                sayac++;
            }

        }
        //  4) sayac=0 ise “harf cumlede kullanilmamis" yazdirilir.
        //  degilse sayac yazdirilir

        if (sayac==0){
            System.out.println("harf cumlede kullanilmamis");
        }else {
            System.out.println("Aranan harf : \"" + arananHarf + "\" "+sayac+" adet kullanilmistir.");
        }



    }
}
