package day11_methodOverloading_whileLoop;

public class C04_MethodOverloading {
    public static void main(String[] args) {

        /*
            Java overloading yapilmis method'lardan hangisinin calisacagina
            karar verirken adim adim ilerler
            1- eger argument'ler ile parametre'ler tamamen uyumluysa onu calistirir
            2- eger argument ve parametreler %100 uyumlu degilse casting yapabilir miyim diye bakar
            3- casting ile calistiracagi birden fazla method bulursa,
               en az casting ile calistiracagini tercih eder
         */

        topla(4,5); // int ve float'i toplami : 9.0
        topla('a','b'); // int ve float'i toplami : 195.0
        topla(3.2f,5.1f); // Iki double'in tolami : 8.2999.....
    }

    public static void topla(double sayi1, double sayi2){
        System.out.println("Iki double'in tolami : " +(sayi1+sayi2));
    }

   /*

   public static void topla(int sayi1 , float sayi2 ){

        System.out.println("int ve float'i toplami : ");
    }

    */

    public static void topla(float sayi1 , float sayi2 ){

        System.out.println("iki float'in toplami : " +(sayi1+sayi2));
    }

}
