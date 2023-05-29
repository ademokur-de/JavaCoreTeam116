package day34_nestedMaps;

import java.util.TreeMap;

public class C04_TreeMap {
    public static void main(String[] args) {

        /*
            TreeMap elementleri dogal sirali olarak tuttugu
            ve yeni eklenen elementleri de bu siralamaya uygun bir konuma yerlestirdigi icin
            diger map'lerde olmayan bazi ekstra ozelliklere sahiptir
         */

        TreeMap<Integer, String > ogrenciMap=new TreeMap<>();
        ogrenciMap.put(103,"Ali Can");
        ogrenciMap.put(120,"Veli Cem");
        ogrenciMap.put(101,"Akif Han");
        ogrenciMap.put(140,"Yusuf San");

        System.out.println(ogrenciMap); //{101=Akif Han, 103=Ali Can, 120=Veli Cem, 140=Yusuf San}

        System.out.println(ogrenciMap.subMap(103, 110));  // {103=Ali Can}
        System.out.println(ogrenciMap.subMap(103, 120));  // {103=Ali Can}
        System.out.println(ogrenciMap.subMap(103, 125));  // {103=Ali Can, 120=Veli Cem}
        System.out.println(ogrenciMap.subMap(103, false, 120, true)); //{120=Veli Cem}
        // sadece sinirlar yazilirsa; baslangic dahil bitis haric olur.
        // ama istersek baslangic ve bitisin dahil olup olmamasini boolean degerlerle belirleyebiliriz.

        System.out.println(ogrenciMap.descendingMap());
        // tersten yazdirir(ama Map'te degisiklik olmaz siralama yine dogal sirali kalir) :
        // {140=Yusuf San, 120=Veli Cem, 103=Ali Can, 101=Akif Han}
        System.out.println(ogrenciMap); //{101=Akif Han, 103=Ali Can, 120=Veli Cem, 140=Yusuf San}

        System.out.println(ogrenciMap.descendingKeySet()); // [140, 120, 103, 101]  keyleri ters sirali getirir

        System.out.println(ogrenciMap.lowerKey(120)); // 103

        System.out.println(ogrenciMap.lowerEntry(120)); // 103=Ali Can

        // floorKey/Entry : asagi yuvarlayarak Key veya Entry'leri getirir
        System.out.println(ogrenciMap.floorKey(103)); // istenen deger yoksa bir altindakini getirir :  103
        System.out.println(ogrenciMap.floorKey(105));  // 103
        System.out.println(ogrenciMap.floorKey(119));  // 103
        System.out.println(ogrenciMap.floorKey(120));  // 120

        System.out.println(ogrenciMap.floorEntry(105)); //103=Ali Can

        //higherKey/Entry yukari yuvarlayarak Key veya Entry'leri getirir

        System.out.println(ogrenciMap.higherKey(120));  // buyuk olan 140
        System.out.println(ogrenciMap.higherEntry(100)); // 101=Akif Han

        //ceilingKey/Entry

        System.out.println(ogrenciMap.ceilingKey(120));  // yukari yuvarla 120
        System.out.println(ogrenciMap.ceilingEntry(100)); // 101=Akif Han

        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.headMap(120)); // basa dogru map

        System.out.println(ogrenciMap.headMap(130));

        System.out.println(ogrenciMap.headMap(120, true));
        System.out.println(ogrenciMap.headMap(130, true));

        System.out.println(ogrenciMap.tailMap(120)); // sona dogru map
        System.out.println(ogrenciMap.tailMap(120, false)); // 120 haric sona dogru

        System.out.println(ogrenciMap.firstKey());
        System.out.println(ogrenciMap.firstEntry());
        System.out.println(ogrenciMap.lastKey()); //140
        System.out.println(ogrenciMap.lastEntry()); //140=Yusuf San

        System.out.println(ogrenciMap.pollLastEntry()); // 140=Yusuf San silinen oge(sondakini sildi)
        System.out.println(ogrenciMap); // {101=Akif Han, 103=Ali Can, 120=Veli Cem}

        System.out.println(ogrenciMap.pollFirstEntry());// 101=Akif Han silinen oge(bastakini sildi)
        System.out.println(ogrenciMap); //{103=Ali Can, 120=Veli Cem}

        ogrenciMap.clear(); // herseyi siler
        System.out.println(ogrenciMap); //{}


    }
}
