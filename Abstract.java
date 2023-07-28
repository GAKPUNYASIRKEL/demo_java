abstract class Luas {
    void hitungLuas(){};
}

class PersegiPanjang extends Luas {
    int panjang;
    int lebar;

    @Override
    void hitungLuas(){
        System.out.println("Luas persegi panjang = " + this.panjang*this.lebar);
    };

    PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
}

public class Abstract {
    public static void main(String[] args) {
        PersegiPanjang a = new PersegiPanjang(12,19);
        
        a.hitungLuas();
    }
}
