package day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_TamBolenler {
    public static void main(String[] args) {
        // girilen bir pozitif sayinin tam bolenlerini liste olarak bize donduren bir method yaziniz
        int sayi=1270;
        System.out.println(tamBolenlerListesi(sayi));
        System.out.println("liste uzunlugu : " + tamBolenlerListesi(sayi).size());
        if (tamBolenlerListesi(sayi).size()==2){
            System.out.println("Sayi ASALDIR");
        }
    }
    public static List<Integer> tamBolenlerListesi(int sayi){

        List<Integer> tamBolenlerListesi =new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {

            if (sayi%i==0){
                tamBolenlerListesi.add(i);
            }

        }



        return tamBolenlerListesi;
    }
}
