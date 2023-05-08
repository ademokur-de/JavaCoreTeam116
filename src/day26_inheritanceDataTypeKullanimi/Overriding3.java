package day26_inheritanceDataTypeKullanimi;

public class Overriding3 extends Overriding2{

    public void method1(){
        System.out.println("Overriding3 method1");
    }

    public static void main(String[] args) {
        Overriding3 obj1=new Overriding3();
        obj1.method1(); //Overriding3 method1
        obj1.method2(); //Overriding2 method2

        Overriding2 obj2=new Overriding3();
        obj2.method1(); //Overriding3 method1
        obj2.method2(); //Overriding2 method2

        Overriding1 obj3=new Overriding3();
        obj3.method1(); //Overriding3 method1
        obj3.method2(); //Overriding2 method2

        Overriding1 obj4=new Overriding1();
        obj4.method1(); //Overriding1 method1
        obj4.method2(); //Overriding1 method2
    }
}
