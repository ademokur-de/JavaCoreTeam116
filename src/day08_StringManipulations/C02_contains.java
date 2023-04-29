package day08_StringManipulations;

public class C02_contains {
    public static void main(String[] args) {

        /*
        contains methodu bir yazi parcaciginin
        baska bir yazi icerisinde olup olmadigini kontrol eder
        iceriyorsa TRUE icermiyorsa FALSE verir
         */

        String str = "Java ile hersey cok kolay";

        System.out.println(str.contains("java")); // false
        System.out.println(str.contains("Java")); // true

        String arananKelime = "cok" ;

        System.out.println(str.contains(arananKelime)); // true

        String olmayanKelime = "deniz";

        System.out.println(str.contains(olmayanKelime)); // false

        System.out.println(str.contains("a"));  // true

        System.out.println(str.contains(" ")); // true

        System.out.println(str.contains("")); // true





    }
}
