package day24_inheritance;

public class FCorolla extends EToyota{
    FCorolla(){
        System.out.println("Corolla constructor calisti");
    }
    String str="Corolla";
    String modelCorolla="Corolla";

    public static void main(String[] args) {

        FCorolla corolla=new FCorolla();
        System.out.println(corolla.modelCorolla);
        System.out.println(corolla.markaToyota);
        System.out.println(corolla.motorAraba);
        System.out.println(corolla.str); // Corolla


    }
}
/*
    Bir obje olusturuldugunda Constructor calisir ve
    class level'da var olan variable'larin
    bir kopyasi olusturulup objeye ilisiklendirilir.

    Bir class'da gorunur bir constructor yoksa o class'da default constructor vardir.

    Java inheritance'da obje olusturuldugunda parent class'lardaki
    constructor'larin ilk satirinda gorunur bir constructor call yoksa

 */
