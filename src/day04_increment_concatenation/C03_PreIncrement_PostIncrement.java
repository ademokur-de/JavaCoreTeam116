package day04_increment_concatenation;

import java.util.Scanner;

public class C03_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        int a = 10;

        System.out.println(a++); // 10

        System.out.println(a); // 11

        System.out.println(++a); // 12

        System.out.println(a);

        int b = a++;

        System.out.println("a : " + a + ", b : " + b);  // a : 13 , b : 12

        a = --b;

        System.out.println("a : " + a + ", b : " + b);  // a : 11 , b : 11

        int c = a++ +
                ++b;

        System.out.println("a : " + a + ", b : " + b + ", c " + c);  // a : 12 , b : 12 , c : 23

        int x=20;

        System.out.println(--x); // 19  ( x = 19 )

        System.out.println(x++); // 19  ( x = 20 )

        System.out.println(++x);  // 21  ( x = 21 )

        int y = ++x;

        System.out.println("x : " + x + ", y : " + y); // x : 22 , y : 22

        y = x++ ;

        System.out.println("x : " + x + ", y : " + y); // x : 22 , y : 21

        System.out.println(x++ + ++y); // 44 ( x=23, y = 22)




    }
}
