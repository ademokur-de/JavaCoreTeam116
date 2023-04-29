package day08_StringManipulations;

public class C03_startsWith_endsWith {
    public static void main(String[] args) {


        String str = "Java cok eglenceli";

        System.out.println(str.startsWith("java")); // false

        System.out.println(str.startsWith("Java")); // true

        System.out.println(str.startsWith(str)); // true

        System.out.println(str.startsWith("")); // true

        System.out.println("====================="); // ara cizgisi verdik!

        System.out.println(str.endsWith("a")); // false

        System.out.println(str.endsWith("eglenceli")); // true

        System.out.println(str.endsWith("celi")); // true

        System.out.println(str.endsWith("Java cok eglenceli")); // true

        System.out.println(str.length()); // 18

        System.out.println(str.substring(str.length() - 3));

        System.out.println(str.endsWith(str.substring(str.length() - 3))); // true


    }
}
