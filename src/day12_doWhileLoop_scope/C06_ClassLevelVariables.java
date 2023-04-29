package day12_doWhileLoop_scope;

public class C06_ClassLevelVariables {
    /*
            Bir class'in tamaminda gecerli variable'lar olusturmak istersek
            bu variable'lari class level'da olustururuz
            yani class'in icnde ama method'larin disinda olustururuz

            bu variable'larin en üstte olmasi sart degildir
            ancak genel kullanimda class variable'lar
            class'in en üst kisminda olusturulur

            class level variable'lar static ve static olmayan (instance) seklinde
            iki farkli sekilde olusturulabilir

            static variable'lar "static" klübüne üye olduklari icin
            tüm method'lara gidebilir ve tüm method'larda kullanilabilirler

            instance variable'lar static olmadiklari icin
            bu defa karar verici olarak method'lar devreye girer
         */

    static int sayi = 10 ; // static variable -- class level
    String str = "Java" ; // instance variable -- class level
    public static void main(String[] args) {

        sayi =20;
        System.out.println(sayi);  //20

        // System.out.println(str);
        // static olmayan bir variable, static alandan kullanilamaz
    }

    public static void staticMethod(){
        sayi=30;
        // str="Tava";
        // static olmayan bir variable, static alandan kullanilamaz

    }
    public void staticOlmayanMethod(){
        sayi=40;
        System.out.println("Static olmayan method da sayi : " + sayi);

        str = "hava";
        // method static degil, variable da static degil

    }
}
