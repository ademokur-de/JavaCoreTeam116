package Aramizda;

public class SelamlaMethod {
    public static void main(String[] args) {


        selamla("Sevda");
        String metin=selamla("Adem");
        System.out.println(metin);
    }
    public static String selamla(String isim){
       // System.out.println("Merhaba Millet\n" + "Ben " + isim +"!");
        String selamlalaMetni="Merhaba Millet \n"+ "Ben " + isim+".";
        return selamlalaMetni;
    }

}
