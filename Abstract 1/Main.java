
abstract class BangunDatar {

    String warna;

    public BangunDatar(String warna) {
        this.warna = warna;
    }

    public void deskripsi() {
        System.out.println("Ini adalah bangun datar berwarna " + warna);
    }

    abstract double hitungLuas();
}

class Lingkaran extends BangunDatar {

    double jariJari;

    public Lingkaran(String warna, double jariJari) {
        super(warna); // Memanggil constructor dari superclass (BangunDatar)
        this.jariJari = jariJari;
    }

    @Override
    double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}

class PersegiPanjang extends BangunDatar {

    double panjang;
    double lebar;

    public PersegiPanjang(String warna, double panjang, double lebar) {
        super(warna);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double hitungLuas() {
        return panjang * lebar;
    }
}

public class Main {

    public static void main(String[] args) {
        BangunDatar bentuk1 = new Lingkaran("Merah", 7.0);
        BangunDatar bentuk2 = new PersegiPanjang("Biru", 5.0, 4.0);

        bentuk1.deskripsi();
        System.out.println("Luas Lingkaran: " + bentuk1.hitungLuas());

        System.out.println("--------------------");

        bentuk2.deskripsi();
        System.out.println("Luas Persegi Panjang: " + bentuk2.hitungLuas());
    }
}
