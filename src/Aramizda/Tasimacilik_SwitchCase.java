package Aramizda;

public class Tasimacilik_SwitchCase {

    /*
        Yolcu veya Nakliye icin iki Switch case yapin
        yolcu icin
     */
    public static void main(String[] args) {

        int yolcuSayisi=3;

        int arac= yolcuSayisi<=5 ? 1  : (yolcuSayisi<=20 ? 2 : yolcuSayisi<=45?3:4);
        System.out.println("Yolcu sayisi :"+yolcuSayisi + " Size gereken arac:");

        switch (arac){
            case 1:
                System.out.println("Taksi");
            case 2:
                System.out.println("Minibüs");break;
            case 3:
                System.out.println("Otobüs");break;
            default:
                System.out.println("Cok fazla yolcu");break;

        }
    }
}
