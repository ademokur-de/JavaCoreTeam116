package day24_inheritance;

public class BToyota extends Araba {
    String marka="toyota";
    String uretimYeri="Uretim yeri belirtilmedi";
    String lastik ="Toyota araclar pirelli lastikleri kullanilir";

    @Override
    public void guvenlik() {
        System.out.println("Toyota araclar extra guvenlik donanimlara sahiptir");
    }

    public void aku(){
        System.out.println("Toyota araclar inci aku kullanilir");
    }

}
