package day09_stringManipulation_forLoop;

public class C09_ForLoop {
    public static void main(String[] args) {

        //verilen bir metindeki
        // büyük harf kücük harf ve Space sayilarini bulun
        // Space sayisini gözönüne alarak kac kelime oldugunu,
        // kac tane kücük ve büyük harf oldugunu yazdirin

        String str = "Java OgrEnen Isi kapar";

        int buyukHarfSayisi=0;
        int kucukHarfSayisi=0;
        int spaceSayisi =0;

        for (int index = 0; index < str.length() ; index++) {

            char karakter = str.charAt(index);
            if (karakter>= 'a'&& karakter<='z'){
                kucukHarfSayisi++;
            } else if (karakter>='A' && karakter <='Z') {
                buyukHarfSayisi++;
            } else if (karakter ==' ') {
                spaceSayisi++;
            }

        }

        System.out.println("Metindeki kelime sayisi : " + (spaceSayisi+1) +
                "\n kucuk harf sayisi : " + kucukHarfSayisi +
                "\nbuyuk harf sayisi : " + buyukHarfSayisi);


    }
}
