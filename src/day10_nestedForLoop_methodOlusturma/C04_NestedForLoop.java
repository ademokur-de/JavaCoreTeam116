package day10_nestedForLoop_methodOlusturma;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen sayi icin asagidaki sekli olusturun

        int sayi = 4

        1
        1 2
        1 2 3
        1 2 3 4

         */
        int sayi = 4;


        for (int i = 1; i <=sayi ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"  ");
                //if (i==j) break;  ya da sayi degiskeni iki yerdede kullanip boyle
            }
            System.out.println("");
        }
    }
}
