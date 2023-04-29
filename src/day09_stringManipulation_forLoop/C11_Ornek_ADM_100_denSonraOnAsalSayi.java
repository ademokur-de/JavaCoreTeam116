package day09_stringManipulation_forLoop;

public class C11_Ornek_ADM_100_denSonraOnAsalSayi {
    public static void main(String[] args) {

        // verilen bir sayinin asal sayi olup olmadigini yazdirin :

        int sayi =100;
        int tur=1;

        for (int k= 1; k <=10 ; k++) {

        }
        for (int j = sayi; j <10000 ; j++) {

            boolean asalMi = true;

            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    asalMi = false;
                    break; //asal olmadigini bulunca loop tan cikmasi icin break yazdik!!
                }
            }
            if (asalMi) {
                System.out.println(tur + ". Asal Sayi = " + j);
                tur++;

            } else {
                //System.out.println("Sayi asal degil");
            }
            if (tur>10) break;
        }
    }
}
