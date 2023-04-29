package Aramizda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrays_001 {
    public static void main(String[] args) {
//        String [] arr={"ali","Veli","Bekir","Kemal","Derya"};
//        Arrays.sort(arr);
//        System.out.println(arr);
//        System.out.println(arr[2]);
//        System.out.println(Arrays.toString(arr));

        List<String> arr12= new ArrayList();
        arr12.add("Ali");
        arr12.add(1,"veli");
        arr12.add(2,"Murtazaa");
        arr12.add(1,"osman");
        
        System.out.println(arr12);

       // System.out.println(arr);
    }
}
