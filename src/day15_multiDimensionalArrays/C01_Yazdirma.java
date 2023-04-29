package day15_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Yazdirma {
    public static void main(String[] args) {
        /*
            MDA'de yazdirma islemi yaparken
            yazdirmak istedigimizin ne olduguna bakmamiz gerekir
            - element ise direk yazdirabiliriz
            - tek katli bir array ise Arrays.toString() kullanabiliriz
            - MDA ise Arrays.deepToString() kullanmaliyiz
         */
        int [][] arr={{1,5,9},{3,4},{2,8,1,2},{10}};

        System.out.println(arr[0][0]); // 1
        // System.out.println(arr[3][2]); // ArrayIndexOutOfBoundsException

        System.out.println(arr.length); // 4

        System.out.println(arr[2].length); // 4

        System.out.println(arr[3].length); // 1

        // arr[2][1].length  // bir element oldugu icin length OLMAZ

        System.out.println(arr[2]); //[I@4dd8dc3 = array'in REFERANS'ini yazdirir

        System.out.println(Arrays.toString(arr[2])); //[2,8,1,2]

        System.out.println(arr); // [[I@6d03e736 array'in REFERANS'ini yazdirir(cift kare parantezle basliyor- yani bu icice iki array barindiriyor demek)

        System.out.println(Arrays.toString(arr));  //[[I@568db2f2, [I@378bf509, [I@4dd8dc3, [I@5fd0d5ae]

        System.out.println(Arrays.deepToString(arr)); // [[1, 5, 9], [3, 4], [2, 8, 1, 2], [10]]

    }
}
