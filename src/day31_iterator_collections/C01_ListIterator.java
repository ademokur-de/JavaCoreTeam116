package day31_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(3);
        sayilar.add(9);
        System.out.println(sayilar); // [5, 12, 3, 9]

        // index kullanmadan listedeki tum elementleri 2 artirip, yeni halini kaydedin

        ListIterator lit= sayilar.listIterator();

        Integer sayi=0;

        while (lit.hasNext()){
            sayi= (Integer) lit.next();
            lit.set(sayi+2);
        }
        System.out.println(sayilar);

        // iterator kullanarak list'in elementlerini sondan basa dogru yazdirin

        // yukaridaki islemden dolayi iterator en sonda

        while (lit.hasPrevious()){
            System.out.print(lit.previous() + " ");
        }

    }
}
