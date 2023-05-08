package day26_inheritanceDataTypeKullanimi;

public class CAvciKuslar extends BKuslar{
    String hareket= "ucarlar";
    String beslenme= "et yerler";
    String pence= "pencelidir";
    String gaga= "sivri gagali";

    public static void main(String[] args) {
        CAvciKuslar avci1= new CAvciKuslar();

        System.out.println(avci1.beslenme);
        System.out.println(avci1.cogalma);
        System.out.println(avci1.gaga);
        System.out.println(avci1.hareket);
        System.out.println(avci1.pence);
        System.out.println(avci1.kanat);
        System.out.println(avci1.omur);
        System.out.println(avci1.solunum);


        BKuslar avciKusgiller = new CAvciKuslar();
        // AvciKuslar is-a Kuslar

        System.out.println(avciKusgiller.beslenme);
        System.out.println(avciKusgiller.cogalma);
        System.out.println(avciKusgiller.gaga);
        System.out.println(avciKusgiller.hareket);
//      System.out.println(avciKusgiller.pence); CTE
        System.out.println(avciKusgiller.kanat);
        System.out.println(avciKusgiller.omur);
        System.out.println(avciKusgiller.solunum);

        AHayvan avciHayvangiller = new CAvciKuslar();
        //AvciKuslaris-a Hayvan

        System.out.println(avciHayvangiller.beslenme);
        System.out.println(avciHayvangiller.cogalma);
//      System.out.println(avciHayvangiller.gaga); CTE
        System.out.println(avciHayvangiller.hareket);
//      System.out.println(avciHayvangiller.pence); CTE
//      System.out.println(avciHayvangiller.kanat); CTE
        System.out.println(avciHayvangiller.omur);
        System.out.println(avciHayvangiller.solunum);

    }
}
