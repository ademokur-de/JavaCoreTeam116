package day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_remove {
    public static void main(String[] args) {

        String[] harfler ={"a","h","d","k","m","e","t","a","k"};
        List<String> harfList = new ArrayList<>();
        for (int i = 0; i < harfler.length; i++) {

            harfList.add(harfler[i]);

        }
        System.out.println(harfList); //[a, h, d, k, m, e, t, a, k]

        System.out.println(harfList.remove("h")); // true (degisikligi yapti)

        System.out.println(harfList); // [a, d, k, m, e, t, a, k]

        System.out.println(harfList.remove("x")); // false (degisiklik yapmadi-islemi yapamadi)

        System.out.println(harfList); // [a, d, k, m, e, t, a, k]

        // remove() method'unda obje verirsek, bulursa siler ve true dondurur
        // bulamazsa silemedigi icin false dondurur


        System.out.println(harfList.remove(1)); // d  (d'yi sildi)

        System.out.println(harfList); // [a, k, m, e, t, a, k]

        System.out.println(harfList.remove(23)); // HATA VERIR: IndexOutOfBoundsException
        // remove() index ile verilirse index liste icinde varsa
        // elemani siler ve sildigi elemani bize dondurur
        // index yoksa exception olusur
    }
}
