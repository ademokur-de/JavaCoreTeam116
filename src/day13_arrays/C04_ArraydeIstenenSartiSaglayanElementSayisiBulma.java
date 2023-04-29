package day13_arrays;

public class C04_ArraydeIstenenSartiSaglayanElementSayisiBulma {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 1, 3, 7, 5};

        // Array'de kac tane cift sayi var buldurun:

        int sayac =0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                sayac++;

            }

        }
        System.out.println("Verilen Array'deki cift sayi adedi : " + sayac);

        // array'de 3 ile bölünebilen kac sayi oldugunu yazdirin

        sayac=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0) {

                sayac++;
            }

        }
        System.out.println("Verilen array'deki 3 ile tam bölünebilen sayi adedi : "+sayac);

        // verilen array'de 4 ile 8 (sinirlar dahil) arasinda kac sayi oldugunu yazdirin

        sayac=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]<=8 && arr[i]>=4){
                sayac++;
            }

        }

        System.out.println("Verilen array'de istenen araliktaki sayi adedi : " + sayac);
    }
}
