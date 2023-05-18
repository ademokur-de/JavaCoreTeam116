package Aramizda;

public class Contructor {
    static int a=10;
    int b=3;

    public static void main(String[] args) {
        Contructor t1=new Contructor();
        Contructor t2=new Contructor();

        a +=2;
        a +=3;
        System.out.println(a);
        System.out.println(a);
        t1.aa();
        System.out.println(a);
        System.out.println(t1.b);

    }
    public void aa(){
        Contructor obj1= new Contructor();
        a++;
        obj1.b=5;
        System.out.println("Metod -aa- icindeki objede b degeri :" +obj1.b);
    }
}
