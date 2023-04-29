package day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ListOlusturmaYazdirmaMetodu {
    public static void main(String[] args) {


        List<String> isimler =new ArrayList<>();
        isimler.add("Ahmet");
        isimler.add("Murat");
        isimler.add("Muhammed");
        isimler.add("Sefa");
        isimler.add("Erhan");

    listeYazdir(isimler);

    }
    public static void listeYazdir(List<String> isimler){

        System.out.println(isimler);
    }
}
