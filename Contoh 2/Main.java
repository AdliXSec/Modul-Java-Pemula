public class Main {
    public static void main(String[] args) {
        Produk p = new Produk("P001", "Laptop", 8500000, 10);

        p.jual(3);
        p.jual(8); // gagal, stok kurang
        p.setHarga(-100); // ditolak, harga negatif
        p.setHarga(9000); // berhasil

        System.out.println("Harga : Rp" + p.getHarga());
        System.out.println("Stok : " + p.getStok());
        System.out.println("Terjual: " + p.getTotalTerjual() + " unit");
    }
}
