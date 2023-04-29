package day08_StringManipulations;

public class C06_lastIndexOf {
    public static void main(String[] args) {

        String str = "Java cok faydali";

        System.out.println(str.lastIndexOf("a"));  // 13
        System.out.println(str.lastIndexOf("a" , 10));  // 10
        System.out.println(str.lastIndexOf("a" , 12));  // 10

        System.out.println(str.indexOf("a"));  // 1
        System.out.println(str.lastIndexOf("a"));  // 13
        System.out.println(str.lastIndexOf("a",2));  //1
        System.out.println(str.lastIndexOf("a",1));  //1

        System.out.println(str.indexOf("o"));  // 6
        System.out.println(str.lastIndexOf("o"));  // 6

        System.out.println(str.indexOf("cok"));  // 5
        System.out.println(str.lastIndexOf("cok"));  // 5

        //char da aratabiliriz

        System.out.println(str.indexOf('k'));  // 7
        System.out.println(str.lastIndexOf('k'));  // 7

        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 1'den fazla kullanilmis
        // 3- aradiginiz kelime cumlede hic kullanilmamis

        String str1 = "Java cok kolay";
        String str2 = "cok";

//        if (str1.indexOf(str2)==-1){
//            System.out.println("Aradiginiz kelime hic kullanilmamis");
//        } else if (str1.indexOf(str2)==str1.lastIndexOf(str2)) {
//            System.out.println("Aradiginiz kelime cumlede 1 kez kullanilmis");
//        }else {
//            System.out.println("Aradiginiz kelime cumlede 1 den fazla kullanilmis");
//        }

        // YA DA Su sekilde yapabiliriz:


        int bastanIndex=str1.indexOf(str1);
        int sondanIndex=str1.lastIndexOf(str2);

        if (bastanIndex==-1){
            System.out.println("Aradiginiz kelime hic kullanilmamis");
        } else if (bastanIndex==sondanIndex){
            System.out.println("Aradiginiz kelime cumlede 1 kez kullanilmis");
        }else {
            System.out.println("Aradiginiz kelime cumlede 1 den fazla kullanilmis");
        }

    }
}
