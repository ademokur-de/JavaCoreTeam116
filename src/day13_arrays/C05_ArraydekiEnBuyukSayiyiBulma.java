package day13_arrays;

public class C05_ArraydekiEnBuyukSayiyiBulma {
    public static void main(String[] args) {

        // Verilen int array'deki en büyük sayiyi döndüren method olusturun

        int[] arr = {2, 4, 6, 8, 1, 3, 7, 5};

        System.out.println(enBuyukSayi(arr));
    }

    public static int enBuyukSayi(int[] arr){
        int buyuk=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>buyuk){
                buyuk=arr[i];
            }
        }
        return buyuk;
    }
}
