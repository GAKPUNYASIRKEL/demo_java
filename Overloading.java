class Murid {
    String nama;
    static int jumlahMurid;

    Murid(String nama){
        Murid.jumlahMurid++;
        this.nama = nama;
    }

    Murid(){
        Murid.jumlahMurid++;
        this.nama = "player" + Murid.jumlahMurid;
    }

    void show(){
        System.out.println("Nama \t : " + this.nama);
    }
}

public class Overloading {
    public static void main(String[] args) {
        //overloading costructor
        Murid murid1 = new Murid("Bagus");
        Murid murid2 = new Murid();
        Murid murid3 = new Murid();
        Murid murid4 = new Murid("Leno");

        murid1.show();
        murid2.show();
        murid3.show();
        murid4.show();

        //overloading method
        int a = Overloading.tambah(1,19);
        System.out.println(a);
        double b = Overloading.tambah(1,0.98);
        System.out.println(b);
    }
    public static int tambah(int x, int y){
        return x + y;
    }
    public static double tambah(int x, double y){
        return (double)x + y;
    }
}
