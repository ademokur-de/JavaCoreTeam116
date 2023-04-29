package day16_arrayList;

import java.util.List;

public class C05_OgrenciNotlari {

    public static void main(String[] args) {

        // ogretmenden alinan ogrenci notlarinin ortalamasini ve
        // kac ogrencinin ortalamanin ustunde not aldigini
        // bize ulastiran bir method yazin.

        List<Integer> notlarListesi =C04_KullanicidanIntListOlusturma.kullanicidanSayiAlarakListeOlusturanMethod();


        notOrtVeOrtUstOgrenciSayisi(notlarListesi);

    }
    public static void notOrtVeOrtUstOgrenciSayisi(List<Integer> notlarlistesi){

        //not ortalamasi
        int ortalamaNot=0;
        int toplamNot=0;
        for (int i = 0; i < notlarlistesi.size(); i++) {

            toplamNot=toplamNot+notlarlistesi.get(i);
        }
        ortalamaNot=toplamNot/notlarlistesi.size();


        int sayac=0;
        for (int i = 0; i < notlarlistesi.size(); i++) {
            if (notlarlistesi.get(i)>ortalamaNot){
                sayac++;
            }

        }
        System.out.println("Ogrenci sayisi : " + notlarlistesi.size());
        System.out.println("Sinifin ortalama notu : " + ortalamaNot);
        System.out.println("Ortalamanin ustundeki ogrenci sayisi : " + sayac);

    }
}
