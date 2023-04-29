package Aramizda;

public class SwitchCase01 {
    public static void main(String[] args) {
        /*
        Haftanin gunlerini sayi ile alip yazdirin
         */

        String kisaGun="Krt";

        switch (kisaGun){
            case "Pzt":
               System.out.println("Pazartesi");break;
            case "Sal":
                System.out.println("Sali");break;
            case "Car":
                System.out.println("Carsamba");break;
            case "Per":
                System.out.println("Persembe");break;
            case "Cum":
                System.out.println("Cuma");break;
                //System.out.println("Hafta ici");break;
            case "Cmt":
                System.out.println("Cumartesi");break;
            case "Paz":
                System.out.println("Pazar");break;
                //System.out.println("Haftasonu");break;
            default:
                System.out.println("Hatali giris");

        }
    }
}
