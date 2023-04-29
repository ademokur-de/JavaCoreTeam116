package day13_arrays;

public class C03_ArrayinElemanlariniToplama {
    public static void main(String[] args) {

        // verilen int[]'in tüm elementlerini toplayip
        // sonucu yazdiran method olusturun


        int[] arr = {2, 4, 6, 8, 1, 3, 8, 2};

        elemanlarinToplaminiYazdir(arr);
    }

    public static void elemanlarinToplaminiYazdir(int[] arr){

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            toplam+=arr[i];

        }
        System.out.println(" Array'deki elementlerin toplami : " + toplam);

    }
}
