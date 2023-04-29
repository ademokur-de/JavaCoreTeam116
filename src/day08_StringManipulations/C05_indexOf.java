package day08_StringManipulations;

public class C05_indexOf {
    public static void main(String[] args) {

        String str = "Java en iyisi ";

        System.out.println(str.indexOf("e"));  // 5
        System.out.println(str.indexOf("i"));  // 8

        System.out.println(str.indexOf("en"));  // 5

        System.out.println(str.indexOf("is"));  // 10
        System.out.println(str.indexOf("iy"));  // 8

        System.out.println(str.indexOf("o"));  // -1
        System.out.println(str.indexOf("en guzeli"));  // -1

        System.out.println(str.indexOf("a", 1));  // 1
        System.out.println(str.indexOf("a", 2));  // 3
        System.out.println(str.indexOf("a", 5));  // -1

        System.out.println(str.indexOf("i"));  // 8
        System.out.println(str.indexOf("i", 5));  // 8
        System.out.println(str.indexOf("i", 9));  // 10
        System.out.println(str.indexOf("i",11));  // 12


        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2 kere veya daha fazla kullanilmis

        // "Java en iyisi" icerisinde "en" kelimesi icin


        if (str.indexOf("en")==-1){
            System.out.println("bu cümlede aradiginiz kelime yok");
        } else if (str.indexOf("en" , ((str.indexOf("en"))+1))==-1) {
            System.out.println("bu cümlede aradiginiz kelimeden bir tane var");
        }else System.out.println("bu cümlede aradiginiz kelimeden birden fazla var");


    }
}
