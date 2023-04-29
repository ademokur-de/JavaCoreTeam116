package day10_nestedForLoop_methodOlusturma;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen satir ve sutun sayisina uygun olarak
        asagidaki sekli yazdirin


        ornek : satir4 , sutun 5

        * * * * *
        * * * * *
        * * * * *
        * * * * *

         */

        int satirSayisi=4;
        int sutunSayisi =5;


        for (int j = 1; j <=satirSayisi ; j++) {

            for (int i = 1; i <= sutunSayisi; i++) {
                System.out.print("* ");

            }
            System.out.println("");

        }

    }
}
