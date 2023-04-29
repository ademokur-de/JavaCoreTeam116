package day16_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_KullaniciListeOlusturma {

    // kullanicidan alinan isimleri listeye kaydeden bir method olusturun

    public static void main(String[] args) {


        System.out.println(kullanicidanStringAlarakListeOlusturma());

    }
    // method String'lerden olusan bir list dondurecek "List<String>"
    public static List<String> kullanicidanStringAlarakListeOlusturma(){

        Scanner scanner =new Scanner(System.in);

        // Loop sayisi bilinmiyorsa do-while veya while loop kullanilir
        // kullanici isim yerine "0" girince program dursun

        String kullaniciGirdisi="";
        List<String> isimler =new ArrayList<>();
        //kullanici girdisi "0"'a esit olmadigi surece loop devam etsin

        while (!kullaniciGirdisi.equalsIgnoreCase("0")){

            System.out.println("Lutfen listeye eklemek icin bir isim giriniz :");
            kullaniciGirdisi=scanner.next();

            //eger kullanici "0" girerse listeye ekleme
            if (!kullaniciGirdisi.equalsIgnoreCase("0")){
                isimler.add(kullaniciGirdisi);
            }
        }
        return isimler;
    }
}
