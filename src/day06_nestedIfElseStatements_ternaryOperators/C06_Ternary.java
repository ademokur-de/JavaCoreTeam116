package day06_nestedIfElseStatements_ternaryOperators;

public class C06_Ternary {
    public static void main(String[] args) {

        // Verilen sayi pozitif ise degerini iki katina cikarin
        // pozitif degil ise degerini 10 artirin

        int sayi = 10;

        sayi = sayi >0 ? 2*sayi : sayi+10;
        System.out.println(sayi);


    }
}
