class Nenek {
    String warnaKulit = "Putih"; 
    String rambut = "Lurus";
    void show1() { 
        System.out.println("Gen dari Nenek"); 
    }
}

class Ibu extends Nenek {
    
    void show2() { 
        System.out.println("Gen dari Ibu");
    }
}
class Anak extends Ibu {
    
    void show3() { 
        System.out.println("Gen dari Anak"); 
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Ibu ibu = new Ibu();
        //mewarisi gen ibu
        System.out.println("Genetik Ibu");
        System.out.println("Warna Kulit\t : " + ibu.warnaKulit);
        System.out.println("Rambut \t\t : " + ibu.rambut);
        ibu.show1();
        ibu.show2();


        Anak anak = new Anak();
        //mewarisi gen ibu dan nenek
        System.out.println("\nGenetik Anak");
        System.out.println("Warna Kulit\t : " + anak.warnaKulit);
        System.out.println("Rambut \t\t : " + anak.rambut);
        anak.show1();
        anak.show2();
        anak.show3();
    }
}
