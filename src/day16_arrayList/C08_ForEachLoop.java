package day16_arrayList;

public class C08_ForEachLoop {
    /*
       Soru 2- Verilen int array’deki her elementin karelerini alip,
                karelerinin toplamini yazdiran bir method olusturun.

     */
    public static void main(String[] args) {

        int[] arr ={5,10,25,4,3,4};
        arrKareleriniTopla(arr);
    }
    public static void arrKareleriniTopla(int [] arr){

        int toplam=0;
        for ( int each:arr){
            toplam=toplam+each*each;
        }
        System.out.println("Array'in elemanlarinin kareleri toplami : " +toplam);
    }
}
