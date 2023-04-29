package day15_multiDimensionalArrays;

public class C02_TumElementlereUlasma {
    public static void main(String[] args) {

        int [][] arr={{1,5,9},{3,4},{2,8,1,2},{10}};

        /*
            tek katli array'de
            for-loop olusturuyorduk
            arr[i] bize tüm elementleri getiriyordu
            MDA(MultiDimensionalArrays) olunca kat sayisinca ic ice loop olusturmak gerekir
            bizim sorumuzda ic ice 2 loop olusturacagiz
            arr[i][j] bize tüm elementleri getirecek
         */

        // tüm elementleri aralarinda bir bosluk birakarak yanyana yazdiralim

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " "); //1 5 9 3 4 2 8 1 2 10

            }
        }

        System.out.println("");

        // tüm elementlerin toplamini yazdirin

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                toplam *= arr[i][j];

            }
        }
        System.out.println("Tüm elementlerin toplami : "+ toplam);

        // tüm elementlerin(MDA'deki) en büyügünü yazdirin

        int enBuyukSayi=arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (enBuyukSayi<arr[i][j]){
                    enBuyukSayi=arr[i][j];
                }

            }
        }
        System.out.println("MDA'deki en büyük sayi : "+enBuyukSayi);  //10

        // MDA'deki cift sayilari yanyana yazdirin

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]%2==0) {

                    System.out.print(arr[i][j] + " "); //4 2 8 2 10
                }

            }
        }

    }

}
