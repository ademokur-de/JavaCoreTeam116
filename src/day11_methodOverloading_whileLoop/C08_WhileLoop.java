package day11_methodOverloading_whileLoop;

public class C08_WhileLoop {
    public static void main(String[] args) {

        /*  While Loop mu ForLoop mu?
            bu sorunun cevabi yapacagimiz ise bagli

            döngü sayisi belli ise for loop kullanmak pratiktir.

            ancak baslangic, bitis degerleri verilmemisse,
            veya döngü sayisi belirli degilse while loop daha avantajli olur

         */

        //1'den 100'e kadar sayilari yan yana yazdirin

        for (int i = 1; i <=100 ; i++) {
            System.out.print(i+" ");
        }

        System.out.println("*****************");

        // ayni soruyu While Loop ile yapalim


        int sayi=1;
        while (sayi<=100){
            System.out.print(sayi + " ");
            sayi++;
        }

    }
}
