package day13_arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {


        String[] arr1= {"Ayten","Sevda","Adem"};

        //Array'i yazdirmak istersek
        // Arrays class'indan toString() kullanmaliyiz

        System.out.println(arr1); //[Ljava.lang.String;@4dd8dc3

        System.out.println(Arrays.toString(arr1));

        /*
            Koseli parantez icinde elementleri yazdirir
            Elementler arasinda bir virgül ve bir Space birakir
         */

        // bir array'in uzunluguna ulasmak istersek length kullaniriz
        // array'de kac tane element oldugunu gosterir
        // burda length method degil variable'dir, yaninda() yok

        System.out.println(arr1.length); //3

        int [] arr2 = new int[6];

        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0, 0, 0]

        arr2[0]=5;
        arr2[3]=9;
        arr2[4]=1;

        System.out.println(Arrays.toString(arr2)); //[5, 0, 0, 9, 1, 0]



    }
}
