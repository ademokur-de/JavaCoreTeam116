package day32_Maps;

import java.util.Map;

public class C05_KeyValueBirlikteKullanma {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();

        int basNo=90;
        int bitNo=104;

        MapMethodlar.numaraAraligindakiOgrencileriyazdir(ogrenciMap,basNo,bitNo);

    }
}
