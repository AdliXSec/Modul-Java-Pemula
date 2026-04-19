public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, int tahun, int jumlahPintu) {
        super(merk, tahun); // memanggil constructor Kendaraan
        this.jumlahPintu = jumlahPintu;
    }

    public void bunyikanKlakson() {
        System.out.println(merk + ": Tin! Tin!");
    }
    
    @Override
    public void info() {
        super.info(); // memanggil info() dari Kendaraan
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}