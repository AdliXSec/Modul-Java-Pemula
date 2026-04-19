public class Produk {

    // private: data inti tersembunyi
    private String kode;
    private String nama;
    private double harga;
    private int stok;
    private int totalTerjual; // internal counter

    // public constructor
    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga; 
        this.stok = stok;
        this.totalTerjual = 0;
    }

    // public getter — akses baca data
    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }
    public int getTotalTerjual() { return totalTerjual; }

    // public setter dengan validasi
    public void setHarga(double harga) {
        if (harga > 0) this.harga = harga;
        else System.out.println("Harga harus lebih dari 0!");
    }

    public void setStok(int stok) {
        if (stok >= 0) this.stok = stok;
        else System.out.println("Stok tidak boleh negatif!");
    }

    // private helper — hanya digunakan internal
    private boolean cekStokCukup(int jumlah) {
        return stok >= jumlah;
    }

    // public metode bisnis
    public boolean jual(int jumlah) {

        if (!cekStokCukup(jumlah)) { // pakai private helper
            System.out.println("Stok " + nama + " tidak cukup!");
            return false;
        }
        
        stok -= jumlah;
        totalTerjual += jumlah;
        System.out.printf("%s: Terjual %d unit. Sisa stok: %d%n",
        nama, jumlah, stok);
        return true;
    }
}
        
