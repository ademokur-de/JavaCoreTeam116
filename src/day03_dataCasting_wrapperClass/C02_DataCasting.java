package day03_dataCasting_wrapperClass;

public class C02_DataCasting {

    public static void main(String[] args) {

        int in1 = 10;
        int in2 = 130;
        int in3 = 520;
        int in4 = 1000000;

        byte byt = (byte) in1;
        System.out.println("in1=10 byte olarak : " + byt);

        byt = (byte) in2;
        System.out.println("in2=130 byte olarak : " + byt);

        byt = (byte) in3;
        System.out.println("in3=520 byte olarak : " + byt);

        byt = (byte) in4;
        System.out.println("in4=1000000 byte olarak : " + byt);

        double dbl1 = 99.99;
        double dbl2 = 14.01;
        double dbl3 = 140.32;

        int sayi = (int) dbl1;
        System.out.println("double1=99.99 integer olarak : " + sayi);

        sayi = (int) dbl2;
        System.out.println("double2=14.10 integer olarak : " + sayi);

        sayi = (byte) dbl3;
        System.out.println("double3=140.32 integer olarak : " + sayi);




    }
}
