package day09_stringManipulation_forLoop;

public class C05_forLoop {
    public static void main(String[] args) {

        // 10 kere "Hello World" yazdirin

        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");


        System.out.println("======================");
        String str = "Hello World\n";

        System.out.println(str.repeat(10));

        // 1 den 100'e(100 dahil) kadar olan sayilari yazdirin




        for (int i=1;  i <=100 ; i++) {
            System.out.print(i + " ");

        }
// uc basamakli cift sayilari toplayin

            int sayilarToplami=0;

            for (int i = 0; i < 1000; i+=2) {
                sayilarToplami += i ;

            }
            System.out.println("\n100 ile 1000 arasindaki cift sayilarin toplami : "+ sayilarToplami);




    }
}
