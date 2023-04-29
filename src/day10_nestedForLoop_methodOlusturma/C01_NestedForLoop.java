package day10_nestedForLoop_methodOlusturma;

public class C01_NestedForLoop {
    public static void main(String[] args) {

        // 1'den 4'e kadar(dahil) olan sayilar icin carpim tablosu olusturunun.

        for (int i = 1; i <=4 ; i++) {
            System.out.print(i + "  ");
        }
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {
            System.out.print(2*i + "  ");
        }
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {
            System.out.print(3*i + "  ");
        }
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {
            System.out.print(4*i + "  ");
        }



        System.out.println("=========================\n");
        for (int j = 1; j <=10 ; j++) {

            for (int i = 1; i <=10 ; i++) {

                System.out.print(i*j + "\t");
            }

          System.out.println("");
        }




    }
}
