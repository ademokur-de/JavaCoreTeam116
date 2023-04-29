package day04_increment_concatenation;

public class C04_Concatenation {
    public static void main(String[] args) {

        String s1 = "Java;";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";

        int i1 = 3;
        int i2 = 4 ;

        s1.startsWith("e",4);

        //Sadece bu variable'lari kullanarak
        // asagida verilen metinleri yazdirin

        // 34 Java

        System.out.println(s4+i1+i2+s3+s1);

        //Java 34

        System.out.println(s1+s3+i1+i2);

        // Java Candir

        System.out.println(s1+s3+s2);
    }
}
