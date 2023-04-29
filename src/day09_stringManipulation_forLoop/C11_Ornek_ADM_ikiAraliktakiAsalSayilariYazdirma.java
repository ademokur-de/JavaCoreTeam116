package day09_stringManipulation_forLoop;

public class C11_Ornek_ADM_ikiAraliktakiAsalSayilariYazdirma {
    public static void main(String[] args) {

        int sayi1 =2;
        int sayi2 = 33;

        boolean sayiAsalMi = true;

        for (int i = sayi1; i <sayi2 ; i++) {
            sayiAsalMi = true;
            for (int j = 2; j <i ; j++) {

                if(i%j==0){
                    sayiAsalMi=false;
                    break;
                }

            }
            if(sayiAsalMi){
                System.out.println(i + " Asal sayi");
            }
        }
    }
}
