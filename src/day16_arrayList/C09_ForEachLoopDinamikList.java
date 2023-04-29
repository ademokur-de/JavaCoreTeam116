package day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_ForEachLoopDinamikList {

    public static void main(String[] args) {

        /*
            Soru 3degisiklik(liste girilecek)
                    - Verilen String bir list’deki her bir elementi kontrol edip,
                    - Kelimenin uzunlugu cift sayi ise ilk yarisini
                    - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
                    yeni bir [listeye] ekleyip yazdirin.
         */

        List<String> ilkListe =C02_KullaniciListeOlusturma.kullanicidanStringAlarakListeOlusturma();

        isimManipulation(ilkListe);
    }

    public static void isimManipulation(List<String> list){

        List<String> yeniListe =new ArrayList<>();

        for (String each:list
        ) {
            if (each.length()%2==0){
                yeniListe.add(   each.substring(0,each.length()/2)  );
            }else {
                yeniListe.add(    each.substring(each.length()/2 )        );
            }

        }
        System.out.println(yeniListe);
    }
}
