package Aramizda;

import java.util.Scanner;

public class NestedSorular {

    //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
    //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
    //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
    //alirsa %15, yoksa %10 indirim yapin
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Market Kartiniz Var mi? (Evet/Hayir) : ");
        String kartV= scanner.nextLine().toLowerCase();
        System.out.println("Lütfen ürün adedini girin : ");
        int urunAdedi= scanner.nextInt();
        System.out.println("Lütfen toplam liste fiyatini girin : ");
        double listeFiyati= scanner.nextDouble();


        boolean kart=kartV.contains("evet");

        if (kart){
            if (urunAdedi>10){
                System.out.println("Yapilan Indirim %20, Ödeme : " + listeFiyati*0.8);
            }else {
                System.out.println("Yapilan Indirim %15, Ödeme : " + listeFiyati*0.85);
            }
        }else{
            if (urunAdedi>10){
                System.out.println("Yapilan Indirim %15, Ödeme : " + listeFiyati*0.85);
            }else {
                System.out.println("Yapilan Indirim %10, Ödeme : " + listeFiyati*0.9);
            }
        }
    }
}
