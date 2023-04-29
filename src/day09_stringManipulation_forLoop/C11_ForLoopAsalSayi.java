package day09_stringManipulation_forLoop;

public class C11_ForLoopAsalSayi {
    public static void main(String[] args) {

        // verilen bir sayinin asal sayi olup olmadigini yazdirin :

        int sayi =289;

        boolean asalMi = true;

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                asalMi=false;
                break; //asal olmadigini bulunca loop tan cikmasi icin break yazdik!!
            }
        }
        if (asalMi){
            System.out.println("Sayi asal");

        }else {
            System.out.println("Sayi asal degil");
        }
    }
}
