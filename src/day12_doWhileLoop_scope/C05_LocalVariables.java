package day12_doWhileLoop_scope;

public class C05_LocalVariables {

    /*
        Kural 1 -   Local variable'lar sadece kendi scope'larinda gecerlidir
                    Bir method'da olusturulan local variable baska method'da kullanilamaz

        Kural 2 -   Local bir scope'ta deger atamadan local variable olusturabilirsiniz.
                    Ancak deger atamadan local variable'lari kullanamazsiniz.

        Kural 3 -   Bir Loop icerisinde olusturulan variable'lar
                    sadece o loop icerisinde gecerlidir
                    o loop disinda kullanilamaz
                    bunlara loop variable da denir

     */

    public static void main(String[] args) {
        int sayi =10;
//        str = "Java Candir";
//        yeterMi=false;

        String slogan = "Java candir";
        System.out.println(slogan);
        slogan="Java hayattir";

        String s;
//        System.out.println(s);
//        s = s.toLowerCase();
        for (int i = 0; i < 10; i++) {
            int sayi2=10;
            System.out.println(sayi2+i);

        }
        // for loop icerisinde i ve sayi2  isminde 2 local variable olusturulmustur
        //loop disinda bunlari kullanalim
//        i=20;
//        System.out.println(i);
//        sayi2=20;

    }

    public static void staticMethod(){
        String str ="Java Mutluluktur";
//        System.out.println(sayi);
//        System.out.println(yeterMi);
    }
    public void staticOlmayanMethod(){
        boolean yeterMi=true;
//        System.out.println(sayi);
//        System.out.println(str);

    }
}
