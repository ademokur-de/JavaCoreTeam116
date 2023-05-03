package day22_stringBuilder_accessModifier;

public class C02_StringBuilderMethodlari {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java candir");

        sb1.append(".");

        System.out.println(sb1);// Java candir.

        String str ="Bu gun hava cok guzel";

        sb1.append(str,2,6); // string e sonundan itibaren ekleme yapar
        System.out.println(sb1); //Java candir. gun

        sb1.replace(0,4,"Selenium"); //belirtilen araligi istenen metinle degistirir
        System.out.println(sb1);// Selenium candir. gun

        sb1.insert(9,"heye"); // araya ekleme yapar
        System.out.println(sb1); //Selenium heyecandir. gun

        sb1.insert(0,str,0,3); // herhangi bir metnin(str) belli bir parcasini araya eklemek :
        System.out.println(sb1); //Bu Selenium heyecandir. gun

        sb1.delete(23,27); // metinden bir araligi silmek
        System.out.println(sb1); //Bu Selenium heyecandir.

        int indexC=sb1.indexOf("c");
        sb1.deleteCharAt(indexC);
        System.out.println(sb1); //Bu Selenium heyeandir.





    }
}
