package day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_ForEachLoop {

    public static void main(String[] args) {

        // verilen array'in icindeki sayilari once ciftler sonra tekler
        // olacak sekilde yazdiran method yapalim

        int [] arr={1,2,3,4,5,6,7,8,9,10,11,12};


        tekCiftListesi(arr);
    }

    public static void tekCiftListesi(int[] arr){
        List<Integer> ciftlerListesi =new ArrayList<>();
        List<Integer> teklerListesi =new ArrayList<>();

        for (int each:arr
             ) {// gelen eleman tek mi cift mi
            if (each%2==0){
                ciftlerListesi.add(each);
            }else {
                teklerListesi.add(each);
            }
        }
        System.out.println("array icindeki ciftler listesi : " +ciftlerListesi);
        System.out.println("array icindeki tekler listesi : " +teklerListesi);

    }

}
