package day16_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullanicidanIntListOlusturma {

    // kullanicidan integer list olusturup donduren bir method olusturun
    public static void main(String[] args) {
        System.out.println(kullanicidanSayiAlarakListeOlusturanMethod());
    }
    public static List<Integer> kullanicidanSayiAlarakListeOlusturanMethod (){

        Scanner scanner=new Scanner(System.in);
        int sayi;
        List<Integer> sayilar =new ArrayList<>();
        //kullanicidan sayilar loop icinde alinacak.
        // loop sayisi bilinmediginden while ile yapilacak.
        // kullanici "0" girince loop bitecek.
        do {
            System.out.println("Lütfen listeye bir sayi giriniz:");
            sayi= scanner.nextInt();
            if (sayi!=0) {
                sayilar.add(sayi);
            }
            }while (sayi!=0);
        return sayilar;
    }
}
