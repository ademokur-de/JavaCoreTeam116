package day10_nestedForLoop_methodOlusturma;

public class C12_FaktoryelSonucDondurme {
    public static void main(String[] args) {

        System.out.println(faktoryelDegeriDondur(6));

        int yediFaktoryel=faktoryelDegeriDondur(7);
        System.out.println("7! =" + yediFaktoryel);

    }

    public static int faktoryelDegeriDondur(int sayi) {

        int faktoryel = 1;
        for (int i = sayi; i >= 1; i--) {
            faktoryel *= i;
        }

        return faktoryel;

    }
}
