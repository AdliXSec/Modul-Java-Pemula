public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraanKu = new Kendaraan();
        Mobil mobilKu = new Mobil("Toyota", 200);
        
        kendaraanKu.merek = "Honda";
        // mobilKu.merek = "Honda";
        // mobilKu.kecepatanMaks = 200;
        mobilKu.info();           // Memanggil method dari parent
        mobilKu.tampilkanDetail(); // Memanggil method sendiri
    }
}
