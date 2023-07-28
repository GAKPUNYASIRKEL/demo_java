class Mahasiswa {
    public String nama; // public, default, bisa dibaca dan ditulis di luar class
    protected int nim; // protected, bisa dibaca dan ditulis di luar class
    private int nilai; // private, bisa dibaca dan ditulis dalam class

    Mahasiswa(String nama, int nim, int nilai){
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    void print(){
        ubahnilai(80);
        System.out.println("Nilai \t : " + this.nilai);
    }

    private void ubahnilai(int nilaibaru){
        this.nilai = nilaibaru;
    }
}

public class Encapsulasi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Syamil Kaffah",1102210007,70);
        
        //default
        System.out.println(mahasiswa1.nama); // read
        mahasiswa1.nama = "Mujahidin Syamil"; // write
        System.out.println(mahasiswa1.nama); // read

        //publc
        System.out.println(mahasiswa1.nim); // read
        mahasiswa1.nim = 2023; // write
        System.out.println(mahasiswa1.nim); // read

        //private
        // System.out.println(mahasiswa1.nilai); // read
        // mahasiswa1.nilai = 80; // write
        // System.out.println(mahasiswa1.nilai); // read

        mahasiswa1.print();
        // mahasiswa1.ubahnilai(80);
        mahasiswa1.print();
    }
}
