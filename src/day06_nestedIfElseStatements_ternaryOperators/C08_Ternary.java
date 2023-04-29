package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);

        System.out.println("Lütfen notunuzu giriniz :");
        double not= scanner.nextDouble();

        System.out.println(not>=50 ? "Sinifi Gectin" : " Maalesef Kaldin!");

    }
}
